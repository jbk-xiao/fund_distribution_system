CREATE DATABASE `fund_distribution_system`;
USE `fund_distribution_system`;

-- 销售领导表
CREATE TABLE `salesLeader` (
    `lid` CHAR(10) NOT NULL COMMENT '主键，工号，与登录账号一致',
    `name` VARCHAR(32) NOT NULL COMMENT '领导姓名',
    `mail` VARCHAR(32) NOT NULL COMMENT '邮箱地址',
    `team` VARCHAR(32) NOT NULL COMMENT '团队名称',
    PRIMARY KEY (`lid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='销售领导表，记录销售领导个人信息，对应团队信息，不依赖于其它表';

-- 销售经理表
CREATE TABLE `salesManager` (
    `mid` CHAR(10) NOT NULL COMMENT '主键，工号，与登录账号一致',
    `name` VARCHAR(32) NOT NULL COMMENT '经理姓名',
    `mail` VARCHAR(32) NOT NULL COMMENT '邮箱地址',
    `lid` VARCHAR(10) NOT NULL COMMENT '领导id外键，同时也是团队id',
    `team` VARCHAR(32) NOT NULL COMMENT '团队名称',
    `leader` VARCHAR(32) NOT NULL COMMENT '团队领导姓名',
    `channelNum` INT NOT NULL DEFAULT 0 COMMENT '随责任记录表而改变',
    `visitNum` INT NOT NULL DEFAULT 0 COMMENT '随历史拜访记录表而改变',
    PRIMARY KEY (`mid`) USING BTREE,
    FOREIGN KEY (`lid`) REFERENCES `salesLeader`(`lid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='销售经理表，记录销售经理个人信息，依赖于销售领导表的外键，业务需求添加了团队信息相关的冗余字段';

-- 销售渠道表
CREATE TABLE `salesChannel` (
    `cid` CHAR(12) NOT NULL COMMENT '主键，渠道编号，使用银行联行号',
    `name` VARCHAR(100) NOT NULL COMMENT '渠道名称',
    `organization` VARCHAR(100) NOT NULL COMMENT '所属机构',
    `province` VARCHAR(32) NOT NULL COMMENT '所在省份',
    `city` VARCHAR(32) NOT NULL COMMENT '所在市区',
    `zip` CHAR(6) NOT NULL COMMENT '邮编',
    `address` TINYTEXT NOT NULL COMMENT '详细地址',
    `phoneNumber` VARCHAR(100) NOT NULL COMMENT '联系方式',
    `openHours` CHAR(30) NOT NULL COMMENT '对公营业时间hh:mm-hh:mm',
    `longitude` DECIMAL(15, 12) NOT NULL COMMENT '经度',
    `latitude` DECIMAL(15, 13) NOT NULL COMMENT '纬度',
    PRIMARY KEY (`cid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='销售渠道表，记录销售渠道的详细信息，不设外键';

-- 责任记录
CREATE TABLE `responsibility` (
    `rid` INT NOT NULL AUTO_INCREMENT COMMENT '自增主键，责任记录唯一id，使用时加上前缀r',
    `cid` CHAR(12) NOT NULL COMMENT '渠道编号外键',
    `mid` CHAR(10) NOT NULL COMMENT '经理工号外键',
    `lid` CHAR(10) NOT NULL COMMENT '领导工号外键',
    PRIMARY KEY (`rid`) USING BTREE,
    FOREIGN KEY (`cid`) REFERENCES `salesChannel`(`cid`),
    FOREIGN KEY (`mid`) REFERENCES `salesManager`(`mid`),
    FOREIGN KEY (`lid`) REFERENCES `salesLeader`(`lid`),
    UNIQUE KEY (`cid`, `mid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='责任记录表，依赖于销售领导、销售经理、销售渠道表的主键';

-- 拜访记录表
CREATE TABLE `visitLog` (
    `vid` INT NOT NULL AUTO_INCREMENT COMMENT '自增主键，拜访记录唯一id，使用时添加前缀v',
    `cid` CHAR(12) NOT NULL COMMENT '渠道编号外键',
    `channel` VARCHAR(100) NOT NULL COMMENT '渠道名称',
    `organization` VARCHAR(100) NOT NULL COMMENT '渠道所属机构',
    `mid` CHAR(10) NOT NULL COMMENT '经理工号外键',
    `manager` VARCHAR(100) NOT NULL COMMENT '经理姓名',
    `lid` CHAR(10) NOT NULL COMMENT '领导工号外键',
    `date` CHAR(10) NOT NULL COMMENT '拜访日期，具体到天即可，一天不要添加两次拜访记录',
    `abstract` TINYTEXT NOT NULL COMMENT '拜访摘要',
    `detail` TEXT NOT NULL COMMENT '拜访详情',
    PRIMARY KEY (`vid`) USING BTREE,
    FOREIGN KEY (`cid`) REFERENCES `salesChannel`(`cid`),
    FOREIGN KEY (`mid`) REFERENCES `salesManager`(`mid`),
    FOREIGN KEY (`lid`) REFERENCES `salesLeader`(`lid`),
    UNIQUE KEY (`cid`, `mid`, `date`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='拜访记录表，依赖于销售领导、销售经理、销售渠道表的主键，设置销售渠道、销售经理、拜访日期这一唯一主键';