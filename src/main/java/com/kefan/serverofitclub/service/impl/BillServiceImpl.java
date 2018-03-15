package com.kefan.serverofitclub.service.impl;

import com.kefan.serverofitclub.dao.BillDao;
import com.kefan.serverofitclub.model.Bill;
import com.kefan.serverofitclub.service.BillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class BillServiceImpl implements BillService
{

    @Resource
    private BillDao billDao;

    @Override
    public int insertBill(Bill bill) {
        return billDao.insertBill(bill);
    }

    @Override
    public boolean findSameBill(Bill bill) {
        return billDao.findSameBill(bill).size()>0;
    }

    @Override
    public int insertUserBill(Map<String, Object> map) {
        return billDao.insertUserBill(map);
    }

    @Override
    public int findBillId(Bill bill) {
        return billDao.findBillId(bill).getId();
    }
}
