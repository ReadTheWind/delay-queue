package com.learn.queue.delayqueue.redis.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @Description: redis 工具类
 * @Author: lh
 * @Date: 2020/11/14 15:21
 **/
@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate redisTemplate;

}
