package com.kefan.serverofitclub.model;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;


public class User implements Serializable {


    private static final long serialVersionUID = -7830539006200422090L;


    private long id;


    /**
     * 用户名
     */

    private String userName;


    /**
     * 密码
     */

    private String password;



    /**
     * 学号
     */

    private String studentNumber;


    /**
     * 手机号码
     */

    private String mobile;


    /**
     * 性别
     */
    private String gender;


    /**
     * qq
     */

    private String qq;


    /**
     * 通信地址
     */

    private String address;


    /**
     * 用户状态
     */
    private int state;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", mobile='" + mobile + '\'' +
                ", gender='" + gender + '\'' +
                ", qq='" + qq + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
