package com.hwh.student_registration_system_api.entity;

import lombok.Data;

@Data
public class Register {
    private Integer id;

    private String traffic;

    private String trafficNum;

    private String arriveTime;

    private Integer isAccommodation;

    private Integer roomNumber;

    private String openId;

    private Integer type;

    private String reason;

    private String leaveStart;

    private String leaveEnd;
}