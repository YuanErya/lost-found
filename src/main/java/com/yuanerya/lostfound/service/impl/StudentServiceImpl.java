package com.yuanerya.lostfound.service.impl;

import com.yuanerya.lostfound.domain.Student;
import com.yuanerya.lostfound.mapper.LostThingMapper;
import com.yuanerya.lostfound.mapper.StudentMapper;
import com.yuanerya.lostfound.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//实现学生的增删查改
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    //增加
    @Override
    public Boolean save(Student student) {
        return studentMapper.insert(student)>0;
    }

    //修改
    @Override
    public Boolean update(Student student) {
        return studentMapper.updateById(student)>0;
    }

    //删除
    @Override
    public Boolean delete(Integer id) {
        return studentMapper.deleteById(id)>0;
    }

    //查询
    @Override
    public Student getById(Integer id) {
        return studentMapper.selectById(id);
    }

    //查询全部
    @Override
    public List<Student> getAll() {
        return studentMapper.selectList(null);
    }
}
