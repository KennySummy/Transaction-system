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

}