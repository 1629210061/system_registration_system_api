package com.hwh.student_registration_system_api.service.impl;

import com.hwh.student_registration_system_api.entity.Student;
import com.hwh.student_registration_system_api.mapper.StudentMapper;
import com.hwh.student_registration_system_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/10 15:52
 **/
@Service("StudentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void addStudent(String nickname, String avatarUrl,String openId) {
        Student isStudent = studentMapper.selectByOpenId(openId);
        if(isStudent!=null){
            Student student = new Student();
            student.setNickname(nickname);
            student.setAvatarUrl(avatarUrl);
            student.setOpenId(openId);
            studentMapper.insertSelective(student);
        }

    }

    @Override
    public String getOpenId(String code) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.weixin.qq.com/sns/jscode2session?"
                + "appid=wx2737877394bb7b80&"
                + "secret=6e4341f2ea22035c1ef663ede51d28a0"
                + "&js_code=" + code + "&grant_type=authorization_code";
        String json = restTemplate.getForObject(url,String.class);
        return json;
    }

    @Override
    public Student findByOpenId(String openId) {
        return studentMapper.selectByOpenId(openId);
    }
}
