package com.wu.demo.admin.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 统一结果处理
 * @author wusq
 * @date 2020/8/5
 */
@RestControllerAdvice("com.wu.demo.admin.controller")
public class MyResponseBodyAdvice implements ResponseBodyAdvice<Object> {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return Boolean.TRUE;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType,
                                  Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {
        if (o instanceof String) {
            // 单独处理Controller返回值是String的情况
            ObjectMapper mapper = new ObjectMapper();
            String result = null;
            try {
                result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(new HttpResult(o));
            } catch (JsonProcessingException e) {
                log.error("字符串转换异常", e);
            }
            return result;
        }
        if(o instanceof HttpResult){
            return o;
        }
        return new HttpResult(o);
    }
}
