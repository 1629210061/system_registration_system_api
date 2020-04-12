package com.hwh.student_registration_system_api.service.impl;

import com.hwh.student_registration_system_api.entity.Guide;
import com.hwh.student_registration_system_api.mapper.GuideMapper;
import com.hwh.student_registration_system_api.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author hwh
 * @Date 2020/4/10 15:52
 **/
@Service("guideService")
public class GuideServiceImpl implements GuideService {

    @Autowired
    private GuideMapper guideMapper;


    @Override
    public List<Guide> findAllGuide() {
        return guideMapper.selectAllGuide();
    }

    @Override
    public Guide findGuideById(Integer id) {
        return guideMapper.selectGuideById(id);
    }
}
