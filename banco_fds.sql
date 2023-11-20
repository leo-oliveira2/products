-- MySQL dump 10.13  Distrib 5.7.24, for Linux (x86_64)
--
-- Host: localhost    Database: banco_fds
-- ------------------------------------------------------
-- Server version	8.0.35-0ubuntu0.22.04.1

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
-- Table structure for table `PRODUTOS`
--

DROP TABLE IF EXISTS `PRODUTOS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PRODUTOS` (
  `id` decimal(8,0) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `valor` decimal(7,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PRODUTOS`
--

LOCK TABLES `PRODUTOS` WRITE;
/*!40000 ALTER TABLE `PRODUTOS` DISABLE KEYS */;
INSERT INTO `PRODUTOS` VALUES (1,'Camiseta Branca P Básica',20.00),(2,'Camiseta Branca M Básica',20.00),(3,'Camiseta Branca G Básica',22.00),(4,'Camiseta Preta P com Estampa',35.00),(5,'Camiseta Preta M com Estampa',35.00),(6,'Camiseta Preta G com Estampa',35.00),(7,'Camisa social listrada',120.00),(8,'Camisa social linho',300.00),(9,'Tênis branco camurça',190.00),(10,'Tênis preto camurça',200.00),(11,'Limpa camurça',9.00),(12,'Cinto couro legítimo',15.00),(13,'Calça jeans',100.00),(14,'Calça social',120.00),(15,'Relógio Rolex Falso',700.00),(16,'Camiseta Azul P Básica',22.00),(17,'Camiseta Vermelha M Básica',25.00),(18,'Camiseta Cinza G Básica',23.00),(19,'Camiseta Estampada P',30.00),(20,'Camiseta Estampada M',30.00),(21,'Camiseta Estampada G',30.00),(22,'Blusa de Moletom Cinza P',50.00),(23,'Blusa de Moletom Cinza M',50.00),(24,'Blusa de Moletom Cinza G',50.00),(25,'Jaqueta Jeans',80.00),(26,'Jaqueta de Couro Preta',150.00),(27,'Boné Branco',15.00),(28,'Boné Preto',15.00),(29,'Óculos de Sol Aviador',40.00),(30,'Mochila Preta',50.00),(31,'Camiseta Rosa P Básica',22.00),(32,'Camiseta Amarela M Básica',25.00),(33,'Camiseta Verde G Básica',23.00),(34,'Camiseta Listrada P',28.00),(35,'Camiseta Listrada M',28.00),(36,'Camiseta Listrada G',28.00),(37,'Camisa Xadrez',80.00),(38,'Camisa Jeans',60.00),(39,'Tênis Azul camurça',180.00),(40,'Tênis Vermelho camurça',190.00),(41,'Escova para Camurça',8.00),(42,'Cinto de Couro Marrom',18.00),(43,'Calça Legging',35.00),(44,'Calça Cargo',50.00),(45,'Relógio de Pulso Prata',120.00),(46,'Camiseta Cinza Mescla P',22.00),(47,'Camiseta Laranja M Básica',25.00),(48,'Camiseta Estampada G',30.00),(49,'Blusa de Moletom Preta P',50.00),(50,'Blusa de Moletom Preta M',50.00),(51,'Blusa de Moletom Preta G',50.00),(52,'Jaqueta Corta Vento',70.00),(53,'Jaqueta de Couro Marrom',160.00),(54,'Boné Azul',15.00),(55,'Boné Vermelho',15.00),(56,'Óculos de Sol Wayfarer',45.00),(57,'Chapéu de Palha',25.00),(58,'Bolsa de Couro Preta',80.00),(59,'Meia Esportiva',8.00),(60,'Chinelo Slide Preto',25.00),(61,'Camiseta Branca Floral P',25.00),(62,'Camiseta Listrada M',28.00),(63,'Camiseta Amarela G Básica',23.00),(64,'Camisa Social Azul',110.00),(65,'Camisa Social Preta',110.00),(66,'Tênis Casual Marrom',170.00),(67,'Tênis Esportivo Cinza',150.00),(68,'Escova para Sapatos',7.00),(69,'Cinto de Couro Preto',20.00),(70,'Calça Legging Estampada',40.00);
/*!40000 ALTER TABLE `PRODUTOS` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-20 16:45:22
