CREATE DATABASE `Segmentation`;

use  `Segmentation`;

CREATE TABLE `Process` (
  `P_ID` int(11) NOT NULL,
  `P_name` varchar(45) NOT NULL,
  PRIMARY KEY (`P_ID`)
); 

CREATE TABLE `SegmentTable` (
  `P_ID` int(11) NOT NULL,
  `Segment_ID` int(11) NOT NULL,
  `Segment_name` varchar(45) NOT NULL,
  `BaseAddress` bigint(20) NOT NULL,
  `Length` bigint(20) NOT NULL,
  KEY `P_ID` (`P_ID`),
  CONSTRAINT `P_ID` FOREIGN KEY (`P_ID`) REFERENCES `Process` (`P_ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ;
