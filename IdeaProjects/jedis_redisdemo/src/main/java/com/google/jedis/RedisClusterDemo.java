package com.google.jedis;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

public class RedisClusterDemo {

    public static void main(String[] args) {
        //创建对象
        HostAndPort hostAndPort = new HostAndPort("127.0.0.1", 6379);
        //缺少密码

        JedisCluster jedisCluster = new JedisCluster(hostAndPort);

        //进行操作
        jedisCluster.set("b1","value1");

        String value = jedisCluster.get("b1");
        System.out.println(value);

        jedisCluster.close();
    }
}
