-- 数据库脚本
DROP DATABASE IF EXISTS  scss;
CREATE DATABASE scss DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

use scss;

CREATE TABLE course
(
  id bigint(19) PRIMARY KEY COMMENT '唯一标识',
  name VARCHAR(80) NOT NULL COMMENT '课程名称',
  teacher VARCHAR(30) NOT NULL COMMENT '任课老师',
  intro VARCHAR(200) NOT NULL COMMENT '课程简介',
  service_teacher VARCHAR(30) NOT NULL COMMENT '班主任',
  service_teacher_tel VARCHAR(20) NOT NULL COMMENT '班主任电话',
  begin_teach_time DATETIME NOT NULL COMMENT '开始上课时间',
  end_teach_time DATETIME NOT NULL COMMENT '结束上课时间',
  begin_select_time DATETIME NOT NULL COMMENT '开始选课时间',
  end_select_time DATETIME NOT NULL COMMENT '结束选课时间',
  classroom VARCHAR(20) NOT NULL COMMENT '教室',
  max_amount int(4) DEFAULT 30 NOT NULL COMMENT '上课人数上限',
  current_amount int(4) DEFAULT 0 NOT NULL COMMENT '当前已选人数',
  credit int(2) DEFAULT 3 NOT NULL COMMENT '学分',
  status CHAR(2) DEFAULT 'AC' NOT NULL COMMENT '状态：AC可选；CM完成；PS备选'
);
use scss;
CREATE TABLE cadre
(
  id bigint(19) PRIMARY KEY COMMENT '唯一标识',
  name VARCHAR(80) NOT NULL COMMENT '干部名称',
  employee_card VARCHAR(30) NOT NULL COMMENT '工作证',
  sex VARCHAR(10) NOT NULL COMMENT '性别',
  tel VARCHAR(15) NOT NULL COMMENT '电话',
  email VARCHAR(30)NOT NULL COMMENT'邮箱'
);

CREATE TABLE sc_info
(
  cadre_id bigint(19) NOT NULL COMMENT '唯一标识',
  course_id bigint(19) NOT NULL COMMENT '唯一标识',
  opt_type char(2) NOT NULL COMMENT '操作类型：选课：XK、退课：TK、排队：PD',
  opt_time datetime DEFAULT current_timestamp NOT NULL COMMENT '操作时间',
  attendance char(2) DEFAULT 'CQ' NOT NULL COMMENT '出勤情况：出勤：CQ、缺勤：QQ',
  primary key id_pk (cadre_id,course_id)
);


CREATE TABLE sys_params
(
  id varchar(50) primary key,
  value varchar(100) NOT NULL
);

INSERT INTO cadre VALUES
  (1,'张小偿','20106221122','女','1333333333','test1@163.com'),
  (2,'刘匀空','20106221123','男','1333333333','test2@163.com'),
  (3,'赵成仓','20106221124','男','1333333333','test3@163.com'),
  (4,'封昆','20106221121','男','1333333333','test4@163.com'),
  (5,'于楠','20106221126','女','1333333333','test5@163.com'),
  (6,'钱云','20160220010','女','1333333333','test6@163.com'),
  (7,'许中良','20160220011','男','1333333333','test7@163.com'),
  (8,'李权','20160220012','男','1333333333','test8@163.com'),
  (9,'刘书有','20160220013','男','1333333333','test9@163.com'),
  (10,'葛纯希','20160220014','女','1333333333','test10@163.com'),
  (11,'张汉国','20160220015','男','1333333333','test11@163.com'),
  (12,'方舍','20160220016','男','1333333333','test12@163.com'),
  (13,'刘天会','20160220017','女','1333333333','test13@163.com'),
  (14,'周传伟','20160220018','男','1333333333','test14@163.com'),
  (15,'王云海','20160220019','男','1333333333','test15@163.com');
INSERT INTO sc_info (cadre_id,course_id,opt_type,opt_time) VALUES
  (1,2,'XK','2018-01-23 10:30:22'),
  (1,4,'XK','2018-01-13 10:30:22'),
  (1,5,'TK','2018-01-23 10:30:22'),
  (1,10,'XK','2018-01-23 10:30:22'),
  (2,4,'PD','2018-01-23 10:30:22'),
  (3,4,'PD','2018-01-23 08:30:22');

INSERT INTO sys_params VALUES
  ('MIN_CREDIT','15'),
  ('MAX_CREDIT','25'),
  ('COUNT_BEGIN_DATE','2017-09-01'),
  ('COUNT_END_DATE','2018-03-01');

commit;