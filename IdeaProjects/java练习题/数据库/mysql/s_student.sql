/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3307
Source Database       : db_student

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-06-26 13:39:23
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `s_student`
-- ----------------------------
DROP TABLE IF EXISTS `s_student`;
CREATE TABLE `s_student` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `sex` varchar(3) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `date` varchar(20) DEFAULT NULL,
  `tel` varchar(15) DEFAULT NULL,
  `address` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of s_student
-- ----------------------------
INSERT INTO s_student VALUES ('1', '小白', '女', '111', '2000/1/1', '12345678910', '重庆市');
INSERT INTO s_student VALUES ('2', '小红', '女', '111', '2000/1/1', '12345678910', '北京市');
