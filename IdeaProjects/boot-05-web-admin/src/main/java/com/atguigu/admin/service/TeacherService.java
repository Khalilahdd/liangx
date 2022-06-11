package com.atguigu.admin.service;

import com.atguigu.admin.bean.Teacher;
import com.atguigu.admin.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    public Teacher getTeacherById(Long id) {
        return teacherMapper.getTeacherById(id);
    }

    public void saveTeacher(Teacher teacher) {
        teacherMapper.insert(teacher);
    }
}
