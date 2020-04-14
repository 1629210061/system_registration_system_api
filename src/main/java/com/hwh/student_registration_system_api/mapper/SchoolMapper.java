package com.hwh.student_registration_system_api.mapper;

import com.hwh.student_registration_system_api.entity.School;

public interface SchoolMapper {




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


}