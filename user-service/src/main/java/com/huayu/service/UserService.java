package com.huayu.service;

import com.huayu.aop.Auth;
import com.huayu.domain.User;
import com.huayu.mapper.UserMapper;
import org.springframework.annotationTransactional.Transactional;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

/**
 *
 */
@Component("userService")
public class UserService implements BeanNameAware, InitializingBean,UserInterface{
    @Autowired(require = true)
    public OrderService orderService;

    private String beanName;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    @Autowired
    public UserMapper userMapper;

    @Override
    public void setBeanName(String name) {
        beanName = name;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }


    @Auth
    @Override
    @Transactional
    public void test() throws SQLException {
        System.out.println(getOrderService());
        System.out.println(beanName);
        User user = new User();
        user.setName("huayulianai");
        userMapper.register(user);
        int i = 1/0;

    }

    //@Auth
    @Override
    public void test2() throws SQLException {

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("xxxx");
    }
}
