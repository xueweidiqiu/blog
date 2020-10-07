-- 用户表
CREATE TABLE IF NOT EXISTS `user` (
	`id` BIGINT NOT NULL PRIMARY KEY COMMENT 'id',
	`uid` INT NOT NULL COMMENT 'UID',
	`account` VARCHAR(20) NOT NULL COMMENT '账号',
	`password` BINARY(32) NOT NULL COMMENT '密码',
	`name` VARCHAR(20) NOT NULL COMMENT '用户名',
	`email` VARCHAR(50) COMMENT '邮箱',
	`sex` ENUM('保密','男','女') DEFAULT '保密' COMMENT '性别',
	`birthday` DATE COMMENT '生日',
	`avatar_location` VARCHAR(100) COMMENT '用户头像位置',
	`personal_status` VARCHAR(100) COMMENT '个性签名',
	`register_time` DATETIME COMMENT '注册时间',
	`is_delete` TINYINT COMMENT '是否已注销'
)ENGINE=INNODB DEFAULT CHARSET = utf8mb4;
ALTER TABLE `user` COMMENT = '用户表';

-- 登录日志表
CREATE TABLE `login_log` (
	`id` BIGINT PRIMARY KEY COMMENT '主键',
	`user_id` BIGINT NOT NULL COMMENT '用户表id',
	`last_IP` INT COMMENT '上次登录IP,INET_ATON（） 将IP转为十进制数字，
INET_NTOA（）将数字转换为IP。',
	`last_login_time` DATETIME COMMENT '上次登陆时间'
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT='登录日志表';

-- 文章表
CREATE TABLE `article` (
	`id` BIGINT PRIMARY KEY COMMENT '主键',
	`user_id` BIGINT NOT NULL COMMENT '作者id',
	`title` VARCHAR(20) NOT NULL COMMENT '标题',
	`content_location` VARCHAR(100) COMMENT '正文位置',
	`category_id` BIGINT COMMENT '分类id',
	`reading_volume` INT COMMENT '阅读量',
	`create_time` DATETIME COMMENT '发表时间',
	`last_change_time` DATETIME COMMENT '上次修改时间',
	`is_delete` TINYINT COMMENT '是否已删除'
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT='文章表';

-- 文章类别表
CREATE TABLE `category` (
	`id` BIGINT PRIMARY KEY COMMENT '主键',
	`name` VARCHAR(10) COMMENT '分类名称',
	`is_delete` TINYINT COMMENT '是否已删除'
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT='文章类别表';

-- 文章浏览日志
CREATE TABLE `article_read_log` (
	`id` BIGINT PRIMARY KEY COMMENT '主键',
	`article_id` BIGINT COMMENT '文章id',
	`user_id` BIGINT COMMENT '用户id',
	`read_time` DATETIME COMMENT '浏览时间'
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT='文章浏览日志';

-- 评论表
CREATE TABLE `comment` (
	`id` BIGINT PRIMARY KEY COMMENT '主键',
	`article_id` BIGINT COMMENT '文章id',
	`user_id` BIGINT COMMENT '用户id',
	`content` VARCHAR(2000) COMMENT '评论内容',
	`is_delete` TINYINT COMMENT '是否已删除'
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT='评论表';
ALTER TABLE `comment` ADD `is_reply` TINYINT COMMENT '是否是回复';

-- 评论回复表
CREATE TABLE `comment_reply` (
	`id` BIGINT PRIMARY KEY COMMENT '主键',
	`comment_reply_id` BIGINT COMMENT '原评论id',
	`comment_id` BIGINT COMMENT '回复id'
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT='评论回复表';

-- 评论日志
CREATE TABLE `comment_log` (
	`id` BIGINT PRIMARY KEY COMMENT '主键',
	`comment_id` BIGINT COMMENT '评论id',
	`create_time` DATETIME COMMENT '评论时间'
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT='评论日志';