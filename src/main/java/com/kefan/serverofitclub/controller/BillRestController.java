package com.kefan.serverofitclub.controller;

import com.kefan.serverofitclub.common.CodeConstant;
import com.kefan.serverofitclub.model.Bill;
import com.kefan.serverofitclub.model.User;
import com.kefan.serverofitclub.service.BillService;
import com.kefan.serverofitclub.token.CommonToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/bills")
public class BillRestController extends BaseRestController {

    @Resource
    private BillService billService;

    @PostMapping("/bills")
    public String getBills(@RequestHeader("token") String token) {
        User user= CommonToken.getUserByToken(token);
        if (user == null) {
            return result(CodeConstant.Authen_FAILED,null,"token 不合法");
        }
        List<Bill> bills=billService.getBills(user.getId());
        return result(CodeConstant.REQUEST_SUCCESS,bills,"获取维修单成功");
    }

}
