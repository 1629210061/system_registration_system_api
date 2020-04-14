package com.hwh.student_registration_system_api.service.impl;

import com.hwh.student_registration_system_api.entity.Register;
import com.hwh.student_registration_system_api.entity.Student;
import com.hwh.student_registration_system_api.mapper.RegisterMapper;
import com.hwh.student_registration_system_api.mapper.StudentMapper;
import com.hwh.student_registration_system_api.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/10 15:51
 **/
@Service("registerService")
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterMapper registerMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    @Transactional
    public void insertRegister(Student student, Register register) {
        String openId = register.getOpenId();
        student.setOpenId(openId);
        studentMapper.updateByOpenId(student);
        registerMapper.insertRegister(register);
    }

    @Override
    public Register findRegisterByOpenId(String openId) {
        return registerMapper.selectRegisterByOpenId(openId);
    }

    @Override
    public void updateRegisterByOpenid(Student student,Register register) {
        String openId = register.getOpenId();
        student.setOpenId(openId);
        studentMapper.updateByOpenId(student);
        registerMapper.updateRegisterByOpenid(register);
    }
}
