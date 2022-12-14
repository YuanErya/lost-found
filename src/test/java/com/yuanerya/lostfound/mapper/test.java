package com.yuanerya.lostfound.mapper;

import com.yuanerya.lostfound.domain.LostThing;
import com.yuanerya.lostfound.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.print.Book;
import java.util.Date;

@SpringBootTest

public class test {
    @Autowired
    private LostThingMapper lt;

    @Autowired
    private StudentMapper st;

    @Test
    void test() {
        System.out.println(st.selectById(1));
    }

    @Test
    void testSave() {
        LostThing book = new LostThing();
        book.setLostName("测试数据123");
        book.setLostPosition("测试数据123");
        book.setLostDescription("测试数据123");
        book.setClaimPosition("测试数据123");
        book.setLostDate(new Date(324343));
        book.setIsReturned("1");
        lt.insert(book);
    }

    @Test
    void testGetAll() {
        System.out.println(st.selectList(null));
    }

    @Test
    void testLogin() {

        //测试登录查询
        Student book = new Student();
        book.setStudentNo("2021211000");
        book.setStudentPassword("1234");
        book.setInstitute("测试数据123");
        book.setGrade("123");
        book.setClassbj("12232432");
        book.setName("haahah");

        System.out.println(st.login(book));
    }
}
