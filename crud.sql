-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2021 at 11:13 AM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `crud`
--

-- --------------------------------------------------------

--
-- Table structure for table `administrator`
--

CREATE TABLE `administrator` (
  `ID` varchar(10) NOT NULL,
  `Nama` varchar(20) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `administrator`
--

INSERT INTO `administrator` (`ID`, `Nama`, `Password`) VALUES
('0000', 'admin', 'admin123');

-- --------------------------------------------------------

--
-- Table structure for table `checkin`
--

CREATE TABLE `checkin` (
  `KodeBooking` varchar(10) NOT NULL,
  `Nama` varchar(20) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `No HP` varchar(20) NOT NULL,
  `TipeKamar` varchar(20) NOT NULL,
  `NoKamar` varchar(10) NOT NULL,
  `LamaInap` varchar(10) NOT NULL,
  `tglCheckin` varchar(20) NOT NULL,
  `Harga` varchar(30) NOT NULL,
  `Pembayaran` varchar(30) NOT NULL,
  `Kembalian` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `checkin`
--

INSERT INTO `checkin` (`KodeBooking`, `Nama`, `Alamat`, `No HP`, `TipeKamar`, `NoKamar`, `LamaInap`, `tglCheckin`, `Harga`, `Pembayaran`, `Kembalian`) VALUES
('HSB-19', 'Michael', 'Kapuk', '08228067528', 'Standard', '109', '3', '06/07/2021', '750000', '800000', '50000'),
('HSB-308', 'Silvi', 'Pademangan IV', '0812345678', 'Family', '201', '2', '06/20/2021', '1000000', '1000000', '0'),
('HSB-515', 'Michael Hung', 'Kapuk Cengkareng', '082280675281', 'Standard', '107', '4', '06/20/2021', '1000000', '1050000', '50000');

-- --------------------------------------------------------

--
-- Table structure for table `checkout`
--

CREATE TABLE `checkout` (
  `KodeBooking` varchar(10) NOT NULL,
  `Nama` varchar(20) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `NoHP` varchar(20) NOT NULL,
  `TipeKamar` varchar(20) NOT NULL,
  `NoKamar` varchar(10) NOT NULL,
  `LamaInap` varchar(10) NOT NULL,
  `TglCheckin` varchar(20) NOT NULL,
  `TglCheckout` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `checkout`
--

INSERT INTO `checkout` (`KodeBooking`, `Nama`, `Alamat`, `NoHP`, `TipeKamar`, `NoKamar`, `LamaInap`, `TglCheckin`, `TglCheckout`) VALUES
('hsb-19', 'Michael', 'Kapuk', '08228067528', 'Standard', '109', '3', '06/07/2021', '06/10/2021'),
('HSB-308', 'Silvi', 'Pademangan IV', '0812345678', 'Family', '201', '2', '06/20/2021', '06/22/2021'),
('HSB-515', 'Michael Hung', 'Kapuk Cengkareng', '082280675281', 'Standard', '107', '4', '06/20/2021', '06/24/2021');

-- --------------------------------------------------------

--
-- Table structure for table `deluxe`
--

CREATE TABLE `deluxe` (
  `NoKamar` int(8) NOT NULL,
  `LantaiKamar` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `deluxe`
--

INSERT INTO `deluxe` (`NoKamar`, `LantaiKamar`) VALUES
(301, 3),
(302, 3),
(303, 3),
(304, 3),
(305, 3);

-- --------------------------------------------------------

--
-- Table structure for table `family`
--

CREATE TABLE `family` (
  `NoKamar` int(8) NOT NULL,
  `LantaiKamar` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `family`
--

INSERT INTO `family` (`NoKamar`, `LantaiKamar`) VALUES
(201, 2),
(202, 2),
(203, 2),
(204, 2),
(205, 2),
(206, 2),
(207, 2),
(208, 2);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `ID` varchar(10) NOT NULL,
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `Username`, `Password`) VALUES
('0000', 'admin', 'admin123'),
('0001', 'michael', 'michael'),
('0002', 'kevin', 'adadeh'),
('0003', 'alvin', 'iloveyou'),
('0004', 'asep', '@$3p'),
('0005', 'bryan', 'bryanganteng'),
('0006', 'Sally', 'sallycantik'),
('0010', 'Marcella', 'Marcella');

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `KodeBooking` varchar(10) NOT NULL,
  `Nama` varchar(20) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `No HP` varchar(20) NOT NULL,
  `TipeKamar` varchar(20) NOT NULL,
  `TglCheckin` varchar(20) NOT NULL,
  `LamaInap` varchar(10) NOT NULL,
  `Harga` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`KodeBooking`, `Nama`, `Alamat`, `No HP`, `TipeKamar`, `TglCheckin`, `LamaInap`, `Harga`) VALUES
('HSB-19', 'Michael', 'Kapuk', '08228067528', 'Standard', '06/07/2021', '3', '750000'),
('HSB-308', 'Silvi', 'Pademangan IV', '0812345678', 'Family', '06/20/2021', '2', '1000000'),
('HSB-515', 'Michael Hung', 'Kapuk Cengkareng', '082280675281', 'Standard', '06/20/2021', '4', '1000000');

-- --------------------------------------------------------

--
-- Table structure for table `standard`
--

CREATE TABLE `standard` (
  `NoKamar` varchar(8) NOT NULL,
  `LantaiKamar` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `standard`
--

INSERT INTO `standard` (`NoKamar`, `LantaiKamar`) VALUES
('101', '1'),
('102', '1'),
('103', '1'),
('104', '1'),
('105', '1'),
('106', '1'),
('107', '1'),
('108', '1'),
('109', '1'),
('110', '1');

-- --------------------------------------------------------

--
-- Table structure for table `suite`
--

CREATE TABLE `suite` (
  `NoKamar` int(8) NOT NULL,
  `LantaiKamar` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `suite`
--

INSERT INTO `suite` (`NoKamar`, `LantaiKamar`) VALUES
(401, 4),
(402, 4),
(403, 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administrator`
--
ALTER TABLE `administrator`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `checkin`
--
ALTER TABLE `checkin`
  ADD PRIMARY KEY (`KodeBooking`);

--
-- Indexes for table `checkout`
--
ALTER TABLE `checkout`
  ADD PRIMARY KEY (`KodeBooking`);

--
-- Indexes for table `deluxe`
--
ALTER TABLE `deluxe`
  ADD PRIMARY KEY (`NoKamar`);

--
-- Indexes for table `family`
--
ALTER TABLE `family`
  ADD PRIMARY KEY (`NoKamar`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`KodeBooking`);

--
-- Indexes for table `standard`
--
ALTER TABLE `standard`
  ADD PRIMARY KEY (`NoKamar`);

--
-- Indexes for table `suite`
--
ALTER TABLE `suite`
  ADD PRIMARY KEY (`NoKamar`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
