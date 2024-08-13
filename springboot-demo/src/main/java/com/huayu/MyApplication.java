package com.huayu;


import com.springboot.HuayuSpringApplication;
import com.springboot.annotation.HuayuSpringBootApplication;
import com.springboot.webServer.WebServerAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 *
 */
@HuayuSpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        HuayuSpringApplication.run(MyApplication.class);
    }
}
