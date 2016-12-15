package com.wwq.jedis;

import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2016-12-15.
 */
public class TestRedis {
    private Jedis jedis;

    @Before
    public void setup() {
        jedis = new Jedis("127.0.0.1", 6379);
    }

    //@Test
    public void testString() {

//        jedis.set("name_name", "xinxin");
//        System.out.println(jedis.get("name_name"));


        //拼接字符串
//        jedis.append("name_name", " is my lover");
//        System.out.println(jedis.get("name_name"));


        //删除键值对
//        jedis.del("name_name");
//        System.out.println(jedis.get("name_name"));

        //设置多个键值对
//        jedis.mset("name_name", "liuling", "age_age", "23", "qq_qq", "2342434");
//        jedis.incr("age_age");
//        System.out.println(jedis.get("name_name") + " - " + jedis.get("age_age") + " - " + jedis.get("qq_qq"));

    }


    //@Test  //测试散列集
    public void testMap() {
        //添加数据
//        Map<String,String> map = new HashMap<String,String>();
//        map.put("name_name", "xinxin");
//        map.put("age_age", "22");
//        map.put("qq_qq", "31241234");
//        jedis.hmset("user_user", map);


        //获取散列集的多个值
//        List<String> rsMap = jedis.hmget("user_user", "name_name", "age_age", "qq_qq");
//        System.out.println(rsMap);

        //删除散列集合的键值对
//        jedis.hdel("user_user", "age_age");
//        System.out.println(jedis.hget("user_user","age_age"));

//        System.out.println(jedis.hlen("user_user"));//获取散列集长度
//        System.out.println(jedis.exists("user_user"));//判断该散列集是否存在
//        System.out.println(jedis.hkeys("user_user"));//获取该散列集所有的key
//        System.out.println(jedis.hvals("user_user"));//获取该散列集所有的value


        //迭代获取散列集键值对
       /* Set<String> user_user = jedis.hkeys("user_user");
        for (String key : user_user) {
            String value = jedis.hget("user_user", key);
            System.out.println(key +" -- " + value);
        }*/

    }



    //@Test //测试列表集合
    public void testList() {
        //开始前先移除列表集合内容
//        jedis.del("java_framework");
//        System.out.println(jedis.lrange("java_framework", 0, -1));

        //先向key java_framework中存放三条数据
//        jedis.lpush("java_framework", "spring");
//        jedis.lpush("java_framework", "struts");
//        jedis.lpush("java_framework", "hibernate");

        //获取list集合所有元素
//        System.out.println(jedis.lrange("java_framework", 0, -1));

        //删除列表集合
//        jedis.del("java_framework");


        //从右边添加元素
//        jedis.rpush("java_framework", "spring");
//        jedis.rpush("java_framework", "struts");
//        jedis.rpush("java_framework", "hibernate");
//        System.out.println(jedis.lrange("java_framework", 0, -1));

    }



    //@Test  //集合类型
    public void testSet() {
        //添加集合元素
//        jedis.sadd("user_set", "liuling");
//        jedis.sadd("user_set", "xinxin");
//        jedis.sadd("user_set", "ling");
//        jedis.sadd("user_set", "zhangxinxin");
//        jedis.sadd("user_set", "who");
//        System.out.println(jedis.smembers("user_set"));//获取所有元素

        //移除元素
//        jedis.srem("user_set", "who");
//        System.out.println(jedis.smembers("user_set"));//获取所有元素


//        System.out.println(jedis.sismember("user_set", "who"));//判断元素是否存在该集合中
//        System.out.println(jedis.srandmember("user_set"));//随机获取集合中的元素

        System.out.println(jedis.scard("user_set"));//返回集合的元素个数

    }


    //@Test
    public void testSort() {
        //添加数据
//        jedis.del("a_a");
//        jedis.rpush("a_a", "1");
//        jedis.lpush("a_a", "6");
//        jedis.lpush("a_a", "3");
//        jedis.lpush("a_a", "9");

        System.out.println(jedis.lrange("a_a", 0, -1));

        System.out.println(jedis.sort("a_a"));

        System.out.println(jedis.lrange("a_a", 0, -1));
    }


    //@Test  //测试中文
    public void testChiness() {
//        jedis.set("ppp_ppp", "你好");
//        System.out.println(jedis.get("ppp_ppp"));
    }









}
