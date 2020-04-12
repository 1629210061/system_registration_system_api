package com.hwh.student_registration_system_api.mapper;

import com.hwh.student_registration_system_api.entity.Register;

public interface RegisterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Register record);

    int insertRegister(Register register);

    Register selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Register record);

    int updateByPrimaryKey(Register record);
}