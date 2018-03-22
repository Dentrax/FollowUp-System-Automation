-- ====================================================
-- Follow-Up System Automation Copyright(C) 2017 Furkan Türkal
-- This program comes with ABSOLUTELY NO WARRANTY; This is free software,
-- and you are welcome to redistribute it under certain conditions; See
-- file LICENSE, which is part of this source code package, for details.
-- ====================================================

-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: odev2
-- ------------------------------------------------------
-- Server version	5.7.17-log

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
-- Table structure for table `calisan`
--

DROP TABLE IF EXISTS `calisan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `calisan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kullaniciadi` varchar(45) NOT NULL,
  `sifre` varchar(45) NOT NULL,
  `kayitno` int(11) NOT NULL DEFAULT '0',
  `ad` varchar(45) NOT NULL,
  `soyad` varchar(45) NOT NULL,
  `tc` int(11) NOT NULL,
  `sicil` int(11) NOT NULL,
  `cinsiyet` varchar(10) NOT NULL,
  `dogumtarihi` datetime NOT NULL,
  `birim` varchar(45) NOT NULL,
  `kalanizin` int(11) NOT NULL,
  `sehir` varchar(45) NOT NULL,
  `admin` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `kullaniciadi_UNIQUE` (`kullaniciadi`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calisan`
--

LOCK TABLES `calisan` WRITE;
/*!40000 ALTER TABLE `calisan` DISABLE KEYS */;
INSERT INTO `calisan` VALUES (1,'admin','admin',1,'Furkan','Türkal',256325841,15692,'Erkek','1997-04-13 21:34:34','1.Birim',100,'15.Burdur',1),(2,'aaa','aaa',2,'Ömer','Ağırağaç',625648569,98544,'Erkek','1997-05-12 21:43:34','3.Birim',20,'28.Giresun',0),(3,'deneme3','123123',3,'Sezer','Ağıroğlu',956325648,89786,'Erkek','1986-05-12 21:43:34','2.Birim',13,'1.Adana',0),(4,'deneme4','123123',4,'Güçlü','Ağnar',125648569,67889,'Erkek','1980-05-12 21:43:34','2.Birim',12,'14.Bolu',0),(5,'deneme5','123123',5,'Sude','Ahmadı Asl',256458953,97754,'Kadın','1985-05-12 21:43:34','4.Birim',4,'25.Erzurum',0),(6,'deneme6','123123',6,'Ayşe','Ahmet',125468953,98797,'Kadın','1981-05-12 21:43:34','5.Birim',3,'16.Bursa',0),(7,'deneme7','123123',7,'Halid','Akoğuz',215632485,64547,'Erkek','1978-05-12 21:43:34','5.Birim',9,'25.Erzurum',0),(8,'deneme8','123123',8,'Aynur','Ansen',256548652,45454,'Kadın','1976-05-12 21:43:34','5.Birim',16,'1.Adana',0),(9,'deneme9','123123',9,'Ayman','Atmaca',123589225,45456,'Erkek','1976-05-12 21:43:34','4.Birim',15,'20.Denizli',0),(10,'deneme10','123123',10,'Mehmet','Aygen',588945665,64545,'Erkek','1971-05-12 21:43:34','4.Birim',14,'1.Adana',0),(11,'deneme11','123123',11,'Manolya','Ercüment',675673537,64547,'Kadın','1970-05-12 21:43:34','2.Birim',13,'20.Denizli',0),(12,'deneme12','123123',12,'Eylem','Erkovan',547827272,64454,'Kadın','1990-05-12 21:43:34','2.Birim',4,'42.Konya',0),(13,'deneme13','123123',13,'Sadık','Geçioğlu',453456456,54545,'Erkek','1991-05-12 21:43:34','1.Birim',20,'42.Konya',0),(14,'deneme14','123123',14,'Kerem','Geçkin',123123123,34343,'Erkek','1969-05-12 21:43:34','1.Birim',20,'47.Mardin',0),(15,'deneme15','123123',15,'Vedia','Gezmiş',537727277,45455,'Kadın','1965-05-12 21:43:34','1.Birim',5,'57.Sinop ',0),(16,'deneme16','123123',16,'Merter','Gölmes',123123127,45466,'Erkek','1965-05-12 21:43:34','1.Birim',9,'72.Batman',0),(17,'deneme17','123123',17,'Emircan','Güllüce',676786782,54542,'Erkek','1964-05-12 21:43:34','2.Birim',8,'72.Batman',0),(18,'deneme18','123123',18,'Dağhan','İlhan',312347822,75757,'Erkek','1962-05-12 21:43:34','2.Birim',4,'47.Mardin',0),(19,'deneme19','123123',19,'Necatı','İncekara',237339214,45457,'Erkek','1963-05-12 21:43:34','3.Birim',6,'57.Sinop ',0),(20,'deneme20','123123',20,'Şensoy','Kandaşoğlu',678727275,64455,'Erkek','2000-05-12 21:43:34','5.Birim',4,'77.Yalova',0),(21,'a','a',0,'a','a',123123123,1231,'Erkek','1954-05-04 00:00:00','4.Birim',20,'1.Adana',0),(22,'ff','ffa',0,'ffa','ffa',122123123,12333,'Kadın','1961-02-01 00:00:00','3.Birim',20,'29.Gümüşhane 	',0),(24,'dd','dd',0,'dd','dd',123123,12312,'Kadın','1973-04-03 00:00:00','2.Birim',20,'1.Adana',0),(25,'tt','tt',0,'tt','tt',123123,123,'Kadın','1983-04-03 00:00:00','2.Birim',20,'77.Yalova',0),(26,'test6','6',0,'Test','Deneme',1231231,21312,'Kadın','1995-06-05 00:00:00','4.Birim',20,'28.Giresun 	',0),(28,'uu','1',0,'Test1','Test2',12312312,312312,'Kadın','1904-05-04 00:00:00','3.Birim',20,'25.Erzurum 	',0),(29,'oo','1',0,'Test5','Test5',123123,12322,'Kadın','1904-05-04 00:00:00','1.Birim',20,'5.Amasya 	',0),(30,'ffff','f',0,'ff','ff',23322,22222,'Kadın','1904-05-04 00:00:00','5.Birim',20,'25.Erzurum 	',0),(31,'pp1','1',0,'Test555','Test5',123123,25625,'Kadın','1901-02-01 00:00:00','3.Birim',20,'5.Amasya 	',0),(32,'dsadasd','adsassa',0,'adsada','sdsadsad',3123123,31231,'Erkek','1901-02-01 00:00:00','1.Birim',20,'1.Adana 	',0),(33,'sadsadsasa','asdsadsa',0,'dsadsa','ssadsad',13123123,21312,'Erkek','1901-02-01 00:00:00','1.Birim',20,'1.Adana 	',0);
/*!40000 ALTER TABLE `calisan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `izin`
--

DROP TABLE IF EXISTS `izin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `izin` (
  `izin_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NOT NULL,
  `baslangic` datetime NOT NULL,
  `bitis` datetime NOT NULL,
  `tur` varchar(45) NOT NULL,
  `kullanilan` int(11) NOT NULL,
  `onaylandi` int(11) NOT NULL,
  PRIMARY KEY (`izin_id`),
  UNIQUE KEY `izin_id_UNIQUE` (`izin_id`),
  KEY `u_id_idx` (`u_id`),
  CONSTRAINT `u_id` FOREIGN KEY (`u_id`) REFERENCES `calisan` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `izin`
--

LOCK TABLES `izin` WRITE;
/*!40000 ALTER TABLE `izin` DISABLE KEYS */;
INSERT INTO `izin` VALUES (1,22,'2014-04-03 00:00:00','2012-06-04 00:00:00','Mazeret',0,-1),(2,22,'2013-05-04 00:00:00','2017-05-04 00:00:00','Ücretsiz',0,-1),(3,22,'2013-03-04 00:00:00','2017-04-03 00:00:00','Rapor',0,-1),(4,5,'2017-02-01 00:00:00','2013-04-03 00:00:00','Rapor',0,1),(5,7,'2017-02-05 00:00:00','2013-04-01 00:00:00','Mazeret',0,1),(6,30,'2017-05-04 00:00:00','2017-08-07 00:00:00','Mazeret',0,1),(7,28,'2017-03-04 00:00:00','2017-03-10 00:00:00','Ücretsiz',0,-1),(8,28,'2005-02-01 00:00:00','2011-02-01 00:00:00','Rapor',0,-1),(9,28,'2017-02-01 00:00:00','2016-02-01 00:00:00','Yıllık',0,-1),(10,31,'2015-03-03 00:00:00','2017-02-03 00:00:00','Yıllık',0,-1),(11,7,'2017-05-04 00:00:00','2017-06-01 00:00:00','Yıllık',0,1),(12,9,'2020-02-01 00:00:00','2021-02-01 00:00:00','Yıllık',0,-1),(13,10,'2018-02-01 00:00:00','2020-02-01 00:00:00','Yıllık',0,-1),(14,29,'2024-05-04 00:00:00','2025-02-03 00:00:00','Rapor',0,1),(15,10,'2020-02-01 00:00:00','2025-05-04 00:00:00','Rapor',0,-1),(16,14,'2022-02-05 00:00:00','2025-02-04 00:00:00','Ücretsiz',0,-1),(17,19,'2023-05-04 00:00:00','2024-12-01 00:00:00','Yıllık',0,1),(18,18,'2021-04-03 00:00:00','2022-03-01 00:00:00','Mazeret',0,1),(19,24,'2024-05-04 00:00:00','2025-03-03 00:00:00','Yıllık',0,1),(20,25,'2022-04-03 00:00:00','2024-05-04 00:00:00','Yıllık',0,-1),(21,30,'2023-02-04 00:00:00','2025-02-03 00:00:00','Yıllık',0,1);
/*!40000 ALTER TABLE `izin` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-19 16:21:08
