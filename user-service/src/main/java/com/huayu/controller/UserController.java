package com.huayu.controller;

import com.huayu.mapper.UserMapper;
import org.huayu.web.annotation.GetMapping;
import org.huayu.web.annotation.RestController;
import org.springframework.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 *
 */
@Component("userController")
public class UserController {


    @GetMapping("/test")
    public String test(){
        return "123";
    }
}
