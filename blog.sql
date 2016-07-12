use test;


DROP TABLE IF EXISTS `b_blog`;
CREATE TABLE `b_blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `des` varchar(500) DEFAULT NULL COMMENT '简介',
  `context` longtext COMMENT '内容',
  `userId` int(11) NOT NULL DEFAULT '0' COMMENT '作者id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='博客表';
insert into b_blog(title) values('和');


DROP TABLE IF EXISTS `b_role`;
CREATE TABLE `b_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='用户角色表';



DROP TABLE IF EXISTS `b_user`;
CREATE TABLE `b_user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `level` int(10) DEFAULT NULL COMMENT '等级',
  `des` varchar(200) DEFAULT NULL COMMENT '简介',
  `tel` varchar(200) DEFAULT NULL COMMENT '电话',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='用户表';




DROP TABLE IF EXISTS `b_user_blog`;
CREATE TABLE `b_user_blog` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `userId` int(20) DEFAULT NULL,
  `roleId` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户-博客对应表';




DROP TABLE IF EXISTS `b_user_role`;
CREATE TABLE `b_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `roleId` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户角色对应表';
