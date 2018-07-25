/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50615
Source Host           : localhost:3306
Source Database       : change

Target Server Type    : MYSQL
Target Server Version : 50615
File Encoding         : 65001

Date: 2018-07-25 18:21:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `convertrate`
-- ----------------------------
DROP TABLE IF EXISTS `convertrate`;
CREATE TABLE `convertrate` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `from_country` varchar(10) DEFAULT NULL COMMENT '来源国家',
  `to_country` varchar(10) DEFAULT NULL COMMENT '转换国家',
  `rate` decimal(8,2) DEFAULT NULL COMMENT '汇率',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of convertrate
-- ----------------------------
INSERT INTO `convertrate` VALUES ('1', 'EUR', 'CNY', '8.00');
INSERT INTO `convertrate` VALUES ('2', 'USA', 'CNY', '6.00');
INSERT INTO `convertrate` VALUES ('3', 'HKD', 'CNY', '1.00');
INSERT INTO `convertrate` VALUES ('4', 'GBP', 'CNY', '8.00');
INSERT INTO `convertrate` VALUES ('5', 'JPY', 'CNY', '0.06');
