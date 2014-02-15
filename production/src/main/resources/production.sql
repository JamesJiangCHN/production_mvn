/*
Navicat MySQL Data Transfer

Source Server         : 10.100.0.202
Source Server Version : 50521
Source Host           : 10.100.0.202:3306
Source Database       : production

Target Server Type    : MYSQL
Target Server Version : 50521
File Encoding         : 65001

Date: 2014-02-14 16:36:14
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
  `id` int(11) NOT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `dateString` varchar(255) DEFAULT NULL,
  `addTime` bigint(20) DEFAULT NULL,
  `projectId` int(11) NOT NULL,
  PRIMARY KEY (`id`,`projectId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dgu2000
-- ----------------------------
INSERT INTO `dgu2000` VALUES ('0', '192.168.0.', '2014-02-08 10:48:44', '1391827724171', '2');
INSERT INTO `dgu2000` VALUES ('0', '192.168.0.', '2014-02-08 15:44:35', '1391845475046', '4');
INSERT INTO `dgu2000` VALUES ('2', '192.168.0.90', '2014-02-06 01:03:11', '1391622882296', '1');
INSERT INTO `dgu2000` VALUES ('3', '192.168.0.3', '2014-02-06 01:37:42', '1391622882296', '1');
INSERT INTO `dgu2000` VALUES ('4', '192.168.0.4', '2014-02-06 01:38:23', '1391622882296', '1');
INSERT INTO `dgu2000` VALUES ('5', '192.168.0.5', '2014-02-06 18:28:39', '1391682519526', '2');
INSERT INTO `dgu2000` VALUES ('6', '192.168.0.', '2014-02-06 20:49:03', '1391690943382', '2');

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `projectId` varchar(11) NOT NULL,
  `projectName` varchar(255) DEFAULT NULL,
  `windFarmId` int(11) NOT NULL,
  `dateString` varchar(255) DEFAULT NULL,
  `dateTime` bigint(20) DEFAULT NULL,
  `personInCharge` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`projectId`,`windFarmId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES ('1', '无', '1', null, null, null);
INSERT INTO `project` VALUES ('2', '大唐', '2', '2014-02-08 13:49:58', '1391838598000', '章钱');
INSERT INTO `project` VALUES ('3', '无敌项目', '1', '2014-02-08 14:20:27', '1391840427562', '超人');
INSERT INTO `project` VALUES ('4', '2', '2', '2014-02-08 14:20:36', '1391840436406', '2');
INSERT INTO `project` VALUES ('5', '1', '1', '2014-02-04', '1391443200000', '2');

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
