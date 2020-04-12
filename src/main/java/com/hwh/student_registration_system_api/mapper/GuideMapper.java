package com.hwh.student_registration_system_api.mapper;


import com.hwh.student_registration_system_api.entity.Guide;

import java.util.List;

public interface GuideMapper {

    /**
     * 查询所有入学指南
     * @return
     */
    List<Guide> selectAllGuide();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Guide selectGuideById(Integer id);
}