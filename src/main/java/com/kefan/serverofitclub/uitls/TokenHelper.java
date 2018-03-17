package com.kefan.serverofitclub.uitls;

import com.kefan.serverofitclub.model.User;

import java.util.Random;

public class TokenHelper {


    //生成token字符串
    public static String createToken(User user) {
        return MD5.MD5Encode(user.toString()+ new Random().nextInt(),"utf-8");
    }
}
