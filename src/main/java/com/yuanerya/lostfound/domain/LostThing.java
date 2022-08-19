package com.yuanerya.lostfound.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

//实体类丢失物品
@Data
public class LostThing {
    @TableId(value = "lost_id")
    private Integer lostId;
    private String lostName;
    private String lostPosition;
    private String lostDescription;
    private String claimPosition;
    @JSONField(format = "yyyy-MM-dd")
    private Date lostDate;
    private String isReturned;
}
