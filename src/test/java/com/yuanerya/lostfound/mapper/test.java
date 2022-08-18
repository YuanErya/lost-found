package com.yuanerya.lostfound.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class test {
    @Autowired
    private LostThingMapper lt;

    @Test
    void contextLoads() {
        System.out.println(lt.getById(1));
    }
}
