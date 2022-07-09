package com.jnmc.testpanshijun.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    Boolean login(@Param("uname")String uname, @Param("upwd")String upwd);
}
