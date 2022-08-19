package com.yuanerya.lostfound.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuanerya.lostfound.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface StudentMapper extends BaseMapper<Student> {
    //用于登录查询
    @Select("select * from lf_student where student_no=#{studentNo} and student_password=#{studentPassword}")
    public Student login(Student student);
}
