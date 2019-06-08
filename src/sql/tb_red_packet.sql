/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : db_redpacket

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2019-06-08 16:43:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_red_packet`
-- ----------------------------
DROP TABLE IF EXISTS `tb_red_packet`;
CREATE TABLE `tb_red_packet` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `userId` int(12) NOT NULL,
  `amount` decimal(16,2) NOT NULL,
  `sendDate` timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `total` int(12) NOT NULL,
  `unitAmount` decimal(12,0) NOT NULL,
  `stock` int(12) NOT NULL,
  `version` int(12) NOT NULL DEFAULT '0',
  `note` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_red_packet
-- ----------------------------
INSERT INTO `tb_red_packet` VALUES ('1', '1', '200000.00', '2019-06-08 16:40:32', '20000', '10', '20000', '0', '20万金额，2万个小红包，每个10元');
