CREATE DATABASE bwr_Blog; -- 创建数据库
USE bwr_Blog; -- 使用数据库
SELECT * FROM mysql.`user`; -- 查看用户
CREATE USER bwr@127.0.0.1 IDENTIFIED BY '971219'; -- 创建新用户
FLUSH PRIVILEGES; -- 刷新权限
ALTER USER bwr@127.0.0.1 IDENTIFIED WITH mysql_native_password BY '971219'; -- 更改用户密码加密方式（SQLyog不支持MySql8.0以上的caching_cha2_password方式）
GRANT ALL PRIVILEGES ON bwr_blog.* TO bwr@127.0.0.1 WITH GRANT OPTION; -- 授予权限

