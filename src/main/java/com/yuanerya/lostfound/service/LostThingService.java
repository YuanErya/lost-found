package com.yuanerya.lostfound.service;

import com.yuanerya.lostfound.domain.LostThing;

import java.util.List;

public interface LostThingService {
    Boolean save(LostThing lostThing);
    Boolean update(LostThing lostThing);
    Boolean delete(Integer id);
    LostThing getById(Integer id);
    List<LostThing> getAll();
}
