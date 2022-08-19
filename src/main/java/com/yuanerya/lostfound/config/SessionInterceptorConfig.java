package com.yuanerya.lostfound.config;

import com.yuanerya.lostfound.Interceptor.StudentInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SessionInterceptorConfig implements WebMvcConfigurer {
    /**
     *
     * 实现登录拦截
     */
    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new StudentInterceptor()).addPathPatterns("/**").excludePathPatterns("/login",
                "/loginStudent","/registerStudent",
                "/register");
    }


}
