package com.yuanerya.lostfound.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yuanerya.lostfound.domain.LostThing;

import java.util.List;

public interface LostThingService {
    Boolean save(LostThing lostThing);
    Boolean update(LostThing lostThing);
    Boolean remove(Integer id);
    LostThing getById(Integer id);
    List<LostThing> getAll();
    IPage<LostThing> getPage(int currentPage,int pageSize);
}
