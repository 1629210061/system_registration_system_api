package com.hwh.student_registration_system_api.service;

import com.hwh.student_registration_system_api.entity.Dynamic;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/10 15:50
 **/
public interface DynamicService {

    /**
     * 查询所有动态
     * @return
     */
    public List<Dynamic> findAll();

    /**
     * 添加动态
     * @param dynamic
     */
    public void insertDynamic(Dynamic dynamic);

    /**
     * 更新点赞数
     * @param likeNum
     * @return
     */
    public int updateLikeNumById(Integer id,Integer likeNum);
}
