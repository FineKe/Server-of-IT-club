package com.kefan.serverofitclub.controller;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

public class BaseRestController {

    protected String result(int status,Object data,String msg) {
        Map<String,Object> map=new HashMap<>();
        map.put("code",status);
        if (data != null) {
        map.put("data",data);
        }
        map.put("msg",msg);

        return JSON.toJSONString(map);
    }
}
