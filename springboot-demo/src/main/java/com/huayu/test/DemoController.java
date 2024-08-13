package com.huayu.test;

import org.huayu.web.annotation.*;

/**
 *
 */
@RequestMapping("/order")
@RestController
public class DemoController {

    @ExceptionHandler(ArithmeticException.class)
    public String ex(Exception e){
        System.out.println("局部异常处理器生效");
        return e.getMessage();
    }

    @ConvertType(Boolean.class)
    public Object convert(Object arg){
        System.out.println("局部的Boolean类型转换器");
        return 1;
    }


    @RequestMapping("/test")
    public String test(){
        return "排除咯";
    }

    @GetMapping("/get/simple")
    public String getSimple(String name,long l){
        System.out.println(name);
        System.out.println(l);
        return "ok";
    }

    @GetMapping("/get")
    public String get(String name,long l,Integer i,Boolean flag){
        System.out.println(name);
        System.out.println(l);
        System.out.println(i);
        System.out.println(flag);
        return "ok";
    }

    @PostMapping("/get/object")
    public User get2(@RequestBody User user){
        return user;
    }

    @PostMapping("/get/header")
    public String get3(@RequestHeader String token,@RequestHeader Integer i){
        System.out.println(token);
        System.out.println(i);
        return "ok";
    }

    @RequestMapping("/get/{id}/{name}")
    public String get4(){
        return "ok";
    }
}
