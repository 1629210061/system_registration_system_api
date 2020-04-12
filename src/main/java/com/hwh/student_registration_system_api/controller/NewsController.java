package com.hwh.student_registration_system_api.controller;

import com.hwh.student_registration_system_api.entity.News;
import com.hwh.student_registration_system_api.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description 新闻控制层
 * @Author hwh
 * @Date 2020/4/9 21:36
 **/
@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping("/findAll")
    public List<News> findAll(){
        return newsService.findAll();
    }


    @RequestMapping("/findNewsById")
    public News findNewsById(Integer id){
        return newsService.findNewsById(id);
    }
}
