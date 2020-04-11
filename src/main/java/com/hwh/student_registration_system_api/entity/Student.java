package com.hwh.student_registration_system_api.entity;

import lombok.Data;

/**
 * 学生类
 */
@Data
public class Student {
    private Integer id;

    private String realName;

    private String studentId;

    private String dormitory;

    private String headmaster;

    private String instructor;

    private String major;

    private String faculty;

    private String className;

    private String gender;

    private String phone;

    private String nativePlace;

    private String nickname;

    private String avatarUrl;

    private Long age;

    private String registerState;

    private String openId;
}