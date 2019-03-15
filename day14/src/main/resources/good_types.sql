/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50560
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50560
 File Encoding         : 65001

 Date: 15/03/2019 16:33:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for good_types
-- ----------------------------
DROP TABLE IF EXISTS `good_types`;
CREATE TABLE `good_types`  (
  `tgt_id` int(11) NOT NULL AUTO_INCREMENT,
  `tgt_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tgt_is_show` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tgt_order` int(2) NULL DEFAULT NULL,
  PRIMARY KEY (`tgt_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品分类信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of good_types
-- ----------------------------
INSERT INTO `good_types` VALUES (1, '绿色蔬菜', '1', 1);

SET FOREIGN_KEY_CHECKS = 1;
