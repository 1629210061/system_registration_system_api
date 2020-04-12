package com.hwh.student_registration_system_api.controller;

import com.hwh.student_registration_system_api.entity.Register;
import com.hwh.student_registration_system_api.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/10 15:53
 **/
@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    /**
     * 报到注册
     * @param register
     */
    @RequestMapping("/insertRegister")
    public void insertRegister(Register register){
        registerService.insertRegister(register);
    }
}
