package com.hwh.student_registration_system_api.service.impl;

import com.hwh.student_registration_system_api.entity.School;
import com.hwh.student_registration_system_api.mapper.SchoolMapper;
import com.hwh.student_registration_system_api.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/10 15:51
 **/
@Service("schoolService")
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    @Override
    public School findCampusScenery(Integer type) {
        return schoolMapper.selectByType(type);
    }

    @Override
    public School findLeader(Integer type) {
        return schoolMapper.selectByType(type);
    }

    @Override
    public School findSchoolIntroduce(Integer type) {
        return schoolMapper.selectByType(type);
    }

    @Override
    public School findFaultyIntroduce(Integer type, String name) {
        return schoolMapper.selectFacultyIntroduce(type,name);
    }
}
