package com.hwh.student_registration_system_api.mapper;

import com.hwh.student_registration_system_api.entity.News;

import java.util.List;

public interface NewsMapper {

    /**
     * 获取所有新闻
     * @return
     */
    List<News> selectAll();

    int deleteByPrimaryKey(Integer id);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKeyWithBLOBs(News record);

    int updateByPrimaryKey(News record);
}