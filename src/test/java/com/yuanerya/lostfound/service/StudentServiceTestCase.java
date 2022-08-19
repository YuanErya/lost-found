package com.yuanerya.lostfound.service;

import com.yuanerya.lostfound.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceTestCase {

    @Autowired
    private StudentService studentService;

    @Test
    void testGetById(){
        System.out.println( studentService.getById(2));

    }
}
