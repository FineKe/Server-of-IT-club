package com.kefan.serverofitclub.dao;

import com.kefan.serverofitclub.model.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    public int insertUser(User user);

    public List<User> allUser();

    public List<User> allOnlineUser();



}
