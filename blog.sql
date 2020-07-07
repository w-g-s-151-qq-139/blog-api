/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : blog

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 06/07/2020 19:13:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '唯一标识id，主键，不为空',
  `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '文章标题',
  `label` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '文章标签',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '文章内容',
  `create_time` datetime(0) DEFAULT NULL COMMENT '创建时间',
  `creater_id` int(11) DEFAULT NULL COMMENT '创建人id',
  `status` int(11) DEFAULT 0 COMMENT '文章状态：-1.垃圾箱；0.草稿；1发表，默认0',
  `appreciate` int(11) DEFAULT NULL COMMENT '点赞数',
  `browse` int(11) DEFAULT NULL COMMENT '浏览数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for collection
-- ----------------------------
DROP TABLE IF EXISTS `collection`;
CREATE TABLE `collection`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '唯一标识id，主键不为空',
  `blog_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '收藏文章id',
  `collector_id` int(11) DEFAULT NULL COMMENT '收藏人id',
  `blog_title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '文章标题',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '唯一标识id，主键不为空',
  `createrid` int(11) DEFAULT NULL COMMENT '创建人id',
  `comment_blog_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '评论博客id',
  `comment_id` int(11) DEFAULT 0 COMMENT '回复评论的id，默认0',
  `content` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '评论内容',
  `created` datetime(0) DEFAULT NULL COMMENT '创建时间',
  `appreciate` int(11) DEFAULT NULL COMMENT '点赞数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for follow
-- ----------------------------
DROP TABLE IF EXISTS `follow`;
CREATE TABLE `follow`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一标识id，自增主键不为空',
  `from_id` int(11) DEFAULT NULL COMMENT '关注发起人id',
  `to_id` int(11) DEFAULT NULL COMMENT '被关注人id',
  `status` int(11) DEFAULT NULL COMMENT '关注状态：-1.被关注，0.无关注，1关注，2相互关注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for identifying_code
-- ----------------------------
DROP TABLE IF EXISTS `identifying_code`;
CREATE TABLE `identifying_code`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一标识id，自增主键不为空',
  `create_time` datetime(0) DEFAULT NULL COMMENT '生效时间',
  `dead_time` datetime(0) DEFAULT NULL COMMENT '失效时间',
  `code` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '验证码',
  `create_ip` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建着ip地址',
  `used` int(11) DEFAULT 0 COMMENT '用途：0.无效1.注册账号2.手机验证码登录3.邮箱修改4.手机号修改\n默认为0',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for label
-- ----------------------------
DROP TABLE IF EXISTS `label`;
CREATE TABLE `label`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一标识id，自增，主键不为空',
  `content` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标签内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '唯一标识id，主键不为空',
  `creator_id` int(11) DEFAULT NULL COMMENT '发件人id',
  `created` datetime(0) DEFAULT NULL COMMENT '创建时间',
  `addressee_id` int(11) DEFAULT NULL COMMENT '收信人id',
  `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '私信标题',
  `content` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '私信内容',
  `dispatch_status` int(11) DEFAULT 0 COMMENT '发件人私信状态：0.草稿箱，1.发件箱，-1.垃圾箱，默认0',
  `receipt_status` int(11) DEFAULT 0 COMMENT '收件人私信状态：0.未读，1.已读，-1.垃圾箱，默认0',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一标识id，自增，主键不为空\r\n',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `nickname` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户昵称',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户手机号',
  `email` varchar(35) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户邮箱',
  `pie` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '头像地址',
  `sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户性别',
  `birthday` datetime(0) DEFAULT NULL COMMENT '用户生日',
  `describe` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户简介',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '21232F297A57A5A743894A0E4A801FC3', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (2, 'user', 'EE11CBB19052E40B07AAC0CA060C23EE', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
