/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : sf

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-04-12 00:14:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_member
-- ----------------------------
DROP TABLE IF EXISTS `t_member`;
CREATE TABLE `t_member` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '会员编号',
  `account` varchar(255) NOT NULL COMMENT '会员帐号',
  `pwd` varchar(255) NOT NULL COMMENT '会员密码',
  `nick` varchar(255) NOT NULL COMMENT '会员昵称',
  `login_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后登录时间',
  `login_num` int(11) NOT NULL COMMENT '登录次数',
  `login_ip` varchar(255) NOT NULL COMMENT '最后登录ip',
  `online_status` int(11) NOT NULL COMMENT '在线状态',
  `parent_id` int(11) NOT NULL COMMENT '代理接口',
  `use_status` int(11) NOT NULL COMMENT '用户状态0正常1停用2连锁3未激活',
  `betting_status` int(11) NOT NULL COMMENT '投注状态 0正常1禁止投注2联锁',
  `black_status` int(11) DEFAULT NULL COMMENT '是否处于黑名单中 0正常 1无法存提款',
  `session_id` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member
-- ----------------------------

-- ----------------------------
-- Table structure for t_member_bank
-- ----------------------------
DROP TABLE IF EXISTS `t_member_bank`;
CREATE TABLE `t_member_bank` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `member_id` int(11) NOT NULL,
  `bank_name` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `branch_name` varchar(255) DEFAULT NULL,
  `bank_number` int(11) DEFAULT NULL,
  `real_name` varchar(255) DEFAULT NULL,
  `bind_time` datetime DEFAULT NULL,
  `first_choice` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `member_id` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member_bank
-- ----------------------------

-- ----------------------------
-- Table structure for t_member_money
-- ----------------------------
DROP TABLE IF EXISTS `t_member_money`;
CREATE TABLE `t_member_money` (
  `id` int(11) NOT NULL COMMENT '编号',
  `member_id` int(11) NOT NULL COMMENT '会员id',
  `money` varchar(255) NOT NULL COMMENT '余额',
  `platform` int(11) NOT NULL COMMENT '平台',
  `auto` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member_money
-- ----------------------------
