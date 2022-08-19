package com.yuanerya.lostfound.controller;

import com.yuanerya.lostfound.domain.LostThing;
import com.yuanerya.lostfound.service.LostThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/lostThings")
public class LostThingController {
    @Autowired
    private LostThingService lostThingService;

    //查询全部丢失物品的信息
    @GetMapping
    public List<LostThing> getAll(){
        return lostThingService.getAll();
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
    public LostThing getById(@PathVariable Integer id){
        return lostThingService.getById(id);
    }


}
