package com.yuanerya.lostfound.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuanerya.lostfound.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface StudentMapper extends BaseMapper<Student> {

}
