package com.scbrl.util;


import com.alibaba.druid.util.StringUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @功能: Redis JedisPool
 * @说明: 用于处理高并发/数据缓存信息
 */
public class RedisUtil {


    private static JedisPool pool = null;

    /**
     * @功能: Redis JedisPool 连接池初始化
     */
    public static JedisPool getPool() {
        if (pool == null) {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxTotal(500);
            config.setMaxIdle(5);
            config.setMaxWaitMillis(1000 * 100);
            config.setTestOnBorrow(true);

            pool = new JedisPool(config,"127.0.0.1",6379,10000,"BruceLiu!@#20161128");
        }
        return pool;
    }

    /**
     * @参数: pool 连接池实例
     * @参数: redis 数据对象
     */
    public static void returnResource(JedisPool pool, Jedis redis) {
        if (redis != null) {
            //pool.returnResource(redis);
            redis.close();
        }
    }

    /**
     * @说明: 将数据存入jedis
     * @参数: key 唯一标识
     * @参数: value 数据(json格式)
     */
    public static String put(String key,String value){
        JedisPool pool = null;
        Jedis jedis = null;
        try {
            pool = getPool();
            jedis = pool.getResource();
            value = jedis.set(key, value);
        } catch (Exception e) {
            //pool.returnBrokenResource(jedis);
            jedis.close();
            e.printStackTrace();
        } finally {
            returnResource(pool, jedis);
        }

        return value;
    }

    /**
     * XX:不管存在不存在都去设置     NX:不存在才去设置
     * EX:秒                        PX:毫秒
     **/
    public static String put(String key,String value,int time){
        JedisPool pool = null;
        Jedis jedis = null;
        try {
            pool = getPool();
            jedis = pool.getResource();
            value = jedis.set(key, value);
            jedis.expire(key,time);
        } catch (Exception e) {
            //pool.returnBrokenResource(jedis);
            jedis.close();
            e.printStackTrace();
        } finally {
            returnResource(pool, jedis);
        }

        return value;
    }

    /**
     * @说明: 根据key获取缓存数据
     * @参数: key 唯一标识
     */
    public static String get(String key){
        String value = null;
        JedisPool pool = null;
        Jedis jedis = null;
        try {
            pool = getPool();
            jedis = pool.getResource();
            value = jedis.get(key);
        } catch (Exception e) {
           // pool.returnBrokenResource(jedis);
            jedis.close();
            e.printStackTrace();
        } finally {
            returnResource(pool, jedis);
        }
        return value;
    }

    /**
     * @说明: 根据key删除缓存数据
     * @参数: key 唯一标识
     */
    public static void del(String key){
        String value = null;
        JedisPool pool = null;
        Jedis jedis = null;
        try {
            pool = getPool();
            jedis = pool.getResource();
            if(!StringUtils.isEmpty(key)){
                jedis.del(key);
            }
        } catch (Exception e) {
            //pool.returnBrokenResource(jedis);
            jedis.close();
            e.printStackTrace();
        } finally {
            returnResource(pool, jedis);
        }
    }


}