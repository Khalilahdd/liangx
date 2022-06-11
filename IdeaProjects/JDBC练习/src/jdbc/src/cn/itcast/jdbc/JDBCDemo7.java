package jdbc.src.cn.itcast.jdbc;

import java.sql.*;

/*
    执行DDL语句
 */
public class JDBCDemo7 {

    public static void main(String[] args) {
        Connection connection = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            connection = DriverManager.getConnection("jdbc:mysql:///trade", "root", "root");
            //3.定义sql
            String sql = "select * from Shippers";
            //4.获取执行sql对象
            stat = connection.createStatement();
            //5.执行sql
            rs = stat.executeQuery(sql);
            //6.处理结果
            //循环判断（游标是否是最后一行）是否有下一行
            while (rs.next()) {
                //获取数据
                int ShipperID = rs.getInt(1);
                String CompanyName = rs.getString("CompanyName");
                String Phone = rs.getString(3);

                System.out.println(ShipperID  + "---" + CompanyName + "---" + Phone);
            }
//            //6.1 让游标向下移动一行
//            if (rs.next()) {
//                //判断是否有数据
//                //6.2 获取数据
//                int ShipperID = rs.getInt(1);
//                String CompanyName = rs.getString("CompanyName");
//                String Phone = rs.getString(3);
//
//                System.out.println(ShipperID  + "---" + CompanyName + "---" + Phone);
//            }


//            //6.1 让游标向下移动一行
//            rs.next();
//            //6.2 获取数据
//            int ShipperID1 = rs.getInt(1);
//            String CompanyName1 = rs.getString("CompanyName");
//            String Phone1 = rs.getString(3);

            //System.out.println(ShipperID1  + "---" + CompanyName1 + "---" + Phone1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //7.释放资源

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

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
