package com.hwh.student_registration_system_api.entity;

import lombok.Data;

@Data
public class Question {
    private Integer id;

    private String question;

    private String answer;
}