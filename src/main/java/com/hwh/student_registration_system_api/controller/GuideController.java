package com.hwh.student_registration_system_api.controller;

import com.hwh.student_registration_system_api.entity.Guide;
import com.hwh.student_registration_system_api.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/10 15:49
 **/
@RestController
@RequestMapping("/guide")
public class GuideController {

    @Autowired
    private GuideService guideService;

    /**
     * 查询所有入学指南
     * @return
     */
    @RequestMapping("/findAllGuide")
    public List<Guide> findAllGuide(){
        return guideService.findAllGuide();
    }

    @RequestMapping("/findGuideById")
    public Guide findGuideById(Integer id){
        return guideService.findGuideById(id);
    }
}
