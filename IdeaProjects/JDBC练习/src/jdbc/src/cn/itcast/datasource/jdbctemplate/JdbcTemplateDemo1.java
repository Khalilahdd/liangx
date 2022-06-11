package jdbc.src.cn.itcast.datasource.jdbctemplate;

import jdbc.src.cn.itcast.datasource.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * JdbcTemplate入门
 */
public class JdbcTemplateDemo1 {

    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JDBCTemplate对象
        DataSource dataSource;
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用方法
        String sql = "update Products set UnitPrice = 100 where productID = ?";
        int count = template.update(sql, 3);
        System.out.println(count);
    }
}
