DROP DATABASE IF EXISTS lost_found;
CREATE DATABASE IF NOT EXISTS lost_found;
USE lost_found;
drop table if exists  student ;
drop table if exists  lost_things ;
CREATE TABLE IF NOT EXISTS student (
                                       student_no varchar(10)  NOT NULL  COMMENT '学号',
                                       institute varchar(20) NOT NULL COMMENT'学院',
                                       grade TINYINT UNSIGNED NOT NULL COMMENT'年级',
                                       class varchar(10) NOT NULL COMMENT'班级',
                                       name varchar(10) NOT NULL COMMENT'姓名',
                                       PRIMARY KEY (student_no));

CREATE TABLE IF NOT EXISTS lost_things (
                                           lost_id varchar(10)  NOT NULL  COMMENT '失物id',
                                           lost_name varchar(20) NOT NULL COMMENT'失物名称',
                                           lost_position TINYINT UNSIGNED NOT NULL COMMENT'捡到的地点',
                                           lost_description varchar(10) NOT NULL COMMENT'失物描述',
                                           claim_position varchar(10) NOT NULL COMMENT'领取位置',
                                           lost_date DATE NOT NULL COMMENT'捡到的日期',
                                           is_returned varchar(1) CHECK(is_returned='0'OR is_returned='1') NOT NULL COMMENT'是否已经认领',
                                           PRIMARY KEY (lost_id));