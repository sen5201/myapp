package com.denali.app;

import com.alibaba.fastjson.JSONObject;
import com.denali.app.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author : sen
 * Created by IDEA on 2019-12-10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {
    @Autowired
    private RedisUtil redisUtils;


    @Test
    public void setexpire() {
        JSONObject jj  = new JSONObject();
        jj.put("name","的的");
        jj.put("age",19);

        redisUtils.set("test_key", jj, 90000);
        redisUtils.set("aaaa", "hha哈哈");
    }

    @Test
    public void getdata() {

        JSONObject test_key = (JSONObject)redisUtils.get("test_key");
        System.out.println(test_key.toJSONString());
        String a1 = (String) redisUtils.get("aaaa");
        Object o = redisUtils.get("aaaa");
        System.out.println(o);
    }



}
