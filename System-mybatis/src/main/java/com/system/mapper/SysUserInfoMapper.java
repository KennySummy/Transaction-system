package com.system.mapper;

import com.system.model.SysUserInfo;

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

    /**
     * 根据userPhone 查询改记录并修改其数据
     * @param record
     * @return
     */
    SysUserInfo updByUserPhoneForUserInfo(SysUserInfo record);

}