package com.yuanerya.lostfound.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

//实体类丢失物品
@Data

public class LostThing {
    private Integer lostId;
    private String lostName;
    private String lostPosition;
    private String lostDescription;
    private String claimPosition;
    private Date lostDate;
    private Integer isReturned;
}
