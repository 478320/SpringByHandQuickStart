package com.huayu.test;

import org.huayu.web.annotation.RequestMapping;
import org.huayu.web.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/get")
    public String get(){
        return "ok";
    }
}
