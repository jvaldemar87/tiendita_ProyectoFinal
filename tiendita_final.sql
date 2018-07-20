-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-07-2018 a las 01:11:14
-- Versión del servidor: 10.1.30-MariaDB
-- Versión de PHP: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tiendita_final`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `precio` float NOT NULL,
  `descuento` float NOT NULL,
  `fecha_inser` datetime NOT NULL,
  `fecha_modif` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `nombre`, `precio`, `descuento`, `fecha_inser`, `fecha_modif`) VALUES
(1, 'agua', 100, 0, '2018-07-19 00:00:00', '2018-07-19 00:00:00'),
(2, 'agua', 100, 0, '2018-07-19 04:00:09', '2018-07-19 04:00:09'),
(3, 'jugo', 20, 0, '2018-07-19 04:03:09', '2018-07-19 04:03:09'),
(4, 'papas', 30.4, 0, '2018-07-19 04:15:26', '2018-07-19 04:15:26'),
(5, 'papas chile', 30.4, 0, '2018-07-19 04:16:06', '2018-07-19 04:16:06'),
(6, 'huuh', 36.23, 24, '2018-07-19 04:20:37', '2018-07-19 04:20:37'),
(7, 'fgfgfg', 87.32, 0, '2018-07-19 04:34:03', '2018-07-19 04:34:03'),
(8, 'lñlñlñlñlñ', 87.32, 0, '2018-07-19 04:34:43', '2018-07-19 04:34:43'),
(9, 'opopopopop', 48.3, 0, '2018-07-19 04:37:39', '2018-07-19 04:37:39');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tabla_cambios`
--

CREATE TABLE `tabla_cambios` (
  `id` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `valor_ant` varchar(150) NOT NULL,
  `valor_nvo` varchar(150) NOT NULL,
  `fecha_modif` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tabla_cambios`
--
ALTER TABLE `tabla_cambios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `tabla_cambios`
--
ALTER TABLE `tabla_cambios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
