package com.kefan.serverofitclub.model;

import java.io.Serializable;
import java.util.Date;

public class UserBill implements Serializable{

    private static final long serialVersionUID = -249686460454860202L;

    private int id;

    /**
     * 用户id
     */
    private int userId;

    /**
     * 维修单id
     */
    private int billId;


    /**
     * 状态 默认 0处理，1。未处理，2.已过期
     */
    private int state;

    /**
     * 创建日期
     */
    private Date date;
}
