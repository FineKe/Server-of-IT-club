package com.kefan.serverofitclub.token;

import com.kefan.serverofitclub.common.MainConstant;
import com.kefan.serverofitclub.model.User;

import java.util.HashMap;
import java.util.Map;

public class CommonToken {

    //token 池
    private static final Map<Token,User> tokenPool = new HashMap<>();


    //添加token
    public static void addToken(Token token,User user) {
        tokenPool.put(token,user);
    }

    /**
     * 通过token 找user，如果token 过期，则会返回null
     * @param token
     * @return
     */
    public static User getUserByToken(String token) {
        for (Map.Entry<Token,User> entry : tokenPool.entrySet()) {
            if (entry.getKey().getToken().equals(token)) {
                if (entry.getKey().getExpirationTime() > System.currentTimeMillis()) {
                    return entry.getValue();
                } else {
                    break;
                }
            }
        }

        return null;
    }
}
