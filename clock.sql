/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : clock

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 06/07/2020 19:14:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `a_id` int(11) NOT NULL AUTO_INCREMENT,
  `a_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `a_pwd` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`a_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'admin', 'admin');

-- ----------------------------
-- Table structure for clock_record
-- ----------------------------
DROP TABLE IF EXISTS `clock_record`;
CREATE TABLE `clock_record`  (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_record` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `c_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`c_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of clock_record
-- ----------------------------
INSERT INTO `clock_record` VALUES (1, '王高升 云点', '2018-09-10 16:30:31');
INSERT INTO `clock_record` VALUES (2, '王高升 云点', '2018-09-10 16:30:42');
INSERT INTO `clock_record` VALUES (3, '王高升 云点', '2018-09-10 16:31:21');
INSERT INTO `clock_record` VALUES (4, '王高升 云点', '2018-09-10 16:37:58');
INSERT INTO `clock_record` VALUES (5, '王高升 云点', '2018-09-10 16:40:09');
INSERT INTO `clock_record` VALUES (6, '王高升 云点', '2018-09-10 16:49:00');
INSERT INTO `clock_record` VALUES (7, '王高升 云点', '2018-09-10 17:32:59');
INSERT INTO `clock_record` VALUES (8, '王高升 云点', '2018-09-10 17:34:26');
INSERT INTO `clock_record` VALUES (9, '王高升 云点', '2018-09-10 17:35:25');
INSERT INTO `clock_record` VALUES (10, '王高升 云点', '2018-09-10 17:36:58');
INSERT INTO `clock_record` VALUES (11, '王高升 云点', '2018-09-10 17:37:54');
INSERT INTO `clock_record` VALUES (12, '王高升 云点', '2018-09-10 17:47:48');
INSERT INTO `clock_record` VALUES (13, '王高升 云点', '2018-09-11 08:29:53');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `u_suffix` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `u_sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `u_age` int(11) DEFAULT NULL,
  `u_company` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `u_position` varchar(35) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `u_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `u_email` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `u_wechat` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `u_qq` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `u_desc` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '王高升', '123', '男', NULL, '云点', NULL, '15220245255', NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
