package com.system.mapper;

import com.system.model.SysUserInfo;
import org.apache.ibatis.annotations.*;

public interface SysUserInfoMapper {
    @Delete({
        "delete from sys_user_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into sys_user_info (id, user_code, ",
        "password, user_name, ",
        "into_user, into_time, ",
        "upd_user, upd_time, ",
        "remarks)",
        "values (#{id,jdbcType=INTEGER}, #{userCode,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{userName,jdbcType=VARCHAR}, ",
        "#{intoUser,jdbcType=VARCHAR}, #{intoTime,jdbcType=TIMESTAMP}, ",
        "#{updUser,jdbcType=VARCHAR}, #{updTime,jdbcType=TIMESTAMP}, ",
        "#{remarks,jdbcType=VARCHAR})"
    })
    int insert(SysUserInfo record);

    int insertSelective(SysUserInfo record);

    @Select({
        "select",
        "id, user_code, password, user_name, into_user, into_time, upd_user, upd_time, ",
        "remarks",
        "from sys_user_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    SysUserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUserInfo record);

    @Update({
        "update sys_user_info",
        "set user_code = #{userCode,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "into_user = #{intoUser,jdbcType=VARCHAR},",
          "into_time = #{intoTime,jdbcType=TIMESTAMP},",
          "upd_user = #{updUser,jdbcType=VARCHAR},",
          "upd_time = #{updTime,jdbcType=TIMESTAMP},",
          "remarks = #{remarks,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SysUserInfo record);
}