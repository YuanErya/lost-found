package com.yuanerya.lostfound.service;

import com.yuanerya.lostfound.domain.LostThing;
import com.yuanerya.lostfound.domain.Student;

import java.util.List;

public interface StudentService {
    Boolean save(Student student);
    Boolean update(Student student);
    Boolean delete(Integer id);
    Student getById(Integer id);
    List<Student> getAll();
    public Student login(Student student);
}
