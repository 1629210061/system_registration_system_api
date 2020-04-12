package com.hwh.student_registration_system_api.controller;

import com.hwh.student_registration_system_api.entity.Question;
import com.hwh.student_registration_system_api.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/12 14:55
 **/
@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping("/findAllQuestion")
    public List<Question> findAllQuestion(){
        return questionService.findAllQuestion();
    }

    @RequestMapping("/findQuestionById")
    public Question findQuestionById(Integer id){
        return questionService.findQuestionById(id);
    }
}
