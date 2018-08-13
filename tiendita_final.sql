-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-07-2018 a las 08:10:35
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

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `agregar_producto` (`prod_nombre` VARCHAR(50), `prod_precio` FLOAT, `prod_costo` FLOAT, `prod_descuento` FLOAT)  INSERT INTO producto
(
    `id`,
    `nombre`,
    `precio`,
    `costo`,
    `descuento`,
    `fecha_inser`,
    `fecha_modif`
)
VALUES
(
    NULL,
    `prod_nombre`,
    `prod_precio`,
    `prod_costo`,
    `prod_descuento`,
    NOW(),
    NOW()
)$$

DELIMITER ;

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
(8, 'lñlñlñlñlñ', 97.32, 76.35, 3.53, '2018-07-19 04:34:43', '2018-07-19 04:34:43'),
(9, 'opopopopop', 48.3, 39.14, 19.4, '2018-07-19 04:37:39', '2018-07-19 04:37:39'),
(11, 'tunas', 84.65, 42.46, 12.37, '2018-07-19 09:36:11', '2018-07-20 16:21:41'),
(12, 'platanos', 69.25, 40.61, 0, '2018-07-24 06:36:11', '2018-07-24 20:48:50');

--
-- Disparadores `producto`
--
DELIMITER $$
CREATE TRIGGER `cambia_precio` AFTER UPDATE ON `producto` FOR EACH ROW insert INTO tabla_cambios set
id = null,
id_producto = OLD.id,
valor_ant = OLD.precio,
valor_nvo = NEW.precio,
fecha_modif = NOW()
$$
DELIMITER ;

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
-- Volcado de datos para la tabla `tabla_cambios`
--

INSERT INTO `tabla_cambios` (`id`, `id_producto`, `valor_ant`, `valor_nvo`, `fecha_modif`) VALUES
(1, 8, '87.31999969482422', '97.31999969482422', '2018-07-30 22:47:28');

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
-- Volcado de datos para la tabla `vendidos`
--

INSERT INTO `vendidos` (`id`, `id_producto`, `cantidad`, `fecha_inser`) VALUES
(1, 2, 140, '2018-07-25 10:23:13'),
(2, 4, 40, '2018-07-25 10:24:11'),
(3, 5, 646, '2018-07-25 10:57:20'),
(4, 1, 25, '2018-07-25 11:40:48'),
(5, 2, 6, '2018-07-25 11:43:03'),
(6, 12, 419, '2018-07-25 11:46:48'),
(7, 11, 143, '2018-07-25 11:47:07'),
(8, 9, 455, '2018-07-25 11:47:28'),
(9, 8, 421, '2018-07-25 11:47:38'),
(10, 7, 236, '2018-07-25 11:47:47'),
(11, 6, 872, '2018-07-25 11:47:58'),
(12, 5, 951, '2018-07-25 11:48:09'),
(13, 4, 349, '2018-07-25 11:48:19'),
(14, 3, 46, '2018-07-25 11:48:27'),
(15, 3, 245, '2018-07-25 11:48:46');

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `vendidos`
--
ALTER TABLE `vendidos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
aaa:/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
