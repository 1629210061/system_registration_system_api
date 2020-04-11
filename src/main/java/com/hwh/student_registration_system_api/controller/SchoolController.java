package com.hwh.student_registration_system_api.controller;

import com.hwh.student_registration_system_api.entity.School;
import com.hwh.student_registration_system_api.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/10 15:53
 **/
@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    /**
     * 查询学校简介
     * @return
     */
    @RequestMapping("/findSchoolIntroduce")
    public School findSchoolIntroduce(){
        return schoolService.findSchoolIntroduce(1);
    }

    /**
     * 查询领导信息
     * @return
     */
    @RequestMapping("/findLeader")
    public School findLeader(){
        return schoolService.findLeader(2);
    }

    /**
     * 查询校园风光
     * @return
     */
    @RequestMapping("/findCampusScenery")
    public School findCampusScenery(){
        return schoolService.findCampusScenery(4);
    }

    /**
     * 查询学院简介
     * @param name
     * @return
     */
    @RequestMapping("/findFaultyIntroduce")
    public School findFaultyIntroduce(String name){
        return schoolService.findFaultyIntroduce(3,name);
    }
}
