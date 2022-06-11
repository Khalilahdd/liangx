package jdbc.src.cn.itcast.jdbc;

import jdbc.src.cn.itcast.jdbc.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 事务操作
 */
public class JDBCDemo10 {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
            //开启事务
            conn.setAutoCommit(false);
            //2.定义sql
            //2.1 张三 - 500
            String sql1 = "update Products set UnitsInStock = UnitsInStock - ? where productID = ?";
            //2.2 李四 + 500
            String sql2 = "update Products set UnitsInStock = UnitsInStock + ? where productID = ?";
            //3.获取执行SQL对象
            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);
            //4.设置参数
            pstmt1.setInt(1,100);
            pstmt1.setInt(2,1);

            pstmt1.setInt(1,100);
            pstmt1.setInt(2,2);

            //执行sql
            pstmt1.executeUpdate();
            pstmt2.executeUpdate();

            //提交事务
            conn.commit();

        } catch (SQLException e) {
            //事务回滚
            try {
                if (conn != null)
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            if (pstmt2 != null) {
                try {
                    pstmt2.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (pstmt1 != null) {
                try {
                    pstmt1.close();
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

    }
}
