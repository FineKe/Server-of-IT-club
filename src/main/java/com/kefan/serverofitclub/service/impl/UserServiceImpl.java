package com.kefan.serverofitclub.service.impl;

import com.kefan.serverofitclub.dao.BillDao;
import com.kefan.serverofitclub.dao.UserDao;
import com.kefan.serverofitclub.model.Bill;
import com.kefan.serverofitclub.model.User;
import com.kefan.serverofitclub.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Resource
    private UserDao userDao;

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public List<User> allUser() {
        return userDao.allUser();
    }

    @Override
    public List<User> allOnlineUser() {

        return userDao.allOnlineUser();
    }

    @Override
    public User findUserByUserNameAndPassword(User user) {
        return userDao.findUserByUserNameAndPassword(user);
    }

}
