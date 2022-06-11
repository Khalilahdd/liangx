package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = mapper.getUsers();
//
//        for (User user : users) {
//            System.out.println(user);
//        }

//        User userById = mapper.getUserById(1);
//        System.out.println(userById);

//        mapper.addUser(new User(5,"李四","1231235"));


//        mapper.updateUser(new User(5,"Hello","423231"));

        mapper.deleteUser(5);

        sqlSession.close();
    }
}
