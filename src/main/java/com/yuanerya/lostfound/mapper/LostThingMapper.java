package com.yuanerya.lostfound.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuanerya.lostfound.domain.LostThing;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface LostThingMapper extends BaseMapper<LostThing> {
}
