package com.hwh.student_registration_system_api.mapper;

import com.hwh.student_registration_system_api.entity.Question;

import java.util.List;

public interface QuestionMapper {

    /**
     * 查询所有问题
     * @return
     */
    List<Question> selectAllQuestion();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Question selectQuestionById(Integer id);
}