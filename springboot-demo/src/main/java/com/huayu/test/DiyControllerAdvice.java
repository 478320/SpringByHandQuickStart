package com.huayu.test;

import org.huayu.web.annotation.ConvertType;
import org.huayu.web.annotation.ExceptionHandler;
import org.huayu.web.annotation.RestControllerAdvice;

/**
 *
 */
@RestControllerAdvice
public class DiyControllerAdvice {

    @ExceptionHandler(Exception.class)
    public String ex(Exception e){
        System.out.println("全局异常处理器生效");
        return e.getMessage();
    }

    @ConvertType(Integer.class)
    public Object convert(Object arg){
        System.out.println("全局的Integer类型转换器");
        return 1;
    }
}
