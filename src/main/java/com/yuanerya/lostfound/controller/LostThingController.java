package com.yuanerya.lostfound.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yuanerya.lostfound.config.JsonResult;
import com.yuanerya.lostfound.domain.LostThing;
import com.yuanerya.lostfound.service.LostThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//get请求的查询均返回json形式的字符串
@RestController
@RequestMapping("/lostThings")
public class LostThingController {
    @Autowired
    private LostThingService lostThingService;

    JsonResult jr=new JsonResult();

    //查询全部丢失物品的信息
    @GetMapping
    public String getAll(){

        //转化为Json字符串返回
        return JSON.toJSONString(lostThingService.getAll());
    }

    //增添丢失物品
    @PostMapping
    public Boolean save(@RequestBody LostThing lostThing){
        return lostThingService.save(lostThing);
    }


    //修改丢失物品
    @PutMapping
    public Boolean update(@RequestBody LostThing lostThing){
        return lostThingService.update(lostThing);
    }


    //删除功能
    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return lostThingService.remove(id);
    }

    //单个查询
    @GetMapping("{id}")
    public String getById(@PathVariable Integer id){
        return JSON.toJSONString(lostThingService.getById(id));
    }


}
