package com.hwh.student_registration_system_api.controller;

import com.hwh.student_registration_system_api.entity.Register;
import com.hwh.student_registration_system_api.entity.Student;
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
    public void insertRegister(Student student,Register register){
        System.out.println(student);
        System.out.println(register);
        registerService.insertRegister(student,register);
    }

    /**
     * 更新信息
     * @param register
     */
    @RequestMapping("/updateRegisterByOpenid")
    public void updateRegisterByOpenid(Student student,Register register){

        registerService.updateRegisterByOpenid(student,register);
    }

    /**
     * 根据open_id查询
     * @param openId
     * @return
     */
    @RequestMapping("/findRegisterByOpenId")
    public Register findRegisterByOpenId(String openId){
        return registerService.findRegisterByOpenId(openId);
    }
}
