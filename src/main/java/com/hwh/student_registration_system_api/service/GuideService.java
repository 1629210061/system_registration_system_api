package com.hwh.student_registration_system_api.service;

import com.hwh.student_registration_system_api.entity.Guide;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/10 15:50
 **/
public interface GuideService {

    /**
     * 查询所有
     * @return
     */
    public List<Guide> findAllGuide();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Guide findGuideById(Integer id);
}
