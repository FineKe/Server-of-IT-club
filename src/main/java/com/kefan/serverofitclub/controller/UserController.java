package com.kefan.serverofitclub.controller;

import com.kefan.serverofitclub.common.CodeConstant;
import com.kefan.serverofitclub.model.User;
import com.kefan.serverofitclub.service.UserService;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/users")
@Transactional
@Scope("singleton")
public class UserController extends BaseRestController{


    @Resource
    private UserService userService;

    @PostMapping("/user")
    public String register(@RequestBody User user) {


        int num=userService.insertUser(user);

        if (num == 0) {
            return result(CodeConstant.REQUEST_FAILED,null,"该用户已注册");
        }
        return result(CodeConstant.REQUEST_SUCCESS,null,"注册成功");
    }
}
