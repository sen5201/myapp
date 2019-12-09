package com.denali.app.service.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 *
 * 测试使用异步线程池
 * @Author : sen
 * Created by IDEA on 2019-12-09.
 */
@Slf4j
@Service
public class MyTestAsync {

    @Async("appAsyncThreadPool")
    public void test(){
        log.warn("hello world");
    }

}
