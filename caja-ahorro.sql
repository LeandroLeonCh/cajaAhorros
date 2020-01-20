-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-12-2019 a las 05:35:40
-- Versión del servidor: 10.4.8-MariaDB-log
-- Versión de PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistema-caja-ahorro`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bg_asiento_detalle`
--

CREATE TABLE `bg_asiento_detalle` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `debe` double DEFAULT NULL,
  `haber` double DEFAULT NULL,
  `activo` double DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `cue_con_id` int(11) DEFAULT NULL,
  `com_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bg_catalogo`
--

CREATE TABLE `bg_catalogo` (
  `id` int(11) NOT NULL,
  `codigo` int(11) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `descipcion` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bg_comprobantes`
--

CREATE TABLE `bg_comprobantes` (
  `id` int(11) NOT NULL,
  `fecha_emision` date DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `asiento` varchar(45) DEFAULT NULL,
  `valor` double DEFAULT NULL,
  `activo` double DEFAULT NULL,
  `saldo` double DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `cue_aho_id` int(11) DEFAULT NULL,
  `tran_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bg_comprobante_prestamos`
--

CREATE TABLE `bg_comprobante_prestamos` (
  `id` int(11) NOT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `valor` double DEFAULT NULL,
  `interes` double DEFAULT NULL,
  `saldo` double DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `cue_aho_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bg_cuentas_ahorros`
--

CREATE TABLE `bg_cuentas_ahorros` (
  `id` int(11) NOT NULL,
  `numero` int(11) DEFAULT NULL,
  `saldo` double DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `soc_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bg_cuentas_contables`
--

CREATE TABLE `bg_cuentas_contables` (
  `id` int(11) NOT NULL,
  `codigo` int(11) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `es_total` tinyint(1) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `cat_id` int(11) DEFAULT NULL,
  `cue_con_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bg_cuentas_transaccion`
--

CREATE TABLE `bg_cuentas_transaccion` (
  `id` int(11) NOT NULL,
  `es_debe_haber` tinyint(4) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `tran_id` int(11) DEFAULT NULL,
  `cue_con_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bg_cuotas`
--

CREATE TABLE `bg_cuotas` (
  `id` int(11) NOT NULL,
  `valor` double DEFAULT NULL,
  `pagado` tinyint(4) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `fecha_pago` date DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `com_pre_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bg_localidades`
--

CREATE TABLE `bg_localidades` (
  `id` int(11) NOT NULL,
  `codigo` int(11) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `cat_id` int(11) DEFAULT NULL,
  `loc_id` int(11) DEFAULT NULL
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bg_pantallas`
--

CREATE TABLE `bg_pantallas` (
  `id` int(11) NOT NULL,
  `codigo` int(11) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `es_accion` varchar(45) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `tipo_pantalla_id` int(11) DEFAULT NULL,
  `pantalla_padre_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bg_pantallas_perfiles`
--

CREATE TABLE `bg_pantallas_perfiles` (
  `id` int(11) NOT NULL,
  `crear` tinyint(4) DEFAULT NULL,
  `actualizar` tinyint(4) DEFAULT NULL,
  `eliminar` tinyint(4) DEFAULT NULL,
  `buscar` tinyint(4) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `per_id` int(11) DEFAULT NULL,
  `pan_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bg_perfiles`
--

CREATE TABLE `bg_perfiles` (
  `id` int(11) NOT NULL,
  `codigo` int(11) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bg_socios`
--

CREATE TABLE `bg_socios` (
  `id` int(11) NOT NULL,
  `identificacion` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `loc_id` int(11) DEFAULT NULL,
  `cat_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bg_tipos_catalogos`
--

CREATE TABLE `bg_tipos_catalogos` (
  `id` int(11) NOT NULL,
  `codigo` int(11) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `descipcion` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bg_transacciones`
--

CREATE TABLE `bg_transacciones` (
  `id` int(11) NOT NULL,
  `codigo` int(11) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `numero_transacion` int(11) DEFAULT NULL,
  `numero_asiento` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bg_usuarios`
--

CREATE TABLE `bg_usuarios` (
  `id` int(11) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `es_admin` tinyint(4) DEFAULT NULL,
  `usu_activo` tinyint(4) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bg_usuarios_perfiles`
--

CREATE TABLE `bg_usuarios_perfiles` (
  `id` int(11) NOT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bg_asiento_detalle`
--
ALTER TABLE `bg_asiento_detalle`
  ADD PRIMARY KEY (`id`),
  ADD KEY `asi_det_cue_con_id_idx` (`cue_con_id`),
  ADD KEY `asi_det_com_id_idx` (`com_id`);

--
-- Indices de la tabla `bg_catalogo`
--
ALTER TABLE `bg_catalogo`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `bg_comprobantes`
--
ALTER TABLE `bg_comprobantes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `com_cue_aho_id_idx` (`cue_aho_id`),
  ADD KEY `com_tran_id_idx` (`tran_id`);

--
-- Indices de la tabla `bg_comprobante_prestamos`
--
ALTER TABLE `bg_comprobante_prestamos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `com_pres_cue_aho_id_idx` (`cue_aho_id`);

--
-- Indices de la tabla `bg_cuentas_ahorros`
--
ALTER TABLE `bg_cuentas_ahorros`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cue_aho_soc_id_idx` (`soc_id`);

--
-- Indices de la tabla `bg_cuentas_contables`
--
ALTER TABLE `bg_cuentas_contables`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cue_con_cat_id_idx` (`cat_id`),
  ADD KEY `cue_con_cue_con_id_idx` (`cue_con_id`);

--
-- Indices de la tabla `bg_cuentas_transaccion`
--
ALTER TABLE `bg_cuentas_transaccion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cue_tran_cue_con_id_idx` (`cue_con_id`),
  ADD KEY `cue_tran_tran_id_idx` (`tran_id`);

--
-- Indices de la tabla `bg_cuotas`
--
ALTER TABLE `bg_cuotas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cuo_com_pre_id_idx` (`com_pre_id`);

--
-- Indices de la tabla `bg_localidades`
--
ALTER TABLE `bg_localidades`
  ADD PRIMARY KEY (`id`),
  ADD KEY `loc_cat_id_idx` (`cat_id`),
  ADD KEY `loc_loc_id_idx` (`loc_id`);

--
-- Indices de la tabla `bg_pantallas`
--
ALTER TABLE `bg_pantallas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `pan_pan_id_idx` (`pantalla_padre_id`),
  ADD KEY `tipo_pantalla_id` (`tipo_pantalla_id`) USING BTREE;

--
-- Indices de la tabla `bg_pantallas_perfiles`
--
ALTER TABLE `bg_pantallas_perfiles`
  ADD PRIMARY KEY (`id`),
  ADD KEY `pan_per_per_id_idx` (`per_id`),
  ADD KEY `pan_per_pan_id_idx` (`pan_id`);

--
-- Indices de la tabla `bg_perfiles`
--
ALTER TABLE `bg_perfiles`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `bg_socios`
--
ALTER TABLE `bg_socios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `soc_loc_id_idx` (`loc_id`),
  ADD KEY `soc_cat_id_idx` (`cat_id`);

--
-- Indices de la tabla `bg_tipos_catalogos`
--
ALTER TABLE `bg_tipos_catalogos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `bg_transacciones`
--
ALTER TABLE `bg_transacciones`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `bg_usuarios`
--
ALTER TABLE `bg_usuarios`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `bg_usuarios_perfiles`
--
ALTER TABLE `bg_usuarios_perfiles`
  ADD PRIMARY KEY (`id`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bg_asiento_detalle`
--
ALTER TABLE `bg_asiento_detalle`
  ADD CONSTRAINT `asi_det_com_id` FOREIGN KEY (`com_id`) REFERENCES `bg_comprobantes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `asi_det_cue_con_id` FOREIGN KEY (`cue_con_id`) REFERENCES `bg_cuentas_contables` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `bg_catalogo`
--
ALTER TABLE `bg_catalogo`
  ADD CONSTRAINT `cat_tip_cat_id` FOREIGN KEY (`id`) REFERENCES `bg_tipos_catalogos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `bg_comprobantes`
--
ALTER TABLE `bg_comprobantes`
  ADD CONSTRAINT `com_cue_aho_id` FOREIGN KEY (`cue_aho_id`) REFERENCES `bg_cuentas_ahorros` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `com_tran_id` FOREIGN KEY (`tran_id`) REFERENCES `bg_transacciones` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `bg_comprobante_prestamos`
--
ALTER TABLE `bg_comprobante_prestamos`
  ADD CONSTRAINT `com_pres_cue_aho_id` FOREIGN KEY (`cue_aho_id`) REFERENCES `bg_cuentas_ahorros` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `bg_cuentas_ahorros`
--
ALTER TABLE `bg_cuentas_ahorros`
  ADD CONSTRAINT `cue_aho_soc_id` FOREIGN KEY (`soc_id`) REFERENCES `bg_socios` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `bg_cuentas_contables`
--
ALTER TABLE `bg_cuentas_contables`
  ADD CONSTRAINT `cue_con_cat_id` FOREIGN KEY (`cat_id`) REFERENCES `bg_catalogo` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `cue_con_cue_con_id` FOREIGN KEY (`cue_con_id`) REFERENCES `bg_cuentas_contables` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `bg_cuentas_transaccion`
--
ALTER TABLE `bg_cuentas_transaccion`
  ADD CONSTRAINT `cue_tran_cue_con_id` FOREIGN KEY (`cue_con_id`) REFERENCES `bg_cuentas_contables` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `cue_tran_tran_id` FOREIGN KEY (`tran_id`) REFERENCES `bg_transacciones` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `bg_cuotas`
--
ALTER TABLE `bg_cuotas`
  ADD CONSTRAINT `cuo_com_pre_id` FOREIGN KEY (`com_pre_id`) REFERENCES `bg_comprobante_prestamos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `bg_localidades`
--
ALTER TABLE `bg_localidades`
  ADD CONSTRAINT `loc_cat_id` FOREIGN KEY (`cat_id`) REFERENCES `bg_catalogo` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `loc_loc_id` FOREIGN KEY (`loc_id`) REFERENCES `bg_localidades` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `bg_pantallas`
--
ALTER TABLE `bg_pantallas`
  ADD CONSTRAINT `pan_cat_id` FOREIGN KEY (`tipo_pantalla_id`) REFERENCES `bg_catalogo` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `pan_pan_id` FOREIGN KEY (`pantalla_padre_id`) REFERENCES `bg_pantallas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `bg_pantallas_perfiles`
--
ALTER TABLE `bg_pantallas_perfiles`
  ADD CONSTRAINT `pan_per_pan_id` FOREIGN KEY (`pan_id`) REFERENCES `bg_pantallas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `pan_per_per_id` FOREIGN KEY (`per_id`) REFERENCES `bg_perfiles` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `bg_socios`
--
ALTER TABLE `bg_socios`
  ADD CONSTRAINT `soc_cat_id` FOREIGN KEY (`cat_id`) REFERENCES `bg_catalogo` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `soc_loc_id` FOREIGN KEY (`loc_id`) REFERENCES `bg_localidades` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `bg_usuarios_perfiles`
--
ALTER TABLE `bg_usuarios_perfiles`
  ADD CONSTRAINT `usu_per_per_id` FOREIGN KEY (`id`) REFERENCES `bg_perfiles` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `usu_per_usu_id` FOREIGN KEY (`id`) REFERENCES `bg_usuarios` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
