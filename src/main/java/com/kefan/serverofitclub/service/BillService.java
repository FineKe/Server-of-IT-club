package com.kefan.serverofitclub.service;

import com.kefan.serverofitclub.model.Bill;

import java.util.List;
import java.util.Map;

public interface BillService {
    public int insertBill(Bill bill);

    public boolean findSameBill(Bill bill);

    public int insertUserBill(Map<String,Object> map);

    /**
     * 获取维修单的id
     * @param bill
     * @return
     */
    public int findBillId(Bill bill);


    /**
     * 获取未处理维修单，异常维修单
     * @param userId
     * @return
     */
    public List<Bill> getBills(long userId);
}
