package com.hwh.student_registration_system_api.mapper;

import com.hwh.student_registration_system_api.entity.Register;

public interface RegisterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Register record);

    /**
     * 报到注册
     * @param register
     * @return
     */
    int insertRegister(Register register);

    /**
     * 根据open_id查询
     * @param openId
     * @return
     */
    Register selectRegisterByOpenId(String openId);

    /**
     * 更新
     * @param register
     * @return
     */
    int updateRegisterByOpenid(Register register);

    int updateByPrimaryKey(Register record);
}