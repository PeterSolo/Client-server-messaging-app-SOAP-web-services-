-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: chatsystem
-- ------------------------------------------------------
-- Server version	5.7.10-log

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
-- Table structure for table `chats`
--

DROP TABLE IF EXISTS `chats`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chats` (
  `threadId` int(11) NOT NULL,
  `editor` varchar(45) NOT NULL,
  `text` varchar(200) NOT NULL,
  `placeholder` int(11) NOT NULL AUTO_INCREMENT,
  `dateAdded` varchar(45) NOT NULL,
  PRIMARY KEY (`placeholder`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chats`
--

LOCK TABLES `chats` WRITE;
/*!40000 ALTER TABLE `chats` DISABLE KEYS */;
INSERT INTO `chats` VALUES (1,'don','hello',1,'15/03/2018'),(1,'pasdo','fuck',2,'15/03/2018'),(1,'lool','yes',3,'15/03/2018'),(12,'Don','ooooottt',4,'15/03/2018'),(12,'Don','plas',5,'15/03/2018'),(1,'Don','first message',6,'88-03-2018'),(14,'Don','ded',7,'29-03-2018'),(14,'Don','fggg',8,'29-03-2018'),(10,'Don','jlkhj',9,'29-03-2018'),(1,'Don','jumjum',10,'06-04-2018'),(1,'Don','how are you',11,'06-04-2018'),(7,'Don','sdfgdsg',12,'10-04-2018'),(7,'Don','fgfaaaf',13,'10-04-2018'),(15,'Don','tutyuturyu',14,'10-04-2018'),(15,'Don','tyuydghdhg',15,'10-04-2018'),(10,'yosief','ghfghcxgh',16,'10-04-2018'),(10,'yosief','ghfghfgh',17,'10-04-2018'),(10,'yosief','sadsfadsf',18,'10-04-2018'),(10,'yosief','asdfjjhjhj',19,'10-04-2018'),(7,'Don','jhsfsfg',20,'10-04-2018'),(7,'Don','hjkhjk',22,'10-04-2018'),(7,'Don','ffffkk',23,'10-04-2018');
/*!40000 ALTER TABLE `chats` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `threads`
--

DROP TABLE IF EXISTS `threads`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `threads` (
  `threadId` int(11) NOT NULL AUTO_INCREMENT,
  `lasteditor` varchar(45) NOT NULL,
  `editdate` varchar(45) NOT NULL,
  `title` varchar(45) NOT NULL,
  PRIMARY KEY (`threadId`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `threads`
--

LOCK TABLES `threads` WRITE;
/*!40000 ALTER TABLE `threads` DISABLE KEYS */;
INSERT INTO `threads` VALUES (1,'Padro','02/05/2015 10:15:36 ','greeting'),(2,'bigman','2018-03-81 22:03:419','gdgdgd'),(3,'yungen','2018-03-81 22:03:30','sdsd'),(7,'kisanet','2018-03-84 14:03:742','temrti'),(8,'Don','2018-03-84 14:03:129','jigig'),(9,'Don','2018-03-84 15:03:317','bang'),(10,'Don','2018-03-84 15:03:911','kjkj'),(11,'Don','2018-03-84 15:03:661','looppp'),(12,'Don','2018-03-84 15:03:864','nbnbb'),(13,'Don','2018-03-84 15:03:676','ddfd'),(14,'Don','2018-03-88 01:03:637','thething'),(15,'Don','2018-04-100 22:04:995','saron');
/*!40000 ALTER TABLE `threads` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userdetails`
--

DROP TABLE IF EXISTS `userdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userdetails` (
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `nickname` varchar(45) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userdetails`
--

LOCK TABLES `userdetails` WRITE;
/*!40000 ALTER TABLE `userdetails` DISABLE KEYS */;
INSERT INTO `userdetails` VALUES ('peter','pass','Don',1),('pedro','asd','pasdo',2),('usera','145','lool',3),('jossi','123','yosief',4),('','','',5);
/*!40000 ALTER TABLE `userdetails` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-11  0:11:46
