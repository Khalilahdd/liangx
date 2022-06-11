package com.artisan.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private String dbUrl="jdbc:mysql://localhost:3306/db_student?useUnicode=true&characterEncoding=utf8&useSSL=false";
	//private String dbUrl="jdbc:mysql://localhost:3306/db_student";
	private String dbUserName="root";
	private String dbPassword="root";
	private String jdbcName="com.mysql.jdbc.Driver";
	
	public Connection getCon(){
		try {
	    	
				Class.forName(jdbcName);
				System.out.println("驱动加载成功！");
			} catch (ClassNotFoundException e) {

				System.out.println("加载失败！");
				e.printStackTrace();
			}
			Connection con =null;
	try {
		con =  DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		
	} catch (SQLException e) {
		e.printStackTrace();
	
	}
	return con;
}
	public void closeCon(Connection con)throws Exception{
		if(con!=null){
			con.close();
		}
	}
	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {dbUtil.getCon();
		System.out.println("数据库连接成功");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("数据库连接失败");
		}
	}
	
	}


