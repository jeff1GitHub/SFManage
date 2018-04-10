/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : game

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-04-10 07:35:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_betting
-- ----------------------------
DROP TABLE IF EXISTS `t_betting`;
CREATE TABLE `t_betting` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '注单流水号',
  `period` varchar(255) NOT NULL COMMENT '期号',
  `betting_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '投注时间',
  `lottery_id` int(11) NOT NULL COMMENT '彩票id',
  `project` int(11) NOT NULL COMMENT '投注项',
  `odds` double NOT NULL COMMENT '赔率',
  `money` int(11) NOT NULL COMMENT '投注金额',
  `square` int(11) NOT NULL DEFAULT '0' COMMENT '是否结算',
  `square_time` timestamp NULL DEFAULT NULL COMMENT '结算时间',
  `prize` int(11) NOT NULL DEFAULT '0' COMMENT '是否派彩',
  `prize_time` timestamp NULL DEFAULT NULL COMMENT '派奖时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_betting
-- ----------------------------

-- ----------------------------
-- Table structure for t_manage
-- ----------------------------
DROP TABLE IF EXISTS `t_manage`;
CREATE TABLE `t_manage` (
  `id` int(11) NOT NULL COMMENT '代理帐号',
  `account` varchar(255) NOT NULL COMMENT '代理帐号',
  `pwd` varchar(255) NOT NULL COMMENT '代理密码',
  `nick` varchar(255) NOT NULL COMMENT '代理昵称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_manage
-- ----------------------------

-- ----------------------------
-- Table structure for t_member
-- ----------------------------
DROP TABLE IF EXISTS `t_member`;
CREATE TABLE `t_member` (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member
-- ----------------------------
