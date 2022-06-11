package jdbc.src.cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
    JDBC快速入门
 */
public class JdbcDemo1 {

    public static void main(String[] args) throws Exception {
        //1.导入驱动jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库的连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trade", "root", "root");
        //4.定义SQL语句
        String sql = "update Products set UnitPrice = 500 where ProductID = 1";
        //String sql = "update Products set UnitPrice = 500";
        //获取执行SQL的对象 Statement
        Statement stat = connection.createStatement();
        //6.执行SQL
        int count = stat.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stat.close();
        connection.close();
    }
}
