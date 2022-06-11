package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void getUserList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

//        List<User> userList = mapper.getUserList();
        User userById = mapper.getUserById(1);

    System.out.println(userById);

//        for (User user : userList) {
//      System.out.println(user);
//    }

        sqlSession.close();
    }

    // select * from mybatis.user where id = #{id}
    //类型处理器
    // select id,username,pwd as password from mybatis.user where id = #{id}
}
