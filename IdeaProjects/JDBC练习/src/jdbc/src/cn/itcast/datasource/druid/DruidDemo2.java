package jdbc.src.cn.itcast.datasource.druid;

import jdbc.src.cn.itcast.datasource.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 使用新的工具类
 */
public class DruidDemo2 {

    public static void main(String[] args) {
        /**
         * 完成添加操作：给Products表添加一条记录
         */
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {

            //1.获取连接
            conn = JDBCUtils.getConnection();
            //2.定义sql
            String sql = "insert Categories values(123,?,?)";
            //获取pstmt对象
            pstmt = conn.prepareStatement(sql);
            //4.给?赋值
            pstmt.setString(1,"哦豁");
            pstmt.setString(2,"不清楚");
            //5.执行sql
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //6.释放资源
            JDBCUtils.close(pstmt,conn);
        }
    }
}
