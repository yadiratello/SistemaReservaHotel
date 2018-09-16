-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3308
-- Tiempo de generación: 16-09-2018 a las 01:55:59
-- Versión del servidor: 5.7.19
-- Versión de PHP: 7.0.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_reserva_hotel`
--
CREATE DATABASE IF NOT EXISTS `bd_reserva_hotel` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `bd_reserva_hotel`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `idpersona` int(11) NOT NULL,
  `codigo_cliente` varchar(10) NOT NULL,
  PRIMARY KEY (`idpersona`),
  UNIQUE KEY `uk_cliente_codigo_cliente` (`codigo_cliente`),
  KEY `idpersona` (`idpersona`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idpersona`, `codigo_cliente`) VALUES
(1, 'CLI01'),
(7, 'CLI02'),
(8, 'CLI03');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consumo`
--

DROP TABLE IF EXISTS `consumo`;
CREATE TABLE IF NOT EXISTS `consumo` (
  `idconsumo` int(11) NOT NULL AUTO_INCREMENT,
  `idreserva` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio_venta` decimal(7,2) NOT NULL,
  `estado` varchar(15) NOT NULL,
  PRIMARY KEY (`idconsumo`),
  KEY `fk_consumo_producto` (`idproducto`),
  KEY `fk_consumo_reserva` (`idreserva`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `consumo`
--

INSERT INTO `consumo` (`idconsumo`, `idreserva`, `idproducto`, `cantidad`, `precio_venta`, `estado`) VALUES
(1, 4, 1, 4, '2.50', 'Aceptado'),
(3, 1, 3, 2, '0.20', 'Aceptado'),
(4, 1, 2, 2, '0.50', 'Aceptado'),
(5, 6, 3, 5, '0.20', 'Aceptado'),
(6, 6, 1, 4, '2.50', 'Aceptado'),
(7, 5, 1, 4, '2.50', 'Aceptado'),
(8, 5, 2, 4, '0.50', 'Aceptado'),
(9, 7, 2, 2, '0.50', 'Aceptado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

DROP TABLE IF EXISTS `habitacion`;
CREATE TABLE IF NOT EXISTS `habitacion` (
  `idhabitacion` int(11) NOT NULL AUTO_INCREMENT,
  `numero` varchar(4) NOT NULL,
  `piso` varchar(20) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `caracteristicas` varchar(512) DEFAULT NULL,
  `precio_diario` decimal(7,2) NOT NULL,
  `estado` varchar(15) NOT NULL,
  `tipo_habitacion` varchar(20) NOT NULL,
  PRIMARY KEY (`idhabitacion`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idhabitacion`, `numero`, `piso`, `descripcion`, `caracteristicas`, `precio_diario`, `estado`, `tipo_habitacion`) VALUES
(1, '101', '2', 'Habitacion con vista a la plaza	', 'cama matrimonial. internet wi-fi y TV por cable\n	', '150.00', 'Mantenimiento', 'Matrimonial'),
(2, '102', '4', 'Habitacion para persona sola', 'Internet wi-fi y tv por cable mas terma', '120.00', 'Disponible', 'Individual'),
(3, '103', '1', 'habitacion con vista a la playa', 'cama reclinable, chimenea, cable direcTV e internet por Wi-Fi', '200.00', 'Disponible', 'Matrimonial'),
(4, '104', '4', 'Habitación con 3 cuartos y 2 baños y piscina', 'terma, tv por cable, etc', '180.00', 'Disponible', 'Familiar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago`
--

DROP TABLE IF EXISTS `pago`;
CREATE TABLE IF NOT EXISTS `pago` (
  `idpago` int(11) NOT NULL AUTO_INCREMENT,
  `idreserva` int(11) NOT NULL,
  `tipo_comprobante` varchar(20) NOT NULL,
  `num_comprobante` varchar(20) NOT NULL,
  `igv` decimal(4,2) NOT NULL,
  `total_pago` decimal(7,2) NOT NULL,
  `fecha_emision` date NOT NULL,
  `fecha_pago` date NOT NULL,
  PRIMARY KEY (`idpago`),
  KEY `fk_pago_reserva` (`idreserva`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pago`
--

INSERT INTO `pago` (`idpago`, `idreserva`, `tipo_comprobante`, `num_comprobante`, `igv`, `total_pago`, `fecha_emision`, `fecha_pago`) VALUES
(4, 6, 'Factura', 'F001-0002', '0.18', '211.00', '1928-09-15', '1928-09-15'),
(3, 4, 'Factura', 'F001-0001', '0.18', '160.00', '1928-09-15', '1928-09-16'),
(5, 1, 'Factura', 'F000-0001', '0.18', '121.40', '1928-09-15', '1928-09-15'),
(6, 5, 'Boleta', '001-0003', '0.18', '212.00', '2018-09-15', '2018-09-15'),
(7, 7, 'Boleta', '001-00070', '0.18', '124.00', '2018-09-15', '2018-09-15'),
(8, 8, 'Factura', '001-0009', '0.18', '111.00', '2018-09-15', '2018-09-15'),
(9, 9, 'Factura', '001-0010', '0.18', '211.00', '2018-09-15', '2018-09-15');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

DROP TABLE IF EXISTS `persona`;
CREATE TABLE IF NOT EXISTS `persona` (
  `idpersona` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `apaterno` varchar(20) NOT NULL,
  `amaterno` varchar(20) NOT NULL,
  `tipo_documento` varchar(15) NOT NULL,
  `num_documento` varchar(8) NOT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(8) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`idpersona`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`idpersona`, `nombre`, `apaterno`, `amaterno`, `tipo_documento`, `num_documento`, `direccion`, `telefono`, `email`) VALUES
(1, 'Juan', 'Rojas', 'Lara', 'DNI', '87000098', 'Ate', '98121111', 'jrl@gmail.com'),
(4, 'maria', 'mendez', 'java', 'DNI', '121212', 'surco', '9878777', 'maria@mari.com'),
(3, 'juan', 'mesa', 'maldonado', 'DNI', '12343222', 'ate', '9878766', 'juan@juan.es'),
(6, 'carlos', 'muñoz', 'nuñez', 'DNI', '98787655', 'lima', '9878767', 'hah@hotmail.com'),
(7, 'luis', 'perez', 'salinas', 'CE', '98776565', 'chosica', '9878777', 'luisch@lui.com'),
(8, 'laura', 'lopez', 'perez', 'DNI', '78700077', 'lima', '9878777', 'la@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE IF NOT EXISTS `producto` (
  `idproducto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `unidad_medida` varchar(20) NOT NULL,
  `precio_venta` decimal(7,2) NOT NULL,
  PRIMARY KEY (`idproducto`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idproducto`, `nombre`, `descripcion`, `unidad_medida`, `precio_venta`) VALUES
(1, 'gaseosa inka cola 350 ml', 'gaseosa inka cola de diferentes sabores	', 'UNID', '2.50'),
(2, 'Llamadas a telefonos moviles', 'Llamas nacionales	', 'MIN', '0.50'),
(3, 'Llamadas a telefonos fijos', 'Llamadas a fijos nacionales', 'MIN', '0.20');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

DROP TABLE IF EXISTS `reserva`;
CREATE TABLE IF NOT EXISTS `reserva` (
  `idreserva` int(11) NOT NULL AUTO_INCREMENT,
  `idhabitacion` int(11) NOT NULL,
  `idcliente` int(11) NOT NULL,
  `idtrabajador` int(11) NOT NULL,
  `tipo_reserva` varchar(20) NOT NULL,
  `fecha_reserva` date NOT NULL,
  `fecha_ingresa` date NOT NULL,
  `fecha_salida` date NOT NULL,
  `costo_alojamiento` decimal(7,2) NOT NULL,
  `estado` varchar(15) NOT NULL,
  PRIMARY KEY (`idreserva`),
  KEY `idhabitacion` (`idhabitacion`),
  KEY `idcliente` (`idcliente`),
  KEY `idtrabajador` (`idtrabajador`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`idreserva`, `idhabitacion`, `idcliente`, `idtrabajador`, `tipo_reserva`, `fecha_reserva`, `fecha_ingresa`, `fecha_salida`, `costo_alojamiento`, `estado`) VALUES
(1, 2, 1, 4, 'Alquiler', '2018-09-12', '2018-09-13', '2018-09-14', '120.00', 'Alquiler'),
(5, 2, 7, 3, 'Reserva', '2018-09-15', '2018-09-15', '2018-09-16', '200.00', 'Alquiler'),
(4, 3, 1, 3, 'Alquiler', '2018-09-05', '2018-09-14', '2018-09-15', '150.00', 'Alquiler'),
(6, 4, 8, 3, 'Alquiler', '2018-09-14', '2018-09-15', '2018-09-16', '200.00', 'Pagada'),
(7, 2, 1, 3, 'Alquiler', '2018-09-15', '2018-09-15', '2018-09-16', '123.00', 'Pagada'),
(8, 2, 7, 3, 'Reserva', '2018-09-15', '2018-09-15', '2018-09-16', '111.00', 'Pagada'),
(9, 3, 1, 3, 'Reserva', '2018-09-12', '2018-09-13', '2018-09-14', '211.00', 'Pagada');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajador`
--

DROP TABLE IF EXISTS `trabajador`;
CREATE TABLE IF NOT EXISTS `trabajador` (
  `idpersona` int(11) NOT NULL,
  `sueldo` decimal(7,2) NOT NULL,
  `acceso` varchar(15) NOT NULL,
  `login` varchar(15) NOT NULL,
  `password` varchar(20) NOT NULL,
  `estado` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`idpersona`),
  UNIQUE KEY `uk_trabajador_login` (`login`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `trabajador`
--

INSERT INTO `trabajador` (`idpersona`, `sueldo`, `acceso`, `login`, `password`, `estado`) VALUES
(3, '1500.00', 'Administrador', 'juan', '123', 'A'),
(4, '1200.00', 'Digitador', 'maria', '123', 'A'),
(6, '1200.00', 'Digitador', 'carlos', '1234', 'D');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
