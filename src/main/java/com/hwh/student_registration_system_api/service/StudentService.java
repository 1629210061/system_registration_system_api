package com.hwh.student_registration_system_api.service;

import com.hwh.student_registration_system_api.entity.Student;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/10 15:49
 **/
public interface StudentService {

    /**
     * 添加学生信息
     * @param nickname
     * @param avatarUrl
     * @return
     */
    public void addStudent(String nickname,String avatarUrl,String openId);

    /**
     * 获取openid
     * @param code
     * @return
     */
    public String getOpenId(String code);

    /**
     * 根据openId查询学生信息
     * @param openId
     * @return
     */
    public Student findByOpenId(String openId);

    public void updateByOpenId(Student student);


}
