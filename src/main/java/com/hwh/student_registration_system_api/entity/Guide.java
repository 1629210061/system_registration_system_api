package com.hwh.student_registration_system_api.entity;

import lombok.Data;

@Data
public class Guide {
    private Integer id;

    private String title;

    private String coverUrl;

    private String content;

    private String imageUrl;

}