package com.denali.app.annotation;

import com.denali.app.config.redis.RedisConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author sen
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(RedisConfig.class)
public @interface EnableRedisSuport {
}
