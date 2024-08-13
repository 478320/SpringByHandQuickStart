package com.huayu;

import com.huayu.config.AppConfig;
import com.huayu.service.UserInterface;
import com.huayu.service.UserService;
import org.springframework.HuayuApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.coreTransactional.TransactionalPostProcess;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

/**
 *
 */
public class Test {
    public static void main(String[] args) throws SQLException, InvocationTargetException, IllegalAccessException {
        AnnotationConfigApplicationContext applicationContext =new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.test();

    }
}
