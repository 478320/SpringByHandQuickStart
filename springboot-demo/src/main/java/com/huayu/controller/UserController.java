package com.huayu.controller;


import com.huayu.test.User;
import org.huayu.web.annotation.*;

/**
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

    // 真正的Spring容器即使我没有配置扫描包，则会扫描ApplicationContext所在的包及其子包,所以我才能运行
    @PostMapping("/test")
    public User test(@RequestBody User user){
        return user;
    }
}
