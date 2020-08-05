package com.wu.demo.admin.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 跨域解决方案
 * @author wusq
 * @date 2020/8/5
 */
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**") // 允许跨越访问的路径
                .allowedOrigins("*") // 允许跨域访问的源
                .allowedMethods("*") // 允许请求方法
                .maxAge(16800) // 预检间隔时间
                .allowedHeaders("*") // 允许头部设置
                .allowCredentials(Boolean.TRUE); // 是否发送cookie
    }

}
