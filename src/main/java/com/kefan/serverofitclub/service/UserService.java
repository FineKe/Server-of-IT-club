package com.kefan.serverofitclub.service;

import com.kefan.serverofitclub.model.User;

import java.util.List;

public interface UserService {

    /**
     * 创建一个用户
     * @param user
     * @return
     */
    public int insertUser(User user);


    /**
     * 获取所有用户
     * @return
     */
    public List<User> allUser();


    /**
     * 获取所有上线的用户
     * @return
     */
    public List<User> allOnlineUser();


    /**
     * 通过 手机号码/学号 ，密码查找用户
     * @param user
     * @return
     */
    public User findUserByUserNameAndPassword(User user);
}
