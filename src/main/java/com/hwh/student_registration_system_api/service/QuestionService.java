package com.hwh.student_registration_system_api.service;

import com.hwh.student_registration_system_api.entity.Question;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/12 14:53
 **/
public interface QuestionService {

    /**
     * 查询所有
     * @return
     */
    public List<Question> findAllQuestion();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Question findQuestionById(Integer id);
}
