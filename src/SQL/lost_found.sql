DROP DATABASE IF EXISTS lost_found;
CREATE DATABASE IF NOT EXISTS lost_found;
USE lost_found;
drop table if exists  lf_student ;
drop table if exists  lf_lost_thing ;
CREATE TABLE IF NOT EXISTS lf_student (
                                          student_id TINYINT UNSIGNED  NOT NULL AUTO_INCREMENT COMMENT '学生id',
                                          student_no varchar(10)  NOT NULL  COMMENT '学号',
                                          student_password VARCHAR(20) NOT NULL COMMENT '登录密码',
                                          institute varchar(20) NOT NULL COMMENT'学院',
                                          grade varchar(4) NOT NULL COMMENT'年级',
                                          classbj varchar(10) NOT NULL COMMENT'班级',
                                          name varchar(10) NOT NULL COMMENT'姓名',
                                          PRIMARY KEY (student_id));

CREATE TABLE IF NOT EXISTS lf_lost_thing (
                                             lost_id TINYINT UNSIGNED  NOT NULL AUTO_INCREMENT COMMENT '失物id',
                                             lost_name varchar(20) NOT NULL COMMENT'失物名称',
                                             lost_position varchar(40) NOT NULL COMMENT'捡到的地点',
                                             lost_description varchar(100) NOT NULL COMMENT'失物描述',
                                             claim_position varchar(40) NOT NULL COMMENT'领取位置',
                                             lost_date DATE NOT NULL COMMENT'捡到的日期',
                                             is_returned varchar(1) CHECK(is_returned='0'OR is_returned='1') NOT NULL COMMENT'是否已经认领',
                                             PRIMARY KEY (lost_id));



INSERT INTO lf_lost_thing VALUES(1,'钥匙','二教','xxx','xxx','2022-8-1','1');
INSERT INTO lf_lost_thing VALUES(2,'手机','三教','xxx','xxx','2022-8-2','0');


INSERT INTO lf_student VALUES(1,'2021211000','xxx','2021','xxx','xxx');
INSERT INTO lf_student VALUES(2,'2021211001','xxx','2021','xxx','xxx');

