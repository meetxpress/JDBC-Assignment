-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 02, 2020 at 11:16 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projectbook`
--

-- --------------------------------------------------------

--
-- Table structure for table `authormaster`
--

CREATE TABLE `authormaster` (
  `Auth_id` int(11) NOT NULL,
  `Auth_name` varchar(20) NOT NULL,
  `Auth_Mobile` int(11) DEFAULT NULL,
  `Auth_Add` varchar(60) NOT NULL,
  `Auth_AadharNo` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `authormaster`
--

INSERT INTO `authormaster` (`Auth_id`, `Auth_name`, `Auth_Mobile`, `Auth_Add`, `Auth_AadharNo`) VALUES
(1, 'Meet', 987654311, 'Vadodara', 12344),
(3, 'Meet Patel', 1234562890, 'Vadodara', NULL),
(5, 'Meet Patel', 123, 'qwe', 567),
(6, 'Meet Patel', 12121, 'asdas', 122);

-- --------------------------------------------------------

--
-- Table structure for table `publishermaster`
--

CREATE TABLE `publishermaster` (
  `Pub_id` int(11) NOT NULL,
  `Pub_name` varchar(20) NOT NULL,
  `Pub_Mobile` int(11) NOT NULL,
  `Pub_Add` varchar(60) NOT NULL,
  `Pub_AadharNo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `publishermaster`
--

INSERT INTO `publishermaster` (`Pub_id`, `Pub_name`, `Pub_Mobile`, `Pub_Add`, `Pub_AadharNo`) VALUES
(1, 'abc', 12345, 'abcde', 8765);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `authormaster`
--
ALTER TABLE `authormaster`
  ADD PRIMARY KEY (`Auth_id`);

--
-- Indexes for table `publishermaster`
--
ALTER TABLE `publishermaster`
  ADD PRIMARY KEY (`Pub_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `authormaster`
--
ALTER TABLE `authormaster`
  MODIFY `Auth_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `publishermaster`
--
ALTER TABLE `publishermaster`
  MODIFY `Pub_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
