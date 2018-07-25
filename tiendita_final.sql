-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-07-2018 a las 18:44:08
-- Versión del servidor: 10.1.31-MariaDB
-- Versión de PHP: 7.2.3

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
  `costo` float NOT NULL,
  `descuento` float NOT NULL,
  `fecha_inser` datetime NOT NULL,
  `fecha_modif` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `nombre`, `precio`, `costo`, `descuento`, `fecha_inser`, `fecha_modif`) VALUES
(1, 'agua', 100, 80, 11.4, '2018-07-19 00:00:00', '2018-07-19 00:00:00'),
(2, 'agua', 100, 70, 9.5, '2018-07-19 04:00:09', '2018-07-19 04:00:09'),
(3, 'jugo', 20, 12.3, 0.94, '2018-07-19 04:03:09', '2018-07-19 04:03:09'),
(4, 'papas', 30.4, 25.93, 5.43, '2018-07-19 04:15:26', '2018-07-19 04:15:26'),
(5, 'papas chile', 30.4, 24.87, 0.76, '2018-07-19 04:16:06', '2018-07-19 04:16:06'),
(6, 'huuh', 36.23, 32.42, 24, '2018-07-19 04:20:37', '2018-07-19 04:20:37'),
(7, 'fgfgfg', 87.32, 70.63, 10.4, '2018-07-19 04:34:03', '2018-07-19 04:34:03'),
(8, 'lñlñlñlñlñ', 87.32, 76.35, 3.53, '2018-07-19 04:34:43', '2018-07-19 04:34:43'),
(9, 'opopopopop', 48.3, 39.14, 19.4, '2018-07-19 04:37:39', '2018-07-19 04:37:39'),
(11, 'tunas', 84.65, 42.46, 12.37, '2018-07-19 09:36:11', '2018-07-20 16:21:41'),
(12, 'platanos', 69.25, 40.61, 0, '2018-07-24 06:36:11', '2018-07-24 20:48:50');

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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendidos`
--

CREATE TABLE `vendidos` (
  `id` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `fecha_inser` datetime NOT NULL
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
-- Indices de la tabla `vendidos`
--
ALTER TABLE `vendidos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `tabla_cambios`
--
ALTER TABLE `tabla_cambios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `vendidos`
--
ALTER TABLE `vendidos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
