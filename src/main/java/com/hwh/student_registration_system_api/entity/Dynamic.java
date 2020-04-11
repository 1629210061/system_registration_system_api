package com.hwh.student_registration_system_api.entity;

import lombok.Data;

/**
 * 动态类
 */
@Data
public class Dynamic {
    private Integer id;

    private String openId;

    private String date;

    private String imageUrl;

    private Integer browseTimes;

    private Integer likeNum;

    private String content;

    private String avatarUrl;

    private String nickName;
}