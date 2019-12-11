package com.denali.app.config.redis;

import com.denali.app.service.redis.RedisService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * redis配置类
 *
 * @author sen
 * Created by IDEA on 2019-12-08.
 **/
//@Configuration 注释掉表示不自动实例化，而是通过自定义注解开启。
public class RedisConfig {

  @Bean
  @ConditionalOnClass(RedisOperations.class)
  public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
    RedisTemplate<String, Object> template = new RedisTemplate<>();
    template.setConnectionFactory(factory);

    Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<>(Object.class);
    ObjectMapper mapper = new ObjectMapper();
    mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
    mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
    jackson2JsonRedisSerializer.setObjectMapper(mapper);

    StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
    // key采用 String的序列化方式
    template.setKeySerializer(stringRedisSerializer);
    // hash的 key也采用 String的序列化方式
    template.setHashKeySerializer(stringRedisSerializer);
    // value序列化方式采用 jackson
    template.setValueSerializer(jackson2JsonRedisSerializer);
    // hash的 value序列化方式采用 jackson
    template.setHashValueSerializer(jackson2JsonRedisSerializer);
    template.afterPropertiesSet();

    return template;
  }


  @Bean
  @ConditionalOnBean(name = "redisTemplate")
  public RedisService redisService() {
    return new RedisService();
  }

}
