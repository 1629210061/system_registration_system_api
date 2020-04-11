package com.hwh.student_registration_system_api.controller;

import com.hwh.student_registration_system_api.entity.Student;
import com.hwh.student_registration_system_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 学生信息
 * @Author hwh
 * @Date 2020/4/10 15:48
 **/
@RestController

@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/getOpenId")
    public String getOpenId(String code){
        return studentService.getOpenId(code);
    }

    @RequestMapping("/addStudent")
    public void addStudent(String nickname,String avatarUrl,String openId){
        studentService.addStudent(nickname,avatarUrl,openId);
    }

    @RequestMapping("/findByOpenId")
    public Student findByOpenId(String openId){
        return studentService.findByOpenId(openId);
    }
}
