package com.hwh.student_registration_system_api.mapper;

import com.hwh.student_registration_system_api.entity.Dynamic;

import java.util.List;

public interface DynamicMapper {

    /**
     * 查询所有动态信息
     * @return
     */
    List<Dynamic> selectAll();

    int deleteByPrimaryKey(Integer id);

    int insert(Dynamic record);

    /**
     * 插入动态
     * @param dynamic
     * @return
     */
    int insertDynamic(Dynamic dynamic);

    Dynamic selectByPrimaryKey(Integer id);

    /**
     * 更新点赞数
     * @param record
     * @return
     */
    int updateDynamicById(Dynamic record);

    int updateByPrimaryKeyWithBLOBs(Dynamic record);

    int updateByPrimaryKey(Dynamic record);
}