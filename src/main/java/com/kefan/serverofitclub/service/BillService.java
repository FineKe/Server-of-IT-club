package com.kefan.serverofitclub.service;

import com.kefan.serverofitclub.model.Bill;

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
}
