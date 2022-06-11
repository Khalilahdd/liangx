package jdbc.src.cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
    1.Product表 添加一条记录 insert 语句
    2.Product表 修改记录
    3.Product表 删除一条记录
 */
public class JdbcDemo2 {

    public static void main(String[] args) {
        Statement stat = null;
        Connection connection = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.定义sql
            String sql = "insert into Categories values(null,'啥也不是','不知道')";
            //3.获取Connection对象
            connection = DriverManager.getConnection("jdbc:mysql:///trade", "root", "root");
            //4.获取执行sql的对象 Statement
            stat = connection.createStatement();
            //5.执行sql
            int count = stat.executeUpdate(sql);//影响的行数
            //6.处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("添加成功！ ");
            } else {
                System.out.println("添加失败! ");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //stat.close();
            //7.释放资源
            //避免空指针异常
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
