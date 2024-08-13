package com.huayu.test;

import org.huayu.web.annotation.EnableWebMvc;
import org.huayu.web.intercpetor.InterceptorRegistry;
import org.huayu.web.support.WebMvcConfigurer;
import org.springframework.stereotype.Component;

/**
 *
 */
@EnableWebMvc
@Component
public class HuayuWebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addIntercept(InterceptorRegistry registry) {
        registry.addInterceptor(new WebInterceptor()).addIncludePatterns("/order/**").addExcludePatterns("/order/test");
    }
}
