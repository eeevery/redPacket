/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : db_redpacket

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2019-06-08 16:44:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_user_red_packet`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_red_packet`;
CREATE TABLE `tb_user_red_packet` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `red_packet_id` int(12) NOT NULL,
  `user_id` int(12) NOT NULL,
  `amount` decimal(16,2) NOT NULL,
  `grab_time` timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `note` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_red` (`red_packet_id`),
  CONSTRAINT `user_red` FOREIGN KEY (`red_packet_id`) REFERENCES `tb_red_packet` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user_red_packet
-- ----------------------------
