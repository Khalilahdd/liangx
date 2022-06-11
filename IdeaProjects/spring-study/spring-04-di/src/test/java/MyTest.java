import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());


        /**
         * Student{
         * name='迪丽热巴',
         * address=Address{address='深圳'},
         * books=[红楼梦, 西游记, 水浒传, 三国演义],
         * hobbies=[听歌, 敲代码, 看电影],
         * card={身份证=1111112345678999087, 银行卡=6645734355745354356},
         * games=[LOL, DNF],
         * wife='',
         * info={password=123456, driver=191120412, url=男, username=小明}}
         */
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user2",User.class);
        User user2 = context.getBean("user2",User.class);

        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user == user2);

    }
}
