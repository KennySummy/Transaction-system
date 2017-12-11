package com.system.controller;

import com.mysql.jdbc.StringUtils;
import com.system.bean.ResponseData;
import com.system.service.SysUserInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SysUserInfoController extends BaseController {

    @Resource
    private SysUserInfoService service;

    public ResponseData intoUserInfo(@Param("userPhone") String userPhone, @Param("userPwd")String userPwd){
        if(StringUtils.isNullOrEmpty(userPhone)){
            // return ResponseData.
        }
        return null;
    }
}
