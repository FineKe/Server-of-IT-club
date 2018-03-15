package com.kefan.serverofitclub.controller;

import com.kefan.serverofitclub.model.Bill;
import com.kefan.serverofitclub.model.User;
import com.kefan.serverofitclub.service.BillService;
import com.kefan.serverofitclub.service.UserService;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.*;

@Controller
public class BillController {

    @Resource
    private BillService billService;

    @Resource
    private UserService userService;

    //存储在线用户集合
    private static volatile List<User> users = new ArrayList<>();




    @GetMapping("/index")
    public String index() {

        return "index";
    }

    @PostMapping("/bill")
    public ModelAndView makeBill(String userName, String studentNumber,
                                 String gender, String address,
                                 String qq, String mobile, String text) {
        ModelAndView modelAndView=new ModelAndView();
        //加载在线用户
        if (users.size() < 1) {
            users.addAll(userService.allOnlineUser());
        }

        if (users.size() == 0) {

            modelAndView.setViewName("failed");
            return modelAndView;
        }

        //创建bean并设置信息
        Bill bill = new Bill();
        bill.setUserName(userName);
        bill.setStudentNumber(studentNumber);
        bill.setGender(gender);
        bill.setQq(qq);
        bill.setAddress(address);
        bill.setMobile(mobile);
        bill.setText(text);

        //防止用户多次提交
        if (billService.findSameBill(bill)) {
            modelAndView.setViewName("failed");
            return modelAndView;
        }

        //数据插入是否成功
        if (billService.insertBill(bill) == 0) {
            modelAndView.setViewName("failed");
            return modelAndView;
        }

        User user=users.get(0);
        users.remove(user);//将其从集合中移除

        Map<String,Object> map=new HashMap<>();
        map.put("userId",user.getId());
        map.put("billId",billService.findBillId(bill));


        if (billService.insertUserBill(map)==0) {
            modelAndView.setViewName("failed");
            return modelAndView;
        }

        modelAndView.setViewName("success");
        modelAndView.addObject(user);

        return modelAndView;
    }


    /**
     * 对外暴露方法
     * @return
     */
    public static List<User> getUsers() {
        return users;
    }
}
