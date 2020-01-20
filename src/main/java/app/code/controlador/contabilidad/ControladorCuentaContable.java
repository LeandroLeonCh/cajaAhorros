/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.contabilidad;

import app.code.common.MultiResultTransformer;
import app.code.modelo.contabilidad.CuentaContable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;

/**
 *
 * @author fanny
 */
public class ControladorCuentaContable {

    private final SessionFactory sessionFactory;

    public ControladorCuentaContable(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getCurrentSession() {
        return sessionFactory.openSession();
    }

    public boolean guardarCuentaContable(CuentaContable cuenta) {
        Session session = getCurrentSession();
        try {
            return cuenta.guardar(session);
        } finally {
            session.close();
        }
    }

    public CuentaContable buscarCuentaContable(Long id) {
        Session session = getCurrentSession();
        try {
            // Arma el query y los joins
            Criteria criteria = session.createCriteria(CuentaContable.class, "CUE")
                    .createAlias("CUE.tipoCuenta", "TIP", JoinType.INNER_JOIN)
                    .createAlias("CUE.cuentaPadre", "CUEP", JoinType.INNER_JOIN);

            // Agrego las columnas que quiero obtener
            criteria.setProjection(Projections.projectionList()
                    .add(Projections.property("CUE.id"), "id")
                    .add(Projections.property("CUE.activo"), "activo")
                    .add(Projections.property("CUE.codigo"), "codigo")
                    .add(Projections.property("CUE.nombre"), "nombre")
                    .add(Projections.property("CUE.descripcion"), "descripcion")
                    .add(Projections.property("TIP.id"), "tipoCuenta.id")
                    .add(Projections.property("TIP.nombre"), "tipoCuenta.codigo")
                    .add(Projections.property("TIP.nombre"), "tipoCuenta.nombre")
                    .add(Projections.property("CUEP.id"), "cuentaPadre.id")
                    .add(Projections.property("CUEP.activo"), "cuentaPadre.activo")
                    .add(Projections.property("CUEP.codigo"), "cuentaPadre.codigo")
            );
            // Agrega el tipo de resultado a retornar
            criteria.setResultTransformer(new MultiResultTransformer(CuentaContable.class));
            return (CuentaContable) criteria.uniqueResult();
        } finally {
            session.close();
        }
    }

    public List<CuentaContable> obtenerCuentasContablePorRango(String criterio, int maxResultados, int primerResultado) {
        return obtenerCuentasContablePorRango(criterio, maxResultados, primerResultado, false);
    }

    public List<CuentaContable> obtenerCuentasContablePorRango(String criterio, int maxResultados, int primerResultado, boolean activos) {
        Session session = getCurrentSession();
        try {
            // Arma el query y los joins
            Criteria criteria = session.createCriteria(CuentaContable.class, "CUE")
                    .createAlias("CUE.tipoCuenta", "TIP", JoinType.INNER_JOIN);

            // Agrego las columnas que quiero obtener
            criteria.setProjection(Projections.projectionList()
                    .add(Projections.property("CUE.id"), "id")
                    .add(Projections.property("CUE.activo"), "activo")
                    .add(Projections.property("CUE.codigo"), "codigo")
                    .add(Projections.property("CUE.nombre"), "nombre")
                    .add(Projections.property("CUE.descripcion"), "descripcion")
                    .add(Projections.property("TIP.id"), "tipoCuenta.id")
                    .add(Projections.property("TIP.nombre"), "tipoCuenta.nombre")
            );
            if (activos) {
                criteria.add(Restrictions.eq("CUE.activo", true));
            }
            // Agrega los criterios de busqueda
            criteria.add(Restrictions.or(
                    Restrictions.ilike("CUE.codigo", "%" + criterio + "%"),
                    Restrictions.ilike("CUE.nombre", "%" + criterio + "%"))
            );

            // Agrega el tipo de resultado a retornar
            criteria.setResultTransformer(new MultiResultTransformer(CuentaContable.class));

            // Retorna el resultado del query
            return criteria.setMaxResults(maxResultados)
                    .setFirstResult(primerResultado)
                    .list();
        } finally {
            session.close();
        }
    }
}
