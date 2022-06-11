package jdbc.src.cn.itcast.datasource.jdbctemplate;

import jdbc.src.cn.itcast.datasource.utils.JDBCUtils;
import jdbc.src.cn.itcast.domain.orderDetails;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JdbcTemplateDemo2 {

    //Junit单元测试，可以让方法独立执行
    //1.获取JDBCTemplate对象
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    /**
     * 1.修改1号数据的UnitPrice
     */
    @Test
    public void test1(){
        //1.获取JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //2.定义sql
        String sql = "update orderDetails set UnitPrice = 200 where OrderID = 10406";
        //3.执行sql
        int count = template.update(sql);
        System.out.println(count);
    }

    /**
     *2.添加一条记录
     */
    @Test
    public void test2() {

        String sql = "insert into orderDetails(OrderID,Quantity ) values(?,?)";
        int count = template.update(sql,11000,10);
        System.out.println(count);
    }

    /**
     * 3.删除刚才添加的记录
     *
     */
    @Test
    public void test3() {
        String sql = "delete from orderDetails where OrderID = ?";
        int count = template.update(sql, 11000);
        System.out.println(count);
    }

    /**
     * 4.查询OrderID为10532的记录，将其封装为Map集合
     * 注意：这个方法查询的结果集长度只能是1
     */
    @Test
    public void test4() {
        String sql = "select * from orderDetails where OrderID = ?";
        Map<String, Object> map = template.queryForMap(sql, 10532);//含有多条记录，封装失败
        System.out.println(map);
    }

    /**
     * 5.查询所以记录，将其封装为list
     */
    @Test
    public void test5() {
        String sql = "select * from orderDetails";
        List<Map<String, Object>> list = template.queryForList(sql);

        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(list);
        }
    }

    /**
     * 6.查询所以记录，将其封装为orderDetails对象的List集合
     */
    @Test
    public void test6() {
        String sql = "select * from orderDetails";
        List<orderDetails> list = template.query(sql, new BeanPropertyRowMapper<orderDetails>(orderDetails.class));
        for (orderDetails orderDetails : list) {
            System.out.println(orderDetails);
        }
//        List<orderDetails> list = template.query(sql, new RowMapper<orderDetails>() {
//
//            @Override
//            public orderDetails mapRow(ResultSet resultSet, int i) throws SQLException {
//                orderDetails orderDetails = new orderDetails();
//                int OrderID = resultSet.getInt("OrderID");
//                int productID = resultSet.getInt("ProductID");
//                double unitPrice = resultSet.getDouble("UnitPrice");
//                int quantity = resultSet.getInt("Quantity");
//                double discount = resultSet.getDouble("Discount");
//
//                orderDetails.setOrderID(OrderID);
//                orderDetails.setProductID(productID);
//                orderDetails.setUnitPrice(unitPrice);
//                orderDetails.setQuantity(quantity);
//                orderDetails.setDiscount(discount);
//
//                return orderDetails;
//            }
//        });
//
//        for (orderDetails orderDetails : list) {
//            System.out.println(orderDetails);
//        };
    }

    /**
     * 7.查询总记录数
     */
    @Test
    public void test7() {
        String sql = "select count(OrderID) from orderDetails";
        Long total = template.queryForObject(sql, long.class);
        System.out.println(total);
    }
}
