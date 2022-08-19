package com.yuanerya.lostfound.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuanerya.lostfound.domain.LostThing;
import com.yuanerya.lostfound.mapper.LostThingMapper;
import com.yuanerya.lostfound.service.LostThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//实现丢失物品的增删查改
@Service
public class LostThingServiceImpl implements LostThingService {

    @Autowired
    private LostThingMapper lostThingMapper;

    //增加
    @Override
    public Boolean save(LostThing lostThing) {
        return lostThingMapper.insert(lostThing)>0;
    }

    //修改
    @Override
    public Boolean update(LostThing lostThing) {
        return lostThingMapper.updateById(lostThing)>0;
    }

    //删除
    @Override
    public Boolean remove(Integer id) {
        return lostThingMapper.deleteById(id)>0;
    }

    //查询
    @Override
    public LostThing getById(Integer id) {
        return lostThingMapper.selectById(id);
    }

    //查询全部
    @Override
    public List<LostThing> getAll() {
        return lostThingMapper.selectList(null);
    }

    //分页查询
    @Override
    public IPage<LostThing> getPage(int currentPage, int pageSize) {
        IPage page=new Page(currentPage,pageSize);
        lostThingMapper.selectPage(page,null);
        return page;
    }
}
