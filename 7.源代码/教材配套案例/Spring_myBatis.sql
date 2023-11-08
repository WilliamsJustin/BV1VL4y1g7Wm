USE Spring;
# 创建一个名称为student的表
CREATE TABLE student (
  id int(11) PRIMARY KEY AUTO_INCREMENT,
  username varchar(255),
	password varchar(255),
  course varchar(255)
 );
# 插入数据
INSERT INTO student VALUES (1, 'zhangsan','123456', 'Java');
INSERT INTO student VALUES (2, 'lisi', '123456', 'HTML');
INSERT INTO student VALUES (3, 'ww', '123456', 'c');

