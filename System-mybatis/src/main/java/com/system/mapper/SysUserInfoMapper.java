package com.system.mapper;

import com.system.model.SysUserInfo;
import org.apache.ibatis.annotations.*;

public interface SysUserInfoMapper {

    /**
     * 新增数据
     *
     * @param record
     * @return
     */
    int intoRecord(SysUserInfo record);

    /**
     * 根据userCode 查询数据
     * @param userCode
     * @return
     */
    SysUserInfo findByUserCode(String userCode);

    /**
     * 根据userPhone 查询数据
     * @param userPhone
     * @return
     */
    SysUserInfo findByUserPhone(String userPhone);

}