package com.entgra.Task_01.controller;

import com.entgra.Task_01.model.Device;
import com.entgra.Task_01.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MyController {
    @Autowired
    private DeviceService deviceService;
    @GetMapping("/all-evice")
    public Iterable<Device> getAllDevice(){
        return deviceService.getAllDevice();
    }
    @GetMapping("/device/{id}")
    public Device getDevice(@PathVariable  Integer id){
        return deviceService.getDevice(id);
    }
    @PostMapping("/device-add")
    public Device addDevice(@RequestBody Device device){

        return deviceService.addDevice(device);
    }
    @PutMapping("/device-update")
    public Device updateDevice(@RequestBody Device device){
        return deviceService.updateDevice(device);
    }
    @DeleteMapping("/device-delete/{id}")
    public void deleteDevice(@PathVariable Integer id){
        deviceService.deleteDevice(id);
    }
}
