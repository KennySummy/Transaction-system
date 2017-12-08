package com.system.mapper;

import com.system.model.SysUserInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SysUserInfoMapper {
    @Delete({
        "delete from sys_user_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into sys_user_info (id, user_code, ",
        "user_phone, user_pwd, ",
        "user_name, user_alias, ",
        "email_addr, into_user, ",
        "into_time, upd_user, ",
        "upd_time, remarks)",
        "values (#{id,jdbcType=INTEGER}, #{userCode,jdbcType=VARCHAR}, ",
        "#{userPhone,jdbcType=VARCHAR}, #{userPwd,jdbcType=VARCHAR}, ",
        "#{userName,jdbcType=VARCHAR}, #{userAlias,jdbcType=VARCHAR}, ",
        "#{emailAddr,jdbcType=VARCHAR}, #{intoUser,jdbcType=VARCHAR}, ",
        "#{intoTime,jdbcType=TIMESTAMP}, #{updUser,jdbcType=VARCHAR}, ",
        "#{updTime,jdbcType=TIMESTAMP}, #{remarks,jdbcType=VARCHAR})"
    })
    int insert(SysUserInfo record);

    int insertSelective(SysUserInfo record);

    @Select({
        "select",
        "id, user_code, user_phone, user_pwd, user_name, user_alias, email_addr, into_user, ",
        "into_time, upd_user, upd_time, remarks",
        "from sys_user_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    SysUserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUserInfo record);

    @Update({
        "update sys_user_info",
        "set user_code = #{userCode,jdbcType=VARCHAR},",
          "user_phone = #{userPhone,jdbcType=VARCHAR},",
          "user_pwd = #{userPwd,jdbcType=VARCHAR},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "user_alias = #{userAlias,jdbcType=VARCHAR},",
          "email_addr = #{emailAddr,jdbcType=VARCHAR},",
          "into_user = #{intoUser,jdbcType=VARCHAR},",
          "into_time = #{intoTime,jdbcType=TIMESTAMP},",
          "upd_user = #{updUser,jdbcType=VARCHAR},",
          "upd_time = #{updTime,jdbcType=TIMESTAMP},",
          "remarks = #{remarks,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SysUserInfo record);
}