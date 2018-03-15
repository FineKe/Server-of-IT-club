package com.kefan.serverofitclub.model;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.Date;

public class Bill implements Serializable{


    private static final long serialVersionUID = 2482485445702461201L;
    private int id;


    /**
     * 用户名
     */
    private String userName;


    /**
     * 性别
     */
    private String gender;


    /**
     * 创建日期
     */
    private Date date;


    /**
     * 学号
     */
    private String studentNumber;


    /**
     * qq
     */
    private String qq;


    /**
     * 手机号
     */
    private String mobile;


    /**
     * 通信地址
     */
    private String address;


    /**
     * 照片
     */
    private String pictures;


    /**
     * 原因描述
     */
    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                ", studentNumber='" + studentNumber + '\'' +
                ", qq='" + qq + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", pictures='" + pictures + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
