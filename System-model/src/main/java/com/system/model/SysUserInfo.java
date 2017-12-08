package com.system.model;

import java.util.Date;

public class SysUserInfo {
    /**
     * 主键ID
     * 表字段 : sys_user_info.id
     */
    private Integer id;

    /**
     * 登陆账号
     * 表字段 : sys_user_info.user_code
     */
    private String userCode;

    /**
     * 登录密码
     * 表字段 : sys_user_info.user_pwd
     */
    private String userPwd;

    /**
     * 用户姓名
     * 表字段 : sys_user_info.user_name
     */
    private String userName;

    /**
     * 注册时间
     * 表字段 : sys_user_info.into_user
     */
    private String intoUser;

    /**
     * 注册时间
     * 表字段 : sys_user_info.into_time
     */
    private Date intoTime;

    /**
     * 修改者
     * 表字段 : sys_user_info.upd_user
     */
    private String updUser;

    /**
     * 修改时间
     * 表字段 : sys_user_info.upd_time
     */
    private Date updTime;

    /**
     * 备注
     * 表字段 : sys_user_info.remarks
     */
    private String remarks;

    /**
     * 主键ID
     * @return id 主键ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键ID
     * @param id 主键ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 登陆账号
     * @return user_code 登陆账号
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 登陆账号
     * @param userCode 登陆账号
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * 登录密码
     * @return password 登录密码
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 登录密码
     * @param userPwd 登录密码
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    /**
     * 用户姓名
     * @return user_name 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户姓名
     * @param userName 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 注册时间
     * @return into_user 注册时间
     */
    public String getIntoUser() {
        return intoUser;
    }

    /**
     * 注册时间
     * @param intoUser 注册时间
     */
    public void setIntoUser(String intoUser) {
        this.intoUser = intoUser == null ? null : intoUser.trim();
    }

    /**
     * 注册时间
     * @return into_time 注册时间
     */
    public Date getIntoTime() {
        return intoTime;
    }

    /**
     * 注册时间
     * @param intoTime 注册时间
     */
    public void setIntoTime(Date intoTime) {
        this.intoTime = intoTime;
    }

    /**
     * 修改者
     * @return upd_user 修改者
     */
    public String getUpdUser() {
        return updUser;
    }

    /**
     * 修改者
     * @param updUser 修改者
     */
    public void setUpdUser(String updUser) {
        this.updUser = updUser == null ? null : updUser.trim();
    }

    /**
     * 修改时间
     * @return upd_time 修改时间
     */
    public Date getUpdTime() {
        return updTime;
    }

    /**
     * 修改时间
     * @param updTime 修改时间
     */
    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    /**
     * 备注
     * @return remarks 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 备注
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}