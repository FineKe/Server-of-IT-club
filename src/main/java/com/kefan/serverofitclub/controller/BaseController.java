package com.kefan.serverofitclub.controller;

import com.kefan.serverofitclub.model.User;

import java.util.ArrayList;
import java.util.List;

public class BaseController {

    //存储在线用户集合
    protected static volatile List<User> users = new ArrayList<>();
}
