package jdbc.src.cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
    执行DDL语句
 */
public class JDBCDemo5 {

    public static void main(String[] args) {
        Connection connection = null;
        Statement stat = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            connection = DriverManager.getConnection("jdbc:mysql:///trade", "root", "root");
            //3.定义sql
            String sql = "create table student (id int, name varchar(20))";
            //4.获取执行sql对象
            stat = connection.createStatement();
            //5.执行sql
            int count = stat.executeUpdate(sql);
            //6.处理结果
            System.out.println(count);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //7.释放资源

            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
