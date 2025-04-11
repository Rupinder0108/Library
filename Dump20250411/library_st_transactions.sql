-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: library
-- ------------------------------------------------------
-- Server version	8.0.41

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
-- Table structure for table `st_transactions`
--

DROP TABLE IF EXISTS `st_transactions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_transactions` (
  `bcode` int unsigned NOT NULL,
  `bname` varchar(45) NOT NULL,
  `strollno` varchar(45) NOT NULL,
  `stname` varchar(45) NOT NULL,
  `contactno` varchar(45) NOT NULL,
  `course` varchar(45) NOT NULL,
  `issuedate` varchar(45) NOT NULL,
  `duedate` varchar(45) NOT NULL,
  `returndate` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `fine` varchar(45) DEFAULT NULL,
  `st_id` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_transactions`
--

LOCK TABLES `st_transactions` WRITE;
/*!40000 ALTER TABLE `st_transactions` DISABLE KEYS */;
INSERT INTO `st_transactions` VALUES (302,'Python','22501','Parminder Kaur','2454566788','bca','05/04/2025 ','19/04/2025','21/04/2025','AVAILABLE',NULL,'101'),(301,'Java','22501','Parminder Kaur','2454566788','bca','05/04/2025 ','19/04/2025','22/04/2025','AVAILABLE',NULL,'102'),(305,'DBMS','22506','Rupinder Kaur','7364327489','bca','05/04/2025 ','19/04/2025','23/04/2025','AVAILABLE',NULL,'103'),(305,'DBMS','22506','Rupinder Kaur','7364327489','bca','05/04/2025 ','19/04/2025',NULL,'ISSUED',NULL,'304'),(303,'java','22505','Sanjana','3243534534','bca','05/04/2025 ','19/04/2025','24/04/2025','AVAILABLE',NULL,'305'),(301,'Java','22501','Parminder Kaur','2454566788','bca','07/04/2025 ','23/04/2025','21/04/2025','AVAILABLE',NULL,'306'),(302,'Python','22506','Rupinder Kaur','7364327489','bca','07/04/2025 ','21/04/2025','23/04/2025','AVAILABLE',NULL,'307'),(301,'Java','22505','Sanjana','3243534534','bca','07/04/2025 ','21/04/2025',NULL,'Issued',NULL,'308'),(302,'Python','22529','Simran','4345766456','bca','07/04/2025 ','21/04/2025','24/04/2025','AVAILABLE',NULL,'309');
/*!40000 ALTER TABLE `st_transactions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-04-11 12:23:17
