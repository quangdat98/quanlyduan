-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: db_demo_gem
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dbo_employee`
--

DROP TABLE IF EXISTS `dbo_employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dbo_employee` (
  `fullname` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dbo_employee`
--

LOCK TABLES `dbo_employee` WRITE;
/*!40000 ALTER TABLE `dbo_employee` DISABLE KEYS */;
INSERT INTO `dbo_employee` VALUES ('Nguyeen','dat260119981@gmail.com','dat123456'),('Nguyen Quang Dat','dat26011998@gmail.com','datnq'),('Nguyeen','dat26011998@gmail.com','datttt'),('nguyen dinh duy','duy@gmail.com','duy1234'),('Le Van Quang','quang@gmail.com','QuangLV'),('Le Van Quang','quang@gmail.com','QuangLV123');
/*!40000 ALTER TABLE `dbo_employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dbo_employee_solution`
--

DROP TABLE IF EXISTS `dbo_employee_solution`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dbo_employee_solution` (
  `id` int NOT NULL AUTO_INCREMENT,
  `solution_id` int NOT NULL,
  `username` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dbo_employee_solution`
--

LOCK TABLES `dbo_employee_solution` WRITE;
/*!40000 ALTER TABLE `dbo_employee_solution` DISABLE KEYS */;
INSERT INTO `dbo_employee_solution` VALUES (1,5,'datnq'),(3,5,'datttt'),(4,10,'duy1234'),(5,36,'duy1234'),(6,6,'QuangLV123');
/*!40000 ALTER TABLE `dbo_employee_solution` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dbo_solution`
--

DROP TABLE IF EXISTS `dbo_solution`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dbo_solution` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `role_gem` tinyint(1) DEFAULT NULL,
  `regional` varchar(50) DEFAULT NULL,
  `serve_industries` varchar(250) DEFAULT NULL,
  `model` varchar(50) DEFAULT NULL,
  `commercialized_status` varchar(50) DEFAULT NULL,
  `primary_benefits` varchar(250) DEFAULT NULL,
  `tech_stack` varchar(50) DEFAULT NULL,
  `reference` varchar(250) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `duration_development` varchar(250) DEFAULT NULL,
  `owner` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dbo_solution`
--

LOCK TABLES `dbo_solution` WRITE;
/*!40000 ALTER TABLE `dbo_solution` DISABLE KEYS */;
INSERT INTO `dbo_solution` VALUES (2,'dattt',0,'x','c','c','c','c','c','c',0,'c','datnq'),(3,'dat222',0,'sd','df','ad','df','ad','fda','adf',1,'df','huynk'),(5,'dattest',1,'test null','test null','test null','test null','test null','test null','test null',1,'test null','DatNN'),(6,'dattt',0,'b','b','b','b','b','b','b',1,'b','dat'),(10,'dattestcuoi',1,'test null','test null','test null','test null','test null','test null','test null',0,'test null','datnq'),(21,'dattestsau xoa',0,'not null','not null','not null','not null','not null','not null','not null',1,'not null','datnq'),(36,'huy123',1,'VN','test null','test null','test null','test null','test null','test null',1,'test null','huynk');
/*!40000 ALTER TABLE `dbo_solution` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (2),(2),(2);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'db_demo_gem'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-31 10:50:41
