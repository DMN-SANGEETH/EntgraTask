package com.entgra.Task_01.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Device {
    @Id
    private Integer id;
    private String device_name;
    private String device_status;
    private String device_model;
    private String enrolled_time;

}
