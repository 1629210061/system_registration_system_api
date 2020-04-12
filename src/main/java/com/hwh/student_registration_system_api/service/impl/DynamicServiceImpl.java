package com.hwh.student_registration_system_api.service.impl;

import com.hwh.student_registration_system_api.entity.Dynamic;
import com.hwh.student_registration_system_api.entity.Student;
import com.hwh.student_registration_system_api.mapper.DynamicMapper;
import com.hwh.student_registration_system_api.mapper.StudentMapper;
import com.hwh.student_registration_system_api.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/10 15:52
 **/
@Service("dynamicService")
public class DynamicServiceImpl implements DynamicService {

    @Autowired
    private DynamicMapper dynamicMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Dynamic> findAll() {
        List<Dynamic> dynamicList = dynamicMapper.selectAll();
        for(Dynamic dynamic:dynamicList){
            String openId = dynamic.getOpenId();
            Student student = studentMapper.selectByOpenId(openId);
            dynamic.setAvatarUrl(student.getAvatarUrl());
            dynamic.setNickName(student.getNickname());
        }
        return dynamicList;
    }

    @Override
    public void insertDynamic(Dynamic dynamic) {
        dynamicMapper.insertDynamic(dynamic);
    }

    @Override
    public int updateLikeNumById(Integer id,Integer likeNum) {
        Dynamic dynamic = new Dynamic();
        dynamic.setId(id);
        dynamic.setLikeNum(likeNum);
        return dynamicMapper.updateDynamicById(dynamic);
    }
}
