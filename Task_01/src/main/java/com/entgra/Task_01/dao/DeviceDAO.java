package com.entgra.Task_01.dao;

import com.entgra.Task_01.model.Device;
import org.springframework.data.repository.CrudRepository;

public interface DeviceDAO extends CrudRepository<Device, Integer> {
}
