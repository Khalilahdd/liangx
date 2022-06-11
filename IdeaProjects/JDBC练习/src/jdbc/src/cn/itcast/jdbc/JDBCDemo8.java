package jdbc.src.cn.itcast.jdbc;

import jdbc.src.cn.itcast.domain.orderDetails;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
    定义一个方法：查询OrderDetails表的数据将其封装为对象，然后装载集合，返回。
 */
public class JDBCDemo8 {

    public static void main(String[] args) {
        List<orderDetails> list = new JDBCDemo8().findAll();
        System.out.println(list);
        System.out.println(list.size());
    }

    /*
        查询所以OrderDetails对象
        @return
     */
    public List<orderDetails> findAll() {
        ResultSet rs = null;
        Statement stat = null;
        Connection connection = null;
        List<orderDetails> list = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            connection = DriverManager.getConnection("jdbc:mysql:///trade", "root", "root");
            //3.定义sql
            String sql = "select * from OrderDetails";
            //4.获取执行SQL对象
            stat = connection.createStatement();
            //5.执行sql
            rs = stat.executeQuery(sql);
            //6.遍历结果集，封装对象，装载集合
            orderDetails orderDetails = null;
            list = new ArrayList<orderDetails>();
            while (rs.next()) {
                //获取数据
                int orderID = rs.getInt("OrderID");
                int productID = rs.getInt("ProductID");
                double unitPrice = rs.getDouble("UnitPrice");
                int quantity = rs.getInt("Quantity");
                double discount = rs.getDouble("Discount");

                //创建orderDetails对象,并赋值
                orderDetails = new orderDetails();
                orderDetails.setOrderID(orderID);
                orderDetails.setProductID(productID);
                orderDetails.setUnitPrice(unitPrice);
                orderDetails.setQuantity(quantity);
                orderDetails.setDiscount(discount);
                //装载集合
                list.add(orderDetails);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
        return list;
    }
}
