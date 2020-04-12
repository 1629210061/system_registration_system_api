package com.hwh.student_registration_system_api.service.impl;

import com.hwh.student_registration_system_api.entity.Question;
import com.hwh.student_registration_system_api.mapper.QuestionMapper;
import com.hwh.student_registration_system_api.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/12 14:53
 **/
@Service("questionService")
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public List<Question> findAllQuestion() {
        return questionMapper.selectAllQuestion();
    }

    @Override
    public Question findQuestionById(Integer id) {
        return questionMapper.selectQuestionById(id);
    }
}
