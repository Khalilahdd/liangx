import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserTest {
    //测试数据库是否链接成功
    @Test
    public void UserTest() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startindex", 0);
        map.put("pagesize", 5);
        List<User> userList = mapper.getUser(map);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    //通过userCode获取User
    @Test
    public void getLoginUser() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getLoginUser("admin");
        System.out.println(user);
        sqlSession.close();
    }

    //增加用户信息
    @Test
    public void add() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        int add = mapper.add(new User());
        User user = new User();
        user.setId(16);
        user.setUserCode("zz");
        mapper.add(user);
        sqlSession.commit();
        sqlSession.close();
    }

    //通过条件查询userList,limit分页
    @Test
    public void getUserList() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> admin = mapper.getUserList("李明", 2, 0, 4);
        for (User user : admin) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    //通过条件查询-用户表记录数
    @Test
    public void getUserCount() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int userCount = mapper.getUserCount("张华", 3);
        System.out.println(userCount);
        sqlSession.close();
    }

    //删除用户，通过id
    @Test
    public void deleteUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUserById(16);
        sqlSession.commit();
        sqlSession.close();
    }

    //通过id查询用户
    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.commit();
    }

    //通过id修改用户信息
    @Test
    public void modify() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUserName("修改用户");
        user.setId(5);
        user.setUserCode("hahha");
//      user.setPhone("11111111111");
        mapper.modify(user);
        sqlSession.commit();
        sqlSession.close();
    }

    //修改当前用户密码
    @Test
    public void updatePwd(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updatePwd(1,"123456");
        sqlSession.commit();
        sqlSession.close();
    }
}
