package com.yuanerya.lostfound.domain;

import lombok.Data;
import java.util.Date;

//实体类丢失物品
@Data
public class LostThing {
    private Integer lost_id;
    private String lost_name;
    private String lost_position;
    private String lost_description;
    private String claim_position;
    private Date lost_date;
    private Integer is_returned;
}
