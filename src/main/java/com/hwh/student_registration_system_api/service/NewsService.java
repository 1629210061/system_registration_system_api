package com.hwh.student_registration_system_api.service;

import com.hwh.student_registration_system_api.entity.News;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/9 21:40
 **/
public interface NewsService {
    /**
     * 查询所有学校新闻
     * @return
     */
    public List<News> findAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public News findNewsById(Integer id);
}
