-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 16, 2017 at 10:03 
-- Server version: 5.1.41
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_testkoneksi`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_akun`
--

CREATE TABLE IF NOT EXISTS `tb_akun` (
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_akun`
--

INSERT INTO `tb_akun` (`username`, `password`) VALUES
('arif', '1234'),
('yusril', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `t_siswa`
--

CREATE TABLE IF NOT EXISTS `t_siswa` (
  `NIS` int(11) NOT NULL,
  `NamaSiswa` varchar(80) NOT NULL,
  `JenisKelamin` enum('L','P') NOT NULL,
  `Kelas` varchar(10) NOT NULL,
  `Email` varchar(25) NOT NULL,
  `Alamat` text NOT NULL,
  PRIMARY KEY (`NIS`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_siswa`
--

INSERT INTO `t_siswa` (`NIS`, `NamaSiswa`, `JenisKelamin`, `Kelas`, `Email`, `Alamat`) VALUES
(1235, 'Nico', 'L', 'XI R2', 'nico@gmail.com', 'Blitar'),
(1238, 'Zidan', 'L', 'XI R 6', 'zidan@gmail.com', 'Malang'),
(1239, 'Yusril M', 'L', 'XI R 2', 'hendra@gmail.com', 'Tulungagung');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
