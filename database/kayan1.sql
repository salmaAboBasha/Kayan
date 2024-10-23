CREATE DATABASE  IF NOT EXISTS `kayan` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `kayan`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: kayan
-- ------------------------------------------------------
-- Server version	8.0.39

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
-- Table structure for table `answer_entity`
--

DROP TABLE IF EXISTS `answer_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `answer_entity` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `answer` varchar(255) DEFAULT NULL,
  `question_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKn4hq04x8rcw8oyvc5ku6qowd0` (`question_id`),
  CONSTRAINT `FKn4hq04x8rcw8oyvc5ku6qowd0` FOREIGN KEY (`question_id`) REFERENCES `question_entity` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `answer_entity`
--

LOCK TABLES `answer_entity` WRITE;
/*!40000 ALTER TABLE `answer_entity` DISABLE KEYS */;
INSERT INTO `answer_entity` VALUES (1,'\nContent Creation: Generate engaging content.',1),(2,'Market Research: Provide industry insights',1),(3,'Customer Support: Automate FAQs and chats.',1),(4,'Process Optimization: Improve efficiency.',1),(5,'Brand Messaging: Refine brand voice.',1),(6,'\nCloud Integration: Set up cloud services.',2),(7,'Cybersecurity: Secure data and systems.',2),(8,'Automation: Automate tasks for efficiency.',2),(9,'Data Analytics: Analyze business data.\n',2),(10,'IT Support: Offer maintenance and troubleshooting.',2),(11,'Scalability: Ability to grow with your business.',3),(12,'Security: Strong protection for data and systems.',3),(13,'Reliability: Consistent performance and uptime.',3),(14,'Integration: Compatibility with existing tools and systems.',3),(15,'Support: Ongoing technical assistance and maintenance.',3),(16,'Simple Website: 1-2 weeks.',4),(17,'Small Business Site: 3-4 weeks.',4),(18,'E-commerce Site: 4-8 weeks.',4),(19,'Custom CMS: 6-12 weeks.',4),(20,'Complex Website: 3+ months.',4);
/*!40000 ALTER TABLE `answer_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact_us_entity`
--

DROP TABLE IF EXISTS `contact_us_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contact_us_entity` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `fullname` varchar(255) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact_us_entity`
--

LOCK TABLES `contact_us_entity` WRITE;
/*!40000 ALTER TABLE `contact_us_entity` DISABLE KEYS */;
INSERT INTO `contact_us_entity` VALUES (1,'Mazen@yahoo.com','Mazen','hello','Development'),(2,'salma@yahoo.com','salma','hello','Development'),(3,'amressam5000@gmail.com','amr','hi','cs');
/*!40000 ALTER TABLE `contact_us_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_entity`
--

DROP TABLE IF EXISTS `customer_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_entity` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `business_industry` varchar(255) DEFAULT NULL,
  `confirm_password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `mobile_number` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_entity`
--

LOCK TABLES `customer_entity` WRITE;
/*!40000 ALTER TABLE `customer_entity` DISABLE KEYS */;
INSERT INTO `customer_entity` VALUES (1,'bank','12','Mazen@yahoo.com','Mazen','01110201556','12'),(2,'cs','1','salma@yahoo.com','salma','0111','1');
/*!40000 ALTER TABLE `customer_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `question_entity`
--

DROP TABLE IF EXISTS `question_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question_entity` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `question` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question_entity`
--

LOCK TABLES `question_entity` WRITE;
/*!40000 ALTER TABLE `question_entity` DISABLE KEYS */;
INSERT INTO `question_entity` VALUES (1,'How can we help your business?'),(2,'Can I help your IT Solution for business?'),(3,'What are those requirements for ITSolutions?'),(4,'How long does it take to build a website?');
/*!40000 ALTER TABLE `question_entity` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-08 15:33:31
