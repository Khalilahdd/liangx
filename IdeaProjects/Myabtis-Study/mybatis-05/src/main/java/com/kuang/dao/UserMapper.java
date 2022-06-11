package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from mybatis.user")
    List<User> getUsers();

    //方法存在多个参数，所以参数的前面必须加上 @Param("id") 注解
    @Select("select * from mybatis.user where id = #{id} ")
    User getUserById(@Param("id") int id);

    @Insert("insert into mybatis.user(id,name,pwd) values (#{id} ,#{name} ,#{password} )")
    int addUser(User user);

    @Update("update mybatis.user set name = #{name} ,pwd = #{password} where id = #{id} ")
    int updateUser(User user);

    @Delete("delete from mybatis.user where id = #{id} ")
    int deleteUser(@Param("id") int id);
}
