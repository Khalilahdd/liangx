import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//
//        List<User> users = mapper.selectUser();
//
//        for (User user : users) {
//            System.out.println(user);
//        }
//
//
//        sqlSession.close();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);

        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }

    }
}