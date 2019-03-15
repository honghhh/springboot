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

 Date: 15/03/2019 16:33:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for good_infos
-- ----------------------------
DROP TABLE IF EXISTS `good_infos`;
CREATE TABLE `good_infos`  (
  `tg_id` int(11) NOT NULL AUTO_INCREMENT,
  `tg_title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tg_price` decimal(8, 2) NULL DEFAULT NULL,
  `tg_unit` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tg_order` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tg_type_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`tg_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of good_infos
-- ----------------------------
INSERT INTO `good_infos` VALUES (1, '油菜', 12.60, '斤', '2', 1);

SET FOREIGN_KEY_CHECKS = 1;
