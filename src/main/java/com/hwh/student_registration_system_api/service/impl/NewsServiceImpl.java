package com.hwh.student_registration_system_api.service.impl;

import com.hwh.student_registration_system_api.entity.News;
import com.hwh.student_registration_system_api.mapper.NewsMapper;
import com.hwh.student_registration_system_api.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/9 21:40
 **/
@Service("newsService")
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> findAll() {
        return newsMapper.selectAll();
    }

    @Override
    public News findNewsById(Integer id) {
        return newsMapper.selectNewsById(id);
    }
}
