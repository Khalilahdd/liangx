package com.google.ff.service;

import com.google.ff.dao.AppointmentMapper;
import com.google.ff.dao.BookMapper;
import com.google.ff.dto.AppointExecution;
import com.google.ff.enums.AppointStateEnum;
import com.google.ff.exception.AppointException;
import com.google.ff.exception.NoNumberException;
import com.google.ff.exception.RepeatAppointException;
import com.google.ff.pojo.Appointment;
import com.google.ff.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;

    @Autowired
    private AppointmentMapper appointmentMapper;

    public void setBookMapper(BookMapper bookMapper) {
            this.bookMapper = bookMapper;
    }
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookByID(int bookId) {
        return bookMapper.deleteBookByID(bookId);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books getById(int bookId) {
        return bookMapper.queryBookById(bookId);
    }

    public Books getByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }

    public List<Books> queryList() {
        return bookMapper.queryAllBook();
    }

    public AppointExecution appoint(int bookId, int studentId) {
        try {
            // 减库存
            int update = bookMapper.reduceNumber(bookId);
            if (update <= 0) {// 库存不足
                throw new NoNumberException("no number");
            } else {
                // 执行预约操作
                int insert = appointmentMapper.insertAppointment(bookId, studentId);
                if (insert <= 0) {// 重复预约
                    throw new RepeatAppointException("repeat appoint");
                } else {// 预约成功
                    Appointment appointment = appointmentMapper.queryByKeyWithBook(bookId, studentId);
                    return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appointment);
                }
            }
        } catch (NoNumberException e1) {
            throw e1;
        } catch (RepeatAppointException e2) {
            throw e2;
        } catch (Exception e) {
//            logger.error(e.getMessage(), e);
            // 所有编译期异常转换为运行期异常
            throw new AppointException("appoint inner error:" + e.getMessage());
        }
    }
}
