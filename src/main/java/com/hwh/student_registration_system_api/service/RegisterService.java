package com.hwh.student_registration_system_api.service;

import com.hwh.student_registration_system_api.entity.Register;

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
    public int insertRegister(Register register);
}
