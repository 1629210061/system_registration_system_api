package com.hwh.student_registration_system_api.service;

import com.hwh.student_registration_system_api.entity.Register;
import com.hwh.student_registration_system_api.entity.Student;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/10 15:50
 **/
public interface RegisterService {

    /**
     * 报到注册
     * @param register
     * @return
     */
    public void insertRegister(Student student,Register register);

    /**
     * 根据open_id查询
     * @param openId
     * @return
     */
    public Register findRegisterByOpenId(String openId);

    /**
     * 更新信息
     * @param register
     */
    public void updateRegisterByOpenid(Register register);
}
