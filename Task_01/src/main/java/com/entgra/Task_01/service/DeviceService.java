package com.entgra.Task_01.service;

import com.entgra.Task_01.dao.DeviceDAO;
import com.entgra.Task_01.model.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {
    @Autowired
    private  DeviceDAO dao;
    public Iterable<Device>  getAllDevice(){
        return dao.findAll();
    }
    public Device getDevice(Integer id){
        return dao.findById(id).get();
    }
    public Device addDevice(Device device){
        return dao.save(device);
//        return "New mobile phone added to the data base";
    }
    public Device updateDevice(Device device){
        return dao.save(device);

    }
    public void deleteDevice(Integer id){
        dao.deleteById(id);
    }
}
