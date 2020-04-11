package com.hwh.student_registration_system_api.entity;

import lombok.Data;

@Data
public class School {
    private Integer id;

    private String title;

    private Integer type;

    private String content;
}