package com.kefan.serverofitclub.controller;

import com.alibaba.fastjson.JSON;
import com.kefan.serverofitclub.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseRestController extends BaseController{



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
