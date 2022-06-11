package com.atguigu.admin.mapper;

import com.atguigu.admin.bean.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TeacherMapper {

    @Select("select * from mybatis.teacher where id=#{id}")
    public Teacher getTeacherById(Long id);

    @Insert("insert into mybatis.teacher(`id`,`name`) values (#{id},#{name})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public void insert(Teacher teacher);
}
