-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 19-09-2023 a las 20:57:57
-- Versión del servidor: 8.0.31
-- Versión de PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `empleados`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rango_salarial`
--

DROP TABLE IF EXISTS `rango_salarial`;
CREATE TABLE IF NOT EXISTS `rango_salarial` (
  `codigo` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `salario` varchar(30) NOT NULL,
  `edad` varchar(30) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `departamento` varchar(30) NOT NULL,
  `cargo` varchar(30) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `rango_salarial`
--

INSERT INTO `rango_salarial` (`codigo`, `nombre`, `salario`, `edad`, `direccion`, `departamento`, `cargo`) VALUES
('1234', 'Michael', '1200000', '23', 'Cra 50c #78-07', 'Antioquia', 'Vigilante'),
('4321', 'Adriana', '3000000', '43', 'diagonal 10a #6-20', 'Antioquia', 'Administradora'),
('56789', 'Alexis', '5000000', '23', 'calle 12b #6-30', 'Antioquia', 'Lider'),
('7567', 'Luis', '2500000', '57', 'Cra 3#5-32', 'Antioquia', 'Recepcionista');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
