package com.hwh.student_registration_system_api.service.impl;

import com.hwh.student_registration_system_api.entity.Register;
import com.hwh.student_registration_system_api.mapper.RegisterMapper;
import com.hwh.student_registration_system_api.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/10 15:51
 **/
@Service("registerService")
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterMapper registerMapper;

    @Override
    public int insertRegister(Register register) {
        return registerMapper.insertRegister(register);
    }
}
