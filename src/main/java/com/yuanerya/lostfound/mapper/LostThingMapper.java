package com.yuanerya.lostfound.mapper;

import com.yuanerya.lostfound.domain.LostThing;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface LostThingMapper {
    @Select("select* from lf_lost_thing where lost_id=#{lost_id}")
    LostThing getById(Integer lost_id);
}
