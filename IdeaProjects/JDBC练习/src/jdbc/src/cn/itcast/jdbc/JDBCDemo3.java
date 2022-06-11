package jdbc.src.cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
    2.Product表 修改记录
 */
public class JDBCDemo3 {

    public static void main(String[] args) {
        Connection connection = null;
        Statement stat = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            connection = DriverManager.getConnection("jdbc:mysql:///trade", "root", "root");
            //3.定义sql
            String sql = "update Products set UnitPrice = 1000 where ProductID = 2";
            //4.获取执行sql对象
            stat = connection.createStatement();
            //5.执行sql
            int count = stat.executeUpdate(sql);
            //6.处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("修改成功！");
            } else {
                System.out.println("修改失败！");
            }
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
