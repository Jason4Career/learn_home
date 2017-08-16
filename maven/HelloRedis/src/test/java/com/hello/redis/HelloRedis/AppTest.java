package com.hello.redis.HelloRedis;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void helloRedis1() {

		Jedis jedis = new Jedis("127.0.0.1", 6379);
		jedis.set("hello", "world");
		System.out.println("-------------this is jedis--------------------");
		System.out.println(jedis.get("hello"));
		System.out.println("-------------this is jedis--------------------");

	}

	@Test
	public void helloRedis2() {

		JedisPoolConfig config = new JedisPoolConfig();
		// 设置redis最大连接数
		config.setMaxTotal(10);
		// 设置redis最大空闲连接数
		config.setMaxIdle(10);

		JedisPool pool = new JedisPool(config, "127.0.0.1", 6379);
		Jedis jedis = null;

		try {
			jedis = pool.getResource();
			jedis.set("hello", "world1");
			System.out.println("-------------this is jedisConfig--------------------");
			System.out.println(jedis.get("hello"));
			System.out.println("-------------this is jedisConfig--------------------");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.close();
			config.clone();
		}

	}
}
