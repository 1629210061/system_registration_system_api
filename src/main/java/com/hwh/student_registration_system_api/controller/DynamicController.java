package com.hwh.student_registration_system_api.controller;

import com.hwh.student_registration_system_api.entity.Dynamic;
import com.hwh.student_registration_system_api.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/10 15:52
 **/
@RestController
@RequestMapping("/dynamic")
public class DynamicController {

    @Autowired
    private DynamicService dynamicService;

    @RequestMapping("/findAll")
    public List<Dynamic> findAll(){
        return dynamicService.findAll();
    }

    @RequestMapping("/insertDynamic")
    public void insertDynamic( Dynamic dynamic){
        dynamicService.insertDynamic(dynamic);
    }

    @RequestMapping("/updateLikeNumById")
    public int updateLikeNumById(Integer id,Integer likeNum){
        return dynamicService.updateLikeNumById(id,likeNum);
    }
}
