package com.hwh.student_registration_system_api.entity;

import lombok.Data;

@Data
public class News {
    private Integer id;

    private String title;

    private String author;

    private String source;

    private String updateTime;

    private Integer clicks;

    private String imageUrl;

    private String content;
}