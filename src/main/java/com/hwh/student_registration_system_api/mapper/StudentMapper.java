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

    /**
     * 根据open_id 查询学生信息
     * @param openId
     * @return
     */
    Student selectByOpenId(String openId);

    int updateDynamicById(Student record);

    /**
     * 更新学生信息
     * @param student
     * @return
     */
    int updateByOpenId(Student student);
}