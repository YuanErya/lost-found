package com.yuanerya.lostfound.config;

import lombok.Data;

@Data
public class JsonResult {
    private Object obj;
    private String msg;
    private Integer code;
}
