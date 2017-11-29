/*
Navicat MySQL Data Transfer

Source Server         : Bruce.Liu - AliCloud
Source Server Version : 50621
Source Host           : 127.0.0.1:3306
Source Database       : scbrl

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

后台登录控制台
账号:bruceliu
密码:bruceliu

Date: 2017-11-29 17:02:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for b_role
-- ----------------------------
DROP TABLE IF EXISTS `b_role`;
CREATE TABLE `b_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of b_role
-- ----------------------------
INSERT INTO `b_role` VALUES ('1', '是');

-- ----------------------------
-- Table structure for b_user
-- ----------------------------
DROP TABLE IF EXISTS `b_user`;
CREATE TABLE `b_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `open_id` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of b_user
-- ----------------------------
INSERT INTO `b_user` VALUES ('1', 'xx', 'bruceliu', 'bruceliu');
INSERT INTO `b_user` VALUES ('2', 'zz', 'liuwb', 'liuwb');
INSERT INTO `b_user` VALUES ('3', 'fad91665-be94-4446-a740-c6b46072651c', 'cd87e691-32ac-47a6-9b87-f29881bd3a13', '15959276686');

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `menu_id` varchar(36) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_who` varchar(36) DEFAULT NULL,
  `menu_name` varchar(36) DEFAULT NULL,
  `menu_state` varchar(16) DEFAULT NULL,
  `menu_url` varchar(128) DEFAULT NULL,
  `menu_parent` varchar(36) DEFAULT NULL,
  `menu_icon` varchar(128) DEFAULT NULL,
  `menu_order` bigint(5) DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1000', '2017-11-05 18:27:51', 'Bruce.Liu', '管理中心', 'normal', '#', '0', null, '0');
INSERT INTO `sys_menu` VALUES ('2', '2017-11-05 17:00:43', 'Bruce.Liu', '账号管理', 'normal', 'userinfo', '1000', 'sublist-icon glyphicon glyphicon-user', '2');
INSERT INTO `sys_menu` VALUES ('3', '2017-11-05 17:03:07', 'Bruce.Liu', '消息中心', 'normal', 'message', '1000', 'sublist-icon glyphicon glyphicon-envelope', '3');
INSERT INTO `sys_menu` VALUES ('4', '2017-11-05 17:03:13', 'Bruce.Liu', '短信', 'normal', 'smsinfo', '1000', 'sublist-icon glyphicon glyphicon-bullhorn', '4');
INSERT INTO `sys_menu` VALUES ('5', '2017-11-05 17:03:11', 'Bruce.Liu', '实名认证', 'normal', 'identify', '1000', 'sublist-icon glyphicon glyphicon-credit-card', '5');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` varchar(36) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_who` varchar(36) DEFAULT NULL,
  `role_code` varchar(36) DEFAULT NULL,
  `role_name` varchar(36) DEFAULT NULL,
  `role_state` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1024', '2017-11-05 16:57:42', 'Bruce.Liu', 'SuperAdmin', '超管', 'normal');

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `role_menu_id` varchar(36) NOT NULL,
  `menu_del` varchar(8) DEFAULT NULL,
  `menu_exp` varchar(8) DEFAULT NULL,
  `menu_id` varchar(36) DEFAULT NULL,
  `menu_imp` varchar(8) DEFAULT NULL,
  `menu_ins` varchar(8) DEFAULT NULL,
  `menu_sel` varchar(8) DEFAULT NULL,
  `menu_upd` varchar(8) DEFAULT NULL,
  `role_id` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`role_menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('1', 'Y', 'Y', '1', 'Y', 'Y', 'Y', 'Y', '1024');
INSERT INTO `sys_role_menu` VALUES ('1000', null, null, '1000', null, null, null, null, '1024');
INSERT INTO `sys_role_menu` VALUES ('2', 'Y', 'Y', '2', 'Y', 'Y', 'Y', 'Y', '1024');
INSERT INTO `sys_role_menu` VALUES ('3', 'Y', 'Y', '3', 'Y', 'Y', 'Y', 'Y', '1024');
INSERT INTO `sys_role_menu` VALUES ('4', 'Y', 'Y', '4', 'Y', 'Y', 'Y', 'Y', '1024');
INSERT INTO `sys_role_menu` VALUES ('5', 'Y', 'Y', '5', 'Y', 'Y', 'Y', 'Y', '1024');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` varchar(36) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_who` varchar(36) DEFAULT NULL,
  `nick_name` varchar(22) DEFAULT NULL,
  `password` varchar(128) DEFAULT NULL,
  `role_id` varchar(255) DEFAULT NULL,
  `user_state` varchar(16) DEFAULT NULL,
  `username` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1024', '2017-11-05 16:56:34', 'Bruce.Liu', 'Bruce.Liu', '$2a$10$lotlPkk8yrsFh6ZG2wFM2.unFyq/xrPHbaagFRNUyCmMhisRxk75u', '1024', 'normal', 'bruceliu');
