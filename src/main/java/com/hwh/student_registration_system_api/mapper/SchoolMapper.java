package com.hwh.student_registration_system_api.mapper;

import com.hwh.student_registration_system_api.entity.School;

public interface SchoolMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(School record);

    int insertSelective(School record);

    /**
     * 根据类型查询信息,获取校园图，学校简介，领导介绍
     * @param type
     * @return
     */
    School selectByType(Integer type);

    /**
     * 查询学院介绍
     * @param type
     * @param name
     * @return
     */
    School selectFacultyIntroduce(Integer type,String name);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKeyWithBLOBs(School record);

    int updateByPrimaryKey(School record);
}