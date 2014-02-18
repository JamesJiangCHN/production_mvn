/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50535
Source Host           : localhost:3306
Source Database       : production

Target Server Type    : MYSQL
Target Server Version : 50535
File Encoding         : 65001

Date: 2014-02-19 00:38:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for con_test
-- ----------------------------
DROP TABLE IF EXISTS `con_test`;
CREATE TABLE `con_test` (
  `a` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of con_test
-- ----------------------------

-- ----------------------------
-- Table structure for dgu2000
-- ----------------------------
DROP TABLE IF EXISTS `dgu2000`;
CREATE TABLE `dgu2000` (
  `id` varchar(11) NOT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `dateString` varchar(255) DEFAULT NULL,
  `addTime` bigint(20) DEFAULT NULL,
  `projectId` varchar(11) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dgu2000
-- ----------------------------
INSERT INTO `dgu2000` VALUES ('118', '192.168.0.118', '2014-02-18 17:55:49', '1392717349812', '1');
INSERT INTO `dgu2000` VALUES ('12', '192.168.0.112', '2014-02-18 17:46:38', '1392716798109', '1');
INSERT INTO `dgu2000` VALUES ('2', '192.168.0.90', '2014-02-06 01:03:11', '1391622882296', '1');
INSERT INTO `dgu2000` VALUES ('3', '192.168.0.3', '2014-02-06 01:37:42', '1391622882296', '1');
INSERT INTO `dgu2000` VALUES ('4', '192.168.0.4', '2014-02-06 01:38:23', '1391622882296', '');
INSERT INTO `dgu2000` VALUES ('5', '192.168.0.5', '2014-02-06 18:28:39', '1391682519526', '111');

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `projectId` varchar(11) NOT NULL,
  `projectName` varchar(255) DEFAULT NULL,
  `dateString` varchar(255) DEFAULT NULL,
  `dateTime` bigint(20) DEFAULT NULL,
  `personInCharge` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`projectId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES ('1', '无', null, null, null);
INSERT INTO `project` VALUES ('111', '唐朝', '2014-02-18', '1392652800000', '朱');
INSERT INTO `project` VALUES ('11111', '222', '', '0', '111');

-- ----------------------------
-- Table structure for projectandwindfarm
-- ----------------------------
DROP TABLE IF EXISTS `projectandwindfarm`;
CREATE TABLE `projectandwindfarm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `projectId` varchar(255) NOT NULL,
  `windFarmId` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of projectandwindfarm
-- ----------------------------

-- ----------------------------
-- Table structure for windfarm
-- ----------------------------
DROP TABLE IF EXISTS `windfarm`;
CREATE TABLE `windfarm` (
  `windFarmId` int(11) NOT NULL AUTO_INCREMENT,
  `windFarmName` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`windFarmId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of windfarm
-- ----------------------------
INSERT INTO `windfarm` VALUES ('1', '无风场', null);
INSERT INTO `windfarm` VALUES ('2', '骑龙山', '云南');
