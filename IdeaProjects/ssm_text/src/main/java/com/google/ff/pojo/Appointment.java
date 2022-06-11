package com.google.ff.pojo;

import java.util.Date;

public class Appointment {

    private int bookId;//图书ID

    private int studentID;//学生ID

    private Date appointTime;//预约时间

    //多对一复合属性
    private Books books;//图书实体


    public Appointment() {
    }

    public Appointment(int bookId, int studentID, Date appointTime) {
        this.bookId = bookId;
        this.studentID = studentID;
        this.appointTime = appointTime;
    }

    public Appointment(int bookId, int studentID, Date appointTime, Books books) {
        this.bookId = bookId;
        this.studentID = studentID;
        this.appointTime = appointTime;
        this.books = books;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "bookId=" + bookId +
                ", studentID=" + studentID +
                ", appointTime=" + appointTime +
                '}';
    }
}
