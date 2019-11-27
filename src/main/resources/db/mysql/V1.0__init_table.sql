/*
 Navicat Premium Data Transfer

 Source Server         : 10.1.52.26
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : 10.1.52.26:3306
 Source Schema         : audit

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 12/11/2019 15:11:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;


-- ----------------------------
-- Table structure for ask_history
-- ----------------------------
DROP TABLE IF EXISTS `ask_history`;
CREATE TABLE `ask_history`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ask_history` varchar(600) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `datatime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 266 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for question_list
-- ----------------------------
DROP TABLE IF EXISTS `question_list`;
CREATE TABLE `question_list`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(600) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `question`(`question`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 63 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of question_list
-- ----------------------------
INSERT INTO `question_list` VALUES (1, '13年，列一下投资金额大于十二亿的工程项目有哪些？');
INSERT INTO `question_list` VALUES (2, '2013年之前，哪些工程项目的投资金额大于10亿？');
INSERT INTO `question_list` VALUES (3, '2013年之后，投资金额大于10亿的工程项目有哪些？');
INSERT INTO `question_list` VALUES (4, '2013年以前，哪些工程项目的投资金额大于10亿元？');
INSERT INTO `question_list` VALUES (5, '2013年以前，地铁集团作为招标人的项目有哪些？ ');
INSERT INTO `question_list` VALUES (6, '2013年以后，投资金额大于10亿的工程项目有哪些？');
INSERT INTO `question_list` VALUES (7, '2013年以来，投资金额大于一百亿的工程项目有哪些？');
INSERT INTO `question_list` VALUES (8, '2013年以来，投资金额大于二千二百亿的工程项目有哪些？ ');
INSERT INTO `question_list` VALUES (9, '2013年以来，招标人为地铁集团的项目有哪些？ ');
INSERT INTO `question_list` VALUES (10, '2013年以来，招标人是地铁集团的项目有哪些？ ');
INSERT INTO `question_list` VALUES (11, '2013年以来，招标单位为地铁集团的项目有哪些？ ');
INSERT INTO `question_list` VALUES (12, '2013年以来，招标单位为是地铁集团的项目有哪些？ ');
INSERT INTO `question_list` VALUES (13, '2013年以来，有哪些项目的招标人是地铁集团？ ');
INSERT INTO `question_list` VALUES (14, '2013年以来，有哪些项目的招标单位是地铁集团？ ');
INSERT INTO `question_list` VALUES (15, '2013年列一下投资金额大于等于十万元的');
INSERT INTO `question_list` VALUES (16, '2013年前，哪些工程项目的投资金额大于10亿？');
INSERT INTO `question_list` VALUES (17, '2013年后，投资金额大于10亿的工程项目有哪些？');
INSERT INTO `question_list` VALUES (18, '2013年来列一下投资金额大于等于十万元的');
INSERT INTO `question_list` VALUES (19, '2013年来，列一下投资金额大于等于十块的工程项目有哪些？');
INSERT INTO `question_list` VALUES (20, '2013年来，列一下投资金额超出十万元的工程项目有哪些？');
INSERT INTO `question_list` VALUES (21, '2013年来，列一下投资金额超过10元的工程项目有哪些？');
INSERT INTO `question_list` VALUES (22, '2013年至今，投资金额大于10亿的工程项目有哪些？');
INSERT INTO `question_list` VALUES (23, '2013年，列一下投资金额大于10亿的工程项目有哪些？');
INSERT INTO `question_list` VALUES (60, '2018年提交的市政项目，开标成功的企业数大于2的项目有哪些');
INSERT INTO `question_list` VALUES (62, '2018年水利项目，开标成功的企业不少于5家的项目');
INSERT INTO `question_list` VALUES (53, '今年提交的区属项目');
INSERT INTO `question_list` VALUES (55, '前年受理的市属项目');
INSERT INTO `question_list` VALUES (54, '去年提交的区属项目');
INSERT INTO `question_list` VALUES (24, '哪些招投标项目已经交了投标保证金');
INSERT INTO `question_list` VALUES (25, '哪些招投标项目已缴纳投标保证金 ');
INSERT INTO `question_list` VALUES (26, '哪些招投标项目还未交投标保证金');
INSERT INTO `question_list` VALUES (27, '哪些招投标项目还未缴纳投标保证金');
INSERT INTO `question_list` VALUES (59, '在2017年以前评标办法是平均报价法的项目');
INSERT INTO `question_list` VALUES (28, '已经交了投标保证金的招投标项目清单');
INSERT INTO `question_list` VALUES (29, '已经交过投标保证金的招投标项目清单 ');
INSERT INTO `question_list` VALUES (30, '已经缴了投标保证金的招投标项目清单 ');
INSERT INTO `question_list` VALUES (31, '已经缴纳投标保证金的招投标项目清单');
INSERT INTO `question_list` VALUES (32, '已缴纳投标保证金的招投标项目清单');
INSERT INTO `question_list` VALUES (33, '投标保证金已交的招投标项目清单');
INSERT INTO `question_list` VALUES (34, '投标保证金已经缴纳的招投标项目清单 ');
INSERT INTO `question_list` VALUES (35, '投标保证金已缴纳的招投标项目清单');
INSERT INTO `question_list` VALUES (36, '投标保证金没有交的招投标项目清单');
INSERT INTO `question_list` VALUES (37, '投标保证金没有缴纳的招投标项目清单');
INSERT INTO `question_list` VALUES (38, '投标保证金还未交的招投标项目清单');
INSERT INTO `question_list` VALUES (39, '投标保证金还没缴纳的招投标项目清单');
INSERT INTO `question_list` VALUES (40, '招投标项目中已缴纳投标保证金的有哪些 ');
INSERT INTO `question_list` VALUES (41, '招投标项目中未缴纳投标保证金');
INSERT INTO `question_list` VALUES (42, '有交投标保证金的招投标项目清单 ');
INSERT INTO `question_list` VALUES (43, '未缴纳投标保证金的招投标项目清单');
INSERT INTO `question_list` VALUES (44, '请列一下招投标项目已经缴纳投标保证金');
INSERT INTO `question_list` VALUES (45, '请列一下招投标项目的投标保证金已经交了 ');
INSERT INTO `question_list` VALUES (46, '请列一下招投标项目还未缴纳投标保证金');
INSERT INTO `question_list` VALUES (47, '请列一下招投标项目还未缴纳投标保证金');
INSERT INTO `question_list` VALUES (48, '请列出招投标项目中已缴纳投标保证金的清单？ ');
INSERT INTO `question_list` VALUES (49, '请列出招投标项目中未缴纳投标保证金的清单？');
INSERT INTO `question_list` VALUES (50, '请找出招投标项目已缴纳投标保证金');
INSERT INTO `question_list` VALUES (51, '请找出招投标项目还未缴纳投标保证金');
INSERT INTO `question_list` VALUES (57, '近三年以来提交的参与开标企业大于2家的项目有哪些');
INSERT INTO `question_list` VALUES (58, '近三年以来提交的参与开标企业大于两个的项目有哪些');
INSERT INTO `question_list` VALUES (56, '近三年以来提交的省属项目');
INSERT INTO `question_list` VALUES (52, '还没缴纳投标保证金的招投标项目清单');
INSERT INTO `question_list` VALUES (61, '项目类型为房建项目');



SET FOREIGN_KEY_CHECKS = 1;
