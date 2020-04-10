package com.hwh.student_registration_system_api.mapper;

import com.hwh.student_registration_system_api.entity.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    /**
     * 用户登录后添加微信相关信息
     *
     * @param student
     * @return
     */
    int insertSelective(Student student);

    Student selectByOpenId(String openId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}