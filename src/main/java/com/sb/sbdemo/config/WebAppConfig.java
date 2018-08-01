package com.sb.sbdemo.config;

import com.sb.sbdemo.access.AccessHandlerInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by yeli on 1/8/18.
 */
@SpringBootConfiguration
public class WebAppConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AccessHandlerInterceptor()).addPathPatterns("/");
    }
}
