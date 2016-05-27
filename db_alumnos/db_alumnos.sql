-- phpMyAdmin SQL Dump
-- version 2.11.7
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 27-05-2016 a las 20:48:57
-- Versión del servidor: 5.0.51
-- Versión de PHP: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `db_alumnos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE IF NOT EXISTS `alumnos` (
  `id` varchar(20) collate utf8_spanish_ci NOT NULL,
  `nombres` varchar(30) collate utf8_spanish_ci NOT NULL,
  `apellidos` varchar(30) collate utf8_spanish_ci NOT NULL,
  `edad` varchar(10) collate utf8_spanish_ci NOT NULL,
  `direccion` varchar(50) collate utf8_spanish_ci NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcar la base de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`id`, `nombres`, `apellidos`, `edad`, `direccion`) VALUES
('17623698', 'daniel alfredo', 'guzman horestes', '14', 'urbanizacion llano alto'),
('18623698', 'carlos', 'caicedo', '15', 'calle las acaceas');
