/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.HibernateException;
import org.hibernate.property.PropertyAccessor;
import org.hibernate.property.PropertyAccessorFactory;
import org.hibernate.transform.ResultTransformer;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.Set;
import java.util.stream.Collectors;
import javax.persistence.Id;
/**
 *
 * @author Carlos
 */
public class MultiResultTransformer implements ResultTransformer{
	
    private final Class<?> resultClass;
    private final String ALIAS_SEPARATOR = ".";

    private Integer indexId;
    private final PropertyAccessor accessor;
    private final Map<String, Object> registros;
    private final Map<String, Object> instancia;


    public MultiResultTransformer(Class resultClass) {
        this.resultClass = resultClass;
        this.registros = new HashMap<>();
        this.instancia = new HashMap<>();

        this.indexId = null;
        this.accessor = PropertyAccessorFactory.getPropertyAccessor("property");

    }
	
    /**
     * Convierte un tupla resultante al objeto especifico
     * @param valores
     * @param nombresAtributos
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public Object transformTuple(Object[] valores, String[] nombresAtributos) {
        if (indexId == null){
            indexId = obtenerIndexIndentificador(resultClass, nombresAtributos);
        }
        registros.clear();
        if(instancia.containsKey("" + valores[indexId])){
            for (int i = 0; i < nombresAtributos.length; i++){ 
                if(nombresAtributos[i].contains(ALIAS_SEPARATOR)){
                    if (tieneAtributoLista(resultClass, nombresAtributos[i])){
                        registros.put(nombresAtributos[i], valores[i]); 
                    }
                }
            }
            agregarObjeto(instancia.get("" + valores[indexId]), registros);
        }else{
            for (int i = 0; i < nombresAtributos.length; i++) {
                registros.put(nombresAtributos[i], valores[i]);
            }
            instancia.put("" + valores[indexId], 
                crearObjeto(resultClass, registros)
            );
            return instancia.get("" + valores[indexId]);
        }
        return null;
    }
    
    /**
     * Agrega los resultados a las lsitas del objeto resultado
     * @param objeto
     * @param registros 
     */
        @SuppressWarnings("empty-statement")
    private void agregarObjeto(Object objeto, Map<String, Object> registros){    
        // Recorre los atibutos subClass
        Map<String, Map<String, Object>> subClassAtributos = new HashMap<>();
        registros.entrySet().forEach(registro -> {
            int indexSeparador = registro.getKey().indexOf(this.ALIAS_SEPARATOR);
            String nombreAtributo = registro.getKey().substring(0, indexSeparador);
            String nombreAtributoClass = registro.getKey().substring(indexSeparador + 1);
            if(subClassAtributos.containsKey(nombreAtributo)){
                Map<String, Object> atributos = subClassAtributos.get(nombreAtributo);
                atributos.put(nombreAtributoClass, registro.getValue());
            }else{
                Map<String, Object> atributos = new HashMap<>();
                atributos.put(nombreAtributoClass, registro.getValue());
                subClassAtributos.put(nombreAtributo, atributos);
            }
        });
        
        // Recorre los atibutos subClass
        subClassAtributos.entrySet().forEach((subClassAtributo) -> {
            Field atributo = obtenerFieldModel(objeto.getClass(), subClassAtributo.getKey());
            Map <String, Object> valores = subClassAtributo.getValue();
            if (atributo.getType().equals(List.class)) {
                List<Object> lista = (List<Object>) accessor
                        .getGetter(objeto.getClass(), subClassAtributo.getKey())
                        .get(objeto);
                Class subClass = lista.get(0).getClass();
                String nombreIdentificador = obtenerNombreIndentificador(subClass, valores.keySet());
                Object subObject = buscarSubObject(nombreIdentificador, lista, valores.get(nombreIdentificador));
                filtrarAtributosLista(subClass, valores);
                if(subObject == null){
                    lista.add(crearObjeto(subClass, valores));
                }else{
                    agregarObjeto(subObject, valores);
                }
            } else {
                Object subObject = (Object) accessor
                        .getGetter(objeto.getClass(), subClassAtributo.getKey())
                        .get(objeto);
                agregarObjeto(subObject, valores);
            }
        });
    }
    
    /**
     * Crea el objeto reultado
     * @param modelo
     * @param registros
     * @return 
     */
    private Object crearObjeto(Class modelo, Map<String, Object> registros){
        Object objetoResult = null;
        try {
            objetoResult = modelo.newInstance();
            Map<String, Map<String, Object>> subClassAtributos = new HashMap<>();
            for(Map.Entry<String, Object> registro: registros.entrySet()){
                if(registro.getKey().contains(this.ALIAS_SEPARATOR)){
                    int indexSeparador = registro.getKey().indexOf(this.ALIAS_SEPARATOR);
                    String nombreAtributo = registro.getKey().substring(0, indexSeparador);
                    String nombreAtributoClass = registro.getKey().substring(indexSeparador + 1);
                    if(subClassAtributos.containsKey(nombreAtributo)){
                        Map<String, Object> atributos = subClassAtributos.get(nombreAtributo);
                        atributos.put(nombreAtributoClass, registro.getValue());
                    }else{
                        Map<String, Object> atributos = new HashMap<>();
                        atributos.put(nombreAtributoClass, registro.getValue());
                        subClassAtributos.put(nombreAtributo, atributos);
                    }
                }else{
                    accessor.getSetter(modelo, registro.getKey())
                            .set(objetoResult, registro.getValue(), null);
                }
            }
            
            // Recorre los atibutos subClass
            for (Map.Entry<String, Map<String, Object>> subClassAtributo : subClassAtributos.entrySet()) {
                Field atributo = obtenerFieldModel(modelo, subClassAtributo.getKey());
                Object resultSubClass;
                if(atributo.getType().equals(List.class)){
                    Class subClass = (Class)((ParameterizedType) atributo.getGenericType())
                            .getActualTypeArguments()[0];     
                    List<Object> listaSubClass = new ArrayList<>();
                    listaSubClass.add(crearObjeto(subClass, subClassAtributo.getValue()));
                    resultSubClass = listaSubClass;
                }else{
                    resultSubClass = crearObjeto(atributo.getType(), subClassAtributo.getValue());
                }
                // Agrega el resultado al modelo
                accessor.getSetter(modelo, subClassAtributo.getKey())
                        .set(objetoResult, resultSubClass, null);
            }
            
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new HibernateException("No se pudo instanciar la clase: " + modelo.getName());
        } 
        return objetoResult;
    }  
    
    /**
     * Filtra los atributos de la lista. 
     * @param modelo
     * @param nombresAtributos 
     */
    private void filtrarAtributosLista(Class modelo, Map<String, Object> nombresAtributos ){
        nombresAtributos.forEach((key, value) -> {
           if(key.contains(this.ALIAS_SEPARATOR)){
                if (this.tieneAtributoLista(modelo, key)){
                   nombresAtributos.remove(key); 
                }
            } 
        });
    }
    
    /**
     * Busca si yase agrego el proucto
     * @param nombreIdentificar
     * @param lista
     * @param identificador
     * @return 
     */
    private Object buscarSubObject(String nombreIdentificar, List<Object> lista, Object identificador){
        for (Object obj: lista) {
           Field atributo = obtenerFieldModel(obj.getClass(), nombreIdentificar);
            Object valor = accessor.getGetter(obj.getClass(), nombreIdentificar).get(obj);
            if(valor.equals(identificador)){
                return obj;
            }
        }
        return null;
    }
    /**
     * Verifica si es atributo de tipo lista
     * @param modelo
     * @param nombreAtributo
     * @return 
     */
    private boolean tieneAtributoLista(Class modelo, String nombreAtributo){
        Class current = modelo;
        String[] nombresSubClass = nombreAtributo.split("\\" + this.ALIAS_SEPARATOR);
        for (String nombreSubClass : nombresSubClass) {
            Field atributo = obtenerFieldModel(current, nombreSubClass);
            if(atributo.getType().equals(List.class)){
               return true;
            }else{
                current = atributo.getType();
            }
        }
        return false;
    }
    
     /**
     * Verifica si es atributo de tipo lista
     * @param modelo
     * @param nombreAtributo
     * @return 
     */
    private boolean esAtributoLista(Class modelo, String nombreAtributo){
        Class current = modelo;
        String[] nombresSubClass = nombreAtributo.split("\\" + this.ALIAS_SEPARATOR);
        for (String nombreSubClass : nombresSubClass) {
            Field atributo = obtenerFieldModel(current, nombreSubClass);
            if(atributo.getType().equals(List.class)){
               return true;
            }else{
                current = atributo.getType();
            }
        }
        return false;
    }
    /**
     * Obtiene el index del identificador
     * @param modelo
     * @param nombresAtributos
     * @return 
     */
    private int obtenerIndexIndentificador(Class modelo, String[] nombresAtributos){
        for (int i = 0; i < nombresAtributos.length; i++) {
            if (!nombresAtributos[i].contains(this.ALIAS_SEPARATOR)) {
                if(verificarAtributoIdentificador(modelo, nombresAtributos[i])){
                    return i;
                }
            }
        }
        throw new HibernateException("EL modelo " + modelo.getSimpleName() + " no tiene el atributo identficador.");
    }
    
    /**
     * Obtiene el nombre del atributo identificador
     * @param modelo
     * @param nombresAtributos
     * @return 
     */
    private String obtenerNombreIndentificador(Class modelo, Set<String> nombresAtributos){
        for (String nombresAtributo : nombresAtributos) {
           if (!nombresAtributo.contains(this.ALIAS_SEPARATOR)) {
                if(verificarAtributoIdentificador(modelo, nombresAtributo)){
                    return nombresAtributo;
                }
            } 
        }
        throw new HibernateException("EL modelo " + modelo.getSimpleName() + " no tiene el atributo identficador.");
    }
    
    /**
     * Verifica si el atributo es identificador
     * @param model
     * @param nombreAtributo
     * @return 
     */
    private boolean verificarAtributoIdentificador(Class<?> model, String nombreAtributo){    
        return obtenerFieldModel(model, nombreAtributo)
                .getAnnotation(Id.class) != null;
    }
    
    /**
     * Busca el filed declarado en la clase
     * @param modelo
     * @param nombreAtributo
     * @return 
     */
    private Field obtenerFieldModel(Class<?> modelo, String nombreAtributo){
        Class current = modelo;
        do {
            try {
                return current.getDeclaredField(nombreAtributo);
            } catch (NoSuchFieldException ex) {
                current = current.getSuperclass();
            }
        } while(current != null);
        throw new HibernateException("EL modelo " + modelo.getSimpleName() + " no tiene el atributo [ " + nombreAtributo + " ]");
    } 
    
    @Override
    public List transformList(List lista) {
        return (List) lista.stream().filter((object) -> (object != null)).collect(Collectors.toList());
    }
    
}
