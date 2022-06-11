import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper mapper = context.getBean("userMapper", UserMapper.class);

        for (User user : mapper.selectUser()) {
            System.out.println(user);
        }
    }

    @Test
    public void addUser() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        userMapper.addUser(new User(5,"小王","5564476"));

    }
}
