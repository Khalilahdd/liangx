package com.google;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.pojo.User;
import com.google.utils.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;


@SpringBootTest
class Redis02SpringbootApplicationTests {

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtils redisUtils;

    @Test
    public void test1() {
        redisUtils.set("name","Khalilah");
        System.out.println(redisUtils.get("name"));
    }

    @Test
    void contextLoads() {

        //在企业开发中，我们80%的情况下，都不会使用这个原生的方法去编写代码！
        //RedisUtils

        //redisTemplate
        //opsForValue 操作字符串    类似String,api和我们的指令是一样的
        //opsForList    操作List  类似list
        //opsForSet    操作List  类似list
        //opsForHash
        //opsForGeo
        //opsForHyperLogLog

        //除了上面的操作，我们常用的方法都可以直接通过redisTemplate操作，比如事务和基本的CRUD
        //获取redis的连接对象
//        RedisConnection connection = redisTemplate.getConnectionFactory().getConnection();
//        connection.flushDb();
//        connection.flushAll();

        redisTemplate.opsForValue().set("mykey","mark");
        System.out.println(redisTemplate.opsForValue().get("mykey"));
    }

    @Test
    public void test() throws JsonProcessingException {
        //真实的开发一般都使用json来传递对象
        User user = new User("迪丽热巴", 28);
//        String jsonUser = new ObjectMapper().writeValueAsString(user);
        redisTemplate.opsForValue().set("user",user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }
}
