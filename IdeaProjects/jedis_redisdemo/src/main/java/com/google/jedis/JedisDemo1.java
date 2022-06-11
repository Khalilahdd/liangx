package com.google.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import java.util.List;
import java.util.Set;

public class JedisDemo1 {

    public static void main(String[] args) {
        //创建Jedis对象
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.auth("000419");

        //测试
        String value = jedis.ping();
        System.out.println(value);
    }

    //操作zset
    @Test
    public void demo5() {
        //创建Jedis对象
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.auth("000419");

        jedis.zadd("china",100d,"shanghai");
        System.out.println(jedis.zrange("china", 0, -1));
    }

    //操作hash
    @Test
    public void demo4() {
        //创建Jedis对象
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.auth("000419");

        jedis.hset("users","age","20");
        System.out.println(jedis.hget("users", "age"));
    }

    //操作set
    @Test
    public void demo3() {
        //创建Jedis对象
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.auth("000419");

       jedis.sadd("name1","lucy","jack");
        Set<String> smembers = jedis.smembers("name1");
        System.out.println(smembers);
    }

    //操作list
    @Test
    public void demo2() {
        //创建Jedis对象
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.auth("000419");

        jedis.lpush("key1","lucy","mary","jack");
        List<String> values = jedis.lrange("key1", 0, -1);
        System.out.println(values);
    }

    //操作key String
    @Test
    public void demo1() {
        //创建Jedis对象
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.auth("000419");

        //添加
        jedis.set("name","lucy");

        //获取
        String name = jedis.get("name");
        System.out.println(name);

        //设置多个key-value
        jedis.mset("k1","v1","k2","v2");
        List<String> mget = jedis.mget("k1", "k2");
        System.out.println(mget);

        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
