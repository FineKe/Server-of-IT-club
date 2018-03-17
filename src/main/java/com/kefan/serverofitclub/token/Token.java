package com.kefan.serverofitclub.token;

public class Token {

    /**
     * token
     */
    private String token;

    /**
     * 有效时长
     */
    private long expirationTime;

    public Token(String token, long expirationTime) {
        this.token = token;
        this.expirationTime = expirationTime;
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(long expirationTime) {
        this.expirationTime = expirationTime;
    }
}
