package com.google.ff.dao;

import com.google.ff.pojo.Appointment;
import org.apache.ibatis.annotations.Param;

public interface AppointmentMapper {

    /**
     * 插入预约图书的记录
     * @param bookId
     * @param studentId
     * @return
     */
    int insertAppointment(@Param("bookId")long bookId,@Param("studentId")long studentId);


    /**
     * 通过主键查询预约图书记录，并且携带图书实体
     * @param bookId
     * @param studentId
     * @return
     */
    Appointment queryByKeyWithBook(@Param("bookId")long bookId,@Param("studentId")long studentId);
}
