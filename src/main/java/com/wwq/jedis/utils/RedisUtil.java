package com.wwq.jedis.utils;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by Administrator on 2016-12-15.
 */
public class RedisUtil {

    private static String ADDR = "127.0.0.1";//redis服务ip
    private static int port = 6379;//redis访问端口
    private static String AUTH = "admin";//redis访问密码

    private static int MAX_ACTIVE = 1024;//连接实例的最大数目

    private static int MAX_IDLE = 200;//最多有多少个idle(空闲)的jedis实例

    private static int MAX_WAIT = 10000;//等待可用连接的最大时间,毫秒,-1表示永远不超时;如果超出等待时间则抛出异常

    private static int TIMEOUT = 10000;

    private static boolean TEST_ON_BORROW = true;//在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；

    private static JedisPool jedisPool = null;


    static {
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }



}
