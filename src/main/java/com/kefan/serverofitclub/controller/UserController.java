package com.kefan.serverofitclub.controller;

import com.kefan.serverofitclub.common.CodeConstant;
import com.kefan.serverofitclub.common.MainConstant;
import com.kefan.serverofitclub.model.User;
import com.kefan.serverofitclub.service.UserService;
import com.kefan.serverofitclub.token.CommonToken;
import com.kefan.serverofitclub.token.Token;
import com.kefan.serverofitclub.uitls.TokenHelper;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.applet.Main;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

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

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        if (user.getUserName() == null || user.getUserName().length() == 0 || user.getPassword() == null ||
                user.getPassword().length() == 0) {
            return result(CodeConstant.REQUEST_FAILED,null,"请输入有效信息");
        }

        //从数据库中查找相应的user
        User temp = userService.findUserByUserNameAndPassword(user);

        if (temp == null) {
            return result(CodeConstant.REQUEST_FAILED,null,"用户名或密码输入错误");
        }


        //token字符串
        String tokenString =TokenHelper.createToken(temp);
        //过期时间
        long expireTime = System.currentTimeMillis()+ MainConstant.EXPIRE;
        //生成token
        Token token=new Token(tokenString,expireTime);
        //添加公共池中
        CommonToken.addToken(token,temp);

        //返回信息
        Map map = new HashMap();
        map.put("token",tokenString);
        map.put("expireTime",expireTime);
        map.put("user",temp);
       return result(CodeConstant.REQUEST_SUCCESS,map,"登录成功");
    }

}
