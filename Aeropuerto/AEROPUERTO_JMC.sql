-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-10-2019 a las 00:52:36
-- Versión del servidor: 10.1.40-MariaDB
-- Versión de PHP: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `AEROPUERTO JMC`
--
CREATE DATABASE IF NOT EXISTS `AEROPUERTO JMC` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `AEROPUERTO JMC`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `avion`
--

DROP TABLE IF EXISTS `avion`;
CREATE TABLE `avion` (
  `MATRICULA` varchar(30) NOT NULL,
  `AEROLINEA` varchar(30) NOT NULL,
  `MARCA` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conduce`
--

DROP TABLE IF EXISTS `conduce`;
CREATE TABLE `conduce` (
  `CEDULAPILOTO` double NOT NULL,
  `MATRICULAAVION` varchar(30) NOT NULL,
  `HORAINICIO` varchar(30) NOT NULL,
  `HORAFIN` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `daño`
--

DROP TABLE IF EXISTS `daño`;
CREATE TABLE `daño` (
  `IDDAÑO` int(11) NOT NULL,
  `CANTIDADDANO` int(11) NOT NULL,
  `MATRICULA` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especialidadmecanico`
--

DROP TABLE IF EXISTS `especialidadmecanico`;
CREATE TABLE `especialidadmecanico` (
  `IDESPECIALIDAD` int(11) NOT NULL,
  `CEDULAMECANICO` int(11) NOT NULL,
  `TIPO` varchar(30) NOT NULL,
  `NOMBRE` varchar(30) NOT NULL,
  `CATEGORIA` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experto`
--

DROP TABLE IF EXISTS `experto`;
CREATE TABLE `experto` (
  `MATRICULAAVION` varchar(30) NOT NULL,
  `CEDULAPILOTO` double NOT NULL,
  `ESTADOCIVIL` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hangar`
--

DROP TABLE IF EXISTS `hangar`;
CREATE TABLE `hangar` (
  `IDHANGAR` int(11) NOT NULL,
  `MATRICULAAVION` varchar(30) NOT NULL,
  `AREA` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `junior`
--

DROP TABLE IF EXISTS `junior`;
CREATE TABLE `junior` (
  `MATRICULAAVION` varchar(30) NOT NULL,
  `CEDULAPILOTO` double NOT NULL,
  `TELEFONO` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mecanico`
--

DROP TABLE IF EXISTS `mecanico`;
CREATE TABLE `mecanico` (
  `IDDAÑO` int(11) NOT NULL,
  `CEDULAMECANICO` double NOT NULL,
  `NOMBRE` varchar(30) NOT NULL,
  `EDAD` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `piloto`
--

DROP TABLE IF EXISTS `piloto`;
CREATE TABLE `piloto` (
  `ANOGRADUACION` int(11) NOT NULL,
  `CEDULA` double NOT NULL,
  `NOMBRE` varchar(100) NOT NULL,
  `ANOSEXPERIENCIA` int(11) NOT NULL,
  `MATRICULAAVION` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `senior`
--

DROP TABLE IF EXISTS `senior`;
CREATE TABLE `senior` (
  `MATRICULAAVION` varchar(30) NOT NULL,
  `CEDULAPILOTO` double NOT NULL,
  `NUMEROHIJOS` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `avion`
--
ALTER TABLE `avion`
  ADD PRIMARY KEY (`MATRICULA`);

--
-- Indices de la tabla `conduce`
--
ALTER TABLE `conduce`
  ADD PRIMARY KEY (`CEDULAPILOTO`,`MATRICULAAVION`),
  ADD UNIQUE KEY `cedula` (`CEDULAPILOTO`,`MATRICULAAVION`);

--
-- Indices de la tabla `daño`
--
ALTER TABLE `daño`
  ADD PRIMARY KEY (`IDDAÑO`),
  ADD UNIQUE KEY `MATRICULA` (`MATRICULA`);

--
-- Indices de la tabla `especialidadmecanico`
--
ALTER TABLE `especialidadmecanico`
  ADD PRIMARY KEY (`IDESPECIALIDAD`),
  ADD KEY `CEDULAMECANICO` (`CEDULAMECANICO`);

--
-- Indices de la tabla `experto`
--
ALTER TABLE `experto`
  ADD PRIMARY KEY (`MATRICULAAVION`,`CEDULAPILOTO`),
  ADD UNIQUE KEY `CEDULA` (`CEDULAPILOTO`) USING BTREE,
  ADD KEY `MATRICULAAVION` (`MATRICULAAVION`);

--
-- Indices de la tabla `hangar`
--
ALTER TABLE `hangar`
  ADD PRIMARY KEY (`IDHANGAR`),
  ADD UNIQUE KEY `MATRICULA` (`MATRICULAAVION`);

--
-- Indices de la tabla `junior`
--
ALTER TABLE `junior`
  ADD PRIMARY KEY (`MATRICULAAVION`,`CEDULAPILOTO`),
  ADD UNIQUE KEY `CEDULA` (`CEDULAPILOTO`),
  ADD KEY `MATRICULAAVION` (`MATRICULAAVION`);

--
-- Indices de la tabla `mecanico`
--
ALTER TABLE `mecanico`
  ADD PRIMARY KEY (`CEDULAMECANICO`),
  ADD KEY `IDDAÑO` (`IDDAÑO`);

--
-- Indices de la tabla `piloto`
--
ALTER TABLE `piloto`
  ADD PRIMARY KEY (`CEDULA`),
  ADD KEY `MATRICULAAVION` (`MATRICULAAVION`);

--
-- Indices de la tabla `senior`
--
ALTER TABLE `senior`
  ADD PRIMARY KEY (`MATRICULAAVION`,`CEDULAPILOTO`),
  ADD UNIQUE KEY `CEDULA` (`CEDULAPILOTO`),
  ADD KEY `MATRICULAAVION` (`MATRICULAAVION`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `daño`
--
ALTER TABLE `daño`
  MODIFY `IDDAÑO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `especialidadmecanico`
--
ALTER TABLE `especialidadmecanico`
  MODIFY `IDESPECIALIDAD` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `hangar`
--
ALTER TABLE `hangar`
  MODIFY `IDHANGAR` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `mecanico`
--
ALTER TABLE `mecanico`
  MODIFY `IDDAÑO` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
