package com.yuanerya.lostfound.domain;


import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Student {
    @TableId(value = "student_id")
    private String studentId;
    private String studentNo;
    private String studentPassword;
    private String institute;
    private String grade;
    private String classbj;
    private String name;
}
