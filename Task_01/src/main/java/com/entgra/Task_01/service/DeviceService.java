package com.entgra.Task_01.service;

import com.entgra.Task_01.dao.DeviceDAO;
import org.springframework.beans.factory.annotation.Autowired;

public class DeviceService {
    @Autowired
    DeviceDAO dao;

    public DeviceService(){

    }
}
