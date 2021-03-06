package jdbc.src.cn.itcast.jdbc;

import jdbc.src.cn.itcast.jdbc.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * 练习：
 *      需求：
 *          1.通过硬盘录入用户名和密码
 *          2.判断用户是否登录成功

 */
public class JDBCDemo9 {

    public static void main(String[] args) {
        //1.键盘录入，接受用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        //2.调用方法
        boolean flag = new JDBCDemo9().login2(username, password);
        //3.判断结果，输出不同语句
        if (flag) {
            //登录成功
            System.out.println("登录成功！");
        }else {
            System.out.println("用户名或密码错误！");
        }
    }


    /**
     * 登录方法
     */
    public boolean login(String username,String password) {
        if (username == null || password == null) {
            return false;
        }
        //连接数据库判断是否成功
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        //1.获取连接
        try {
            conn = JDBCUtils.getConnection();
            //2.定义sql
            String sql = "select * from Products where username = '"+ username +"' and password = '"+ password +"' ";
            //3.获取执行sql的对象
            statement = conn.createStatement();
            //4.执行查询
            rs = statement.executeQuery(sql);
            //5.判断
//            if (rs.next()) {
//                //如果有下一行，则返回true
//                return true;
//            }else {
//                return false;
//            }
            return rs.next(); //如果有下一行，则返回true
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //JDBCUtils.close(rs,statement,conn);
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    /**
     * 登录方法，使用PreparedStatement
     */
    public boolean login2(String username,String password) {
        if (username == null || password == null) {
            return false;
        }
        //连接数据库判断是否成功
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        //1.获取连接
        try {
            conn = JDBCUtils.getConnection();
            //2.定义sql
            String sql = "select * from Products where username = ? and password = ?";
            //3.获取执行sql的对象
             pstmt = conn.prepareStatement(sql);
             //给?赋值
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            //4.执行查询,不需要传递sql
            rs = pstmt.executeQuery();
            //5.判断
//            if (rs.next()) {
//                //如果有下一行，则返回true
//                return true;
//            }else {
//                return false;
//            }
            return rs.next(); //如果有下一行，则返回true
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //JDBCUtils.close(rs,statement,conn);
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
