package com.system.service.impl;

import com.mysql.jdbc.StringUtils;
import com.system.mapper.SysUserInfoMapper;
import com.system.model.SysUserInfo;
import com.system.service.SysUserInfoService;
import com.system.util.RandomUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

@Service
public class SysUserInfoServiceImpl implements SysUserInfoService {

    @Resource
    private SysUserInfoMapper mapper;

    @Override
    public boolean insertRecord(SysUserInfo record) {
        boolean flag = false;
        // 生成UUID——userCode
        String uuid_code = UUID.randomUUID().toString().replaceAll("-", "");
        // 用户账号生成随机串
        record.setUserCode(uuid_code);
        // 判断用户电话号码和邮箱地址不能同时为null
        if(StringUtils.isNullOrEmpty(record.getUserPhone()) || StringUtils.isNullOrEmpty(record.getEmailAddr()))
            return false;
        // 判断登录密码不能为null
        if(StringUtils.isNullOrEmpty(record.getUserPwd()))
            return false;
        // 生成随机串作为用户别名；
        record.setUserAlias(RandomUtil.getRandomString(10));
        // 添加新增时间
        record.setIntoTime(new Date());
        // 判断操作者是否为null，为null时
        if(StringUtils.isNullOrEmpty(record.getIntoUser()))
            record.setIntoUser("ADMIN");
        // 以上条件判断都为正常，新增数据
        int result = mapper.intoRecord(record);
        // 返回 1：为成功；反之失败；
        if(result == 1)
            flag = true;
        return flag;
    }
}
