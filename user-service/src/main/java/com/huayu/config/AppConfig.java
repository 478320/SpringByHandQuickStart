package com.huayu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.annotation.Bean;
import org.springframework.annotation.BeanName;
import org.springframework.annotation.ComponentScan;
import org.springframework.configAop.EnableAspectJAutoProxy;
import org.springframework.coreTransactional.EnableTransactionalManager;
import org.springframework.coreTransactional.TransactionalManager;
import org.springframework.jdbc.JdbcTemplate;

import javax.sql.DataSource;

/**
 * 扫描注解只能扫定义好的位置很烦
 */
@ComponentScan("com.huayu")
@EnableAspectJAutoProxy
@EnableTransactionalManager
public class AppConfig {

    @Bean("dataSource")
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_hand");
        dataSource.setUsername("root");
        dataSource.setPassword("Yusiheng666666");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }

    @Bean("transactionalManager")
    public TransactionalManager transactionalManager(@BeanName("dataSource")DataSource dataSource){
        TransactionalManager transactionalManager = new TransactionalManager(dataSource);
        return transactionalManager;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate jdbcTemplate(@BeanName("dataSource")DataSource dataSource,@BeanName("transactionalManager")TransactionalManager transactionalManager){
        return new JdbcTemplate(dataSource,transactionalManager);
    }

}
