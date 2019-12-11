package com.denali.app.aspect;

import java.lang.annotation.*;

/**
 * @author sen
 *
 * Created by IDEA on 2019-12-11.
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface WebLog {
    /**
     * 日志描述信息
     *
     * @return
     */
    String description() default "";

}

