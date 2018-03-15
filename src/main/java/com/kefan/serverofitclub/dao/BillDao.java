package com.kefan.serverofitclub.dao;

import com.kefan.serverofitclub.model.Bill;
import com.kefan.serverofitclub.model.User;

import java.util.List;
import java.util.Map;

public interface BillDao {

    public int insertBill(Bill bill);

    public List<Bill> findSameBill(Bill bill);

    public int insertUserBill(Map<String,Object> map);

    public Bill findBillId(Bill bill);
}
