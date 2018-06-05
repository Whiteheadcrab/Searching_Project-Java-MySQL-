CREATE DATABASE  IF NOT EXISTS `supplies_inc_database` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `supplies_inc_database`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: supplies_inc_database
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `equipment_storage`
--

DROP TABLE IF EXISTS `equipment_storage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipment_storage` (
  `Id_Equipment_Storage` int(45) NOT NULL,
  `Name_Equipment_Storage` varchar(45) NOT NULL,
  `Amount_Equipment_Storage` int(45) NOT NULL,
  `Location_Equipment_Storagecol` varchar(45) NOT NULL,
  PRIMARY KEY (`Id_Equipment_Storage`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipment_storage`
--

LOCK TABLES `equipment_storage` WRITE;
/*!40000 ALTER TABLE `equipment_storage` DISABLE KEYS */;
INSERT INTO `equipment_storage` VALUES (1,'Multifunction Printer MFC-L2712DW A4',7,'10-20'),(2,'BROTHER DCP-T500W A4',10,'21-31'),(3,'Toner HP Laser Jet P2014 P2015 53a',34,'32-40'),(4,'Bateria HP Pavilion 15-B100EK',15,'33-41'),(5,'Windows 10 Professional Klucz',47,'1-9'),(6,'PENDRIVE PAMIĘĆ 64GB USB 2.0',25,'41-42'),(7,'Router Modem 3G Hspa Mobilny',7,'42-43');
/*!40000 ALTER TABLE `equipment_storage` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-29 19:19:00
