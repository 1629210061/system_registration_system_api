package com.hwh.student_registration_system_api.service;


import com.hwh.student_registration_system_api.entity.School;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/10 15:51
 **/
public interface SchoolService {

    /**
     * 查询校园风光图片
     * @param type
     * @return
     */
    public School findCampusScenery(Integer type);

    /**
     * 查询学校领导
     * @param type
     * @return
     */
    public School findLeader(Integer type);

    /**
     * 查询学校简介
     * @param type
     * @return
     */
    public School findSchoolIntroduce(Integer type);

    /**
     * 查询学院介绍
     * @param type
     * @param name
     * @return
     */
    public School findFaultyIntroduce(Integer type, String name);
}
