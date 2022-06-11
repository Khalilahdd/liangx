package com.artisan.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.artisan.model.Student;
import com.artisan.util.StringUtil;
public class StudentDao extends BaseDao {
	public boolean addStudent(Student student){
		String sql="insert into s_student values(null,?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getSex());
			preparedStatement.setString(3, student.getPassword());
			preparedStatement.setString(4, student.getDate());
			preparedStatement.setString(5, student.getTel());
			preparedStatement.setString(6, student.getAddress());
			if(preparedStatement.executeUpdate()>=0)
				return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		return false;
		
	}
	public List<Student> getStudentList(Student student){
		List<Student> retList=new ArrayList<Student>();
		StringBuffer sqlString=new StringBuffer("select * from s_student");
		if(!StringUtil.isEmpty(student.getName())){
			sqlString.append("and name like'%"+student.getName()+"%'");
		}
		try {
			PreparedStatement preparedStatement=con.prepareStatement(sqlString.toString().replace("and", "where"));
			ResultSet executeQuery=preparedStatement.executeQuery();
			while(executeQuery.next()){
				Student s=new Student();
				s.setId(executeQuery.getInt("Id"));
				s.setName(executeQuery.getString("Name"));
				s.setPassword(executeQuery.getString("Password"));
				s.setSex(executeQuery.getString("Sex"));
				s.setDate(executeQuery.getString("Date"));
				s.setTel(executeQuery.getString("Tel"));
				s.setAddress(executeQuery.getString("Address"));
				retList.add(s);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retList;
	}
	public boolean delete(int id){
		String sql="delete from s_student where id=?";
		try {
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			if(preparedStatement.executeUpdate()>0){
				return true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;	
	}
	public boolean update(Student student){
		String sql="update s_student set name=?,sex=?,password=?,date=?,tel=?,address=? where id=?";
		try {
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getSex());
			preparedStatement.setString(3, student.getPassword());
			preparedStatement.setString(4, student.getDate());
			preparedStatement.setString(5, student.getTel());
			preparedStatement.setString(6, student.getAddress());
			preparedStatement.setInt(7, student.getId());
			if(preparedStatement.executeUpdate()>0){
				return true;
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	public Student login(Student student){
		String sql="select * from s_student where name=? and password=?";
		Student studentRst=null;
		try {
			PreparedStatement prst =con.prepareStatement(sql);
			prst.setString(1, student.getName());
			prst.setString(2, student.getPassword());
			ResultSet executeQuery=prst.executeQuery();
			if(executeQuery.next()){
				studentRst =new Student();
				studentRst.setId(executeQuery.getInt("id"));
				studentRst.setName(executeQuery.getString("name"));
				studentRst.setPassword(executeQuery.getString("password"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentRst;
	}

}
