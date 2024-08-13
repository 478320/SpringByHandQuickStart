package com.huayu.mapper;

import com.alibaba.druid.pool.DruidDataSource;
import com.huayu.domain.User;
import org.springframework.annotation.Autowired;
import org.springframework.coreTransactional.TransactionalManager;
import org.springframework.jdbc.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 *
 */
@Component("userMapper")
public class UserMapper {

    @Override
    public String toString() {
        return "UserMapper{" +
                "transactionalManager=" + transactionalManager +
                ", jdbcTemplate=" + jdbcTemplate +
                '}';
    }

    @Autowired
    public static DruidDataSource dataSource;

    @Autowired
    public TransactionalManager transactionalManager;


    public DataSource getDataSource() {
        return dataSource;
    }

    //这么写会在类的构造函数之前就生成所以也要Autowire
    @Autowired
    public JdbcTemplate jdbcTemplate;


    public List<Object> query() throws Exception {
        String sql = "select * from user";
        return this.jdbcTemplate.executeQuery(sql,null,(resultSet,rowNum) -> {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            return user;
        });
    }


    public int register(User user) throws SQLException {
        String sql = "INSERT INTO user (name) VALUES ('" + user.getName() + "');";
        System.out.println("执行注册");
        int update = this.jdbcTemplate.update(sql);

        return update;
    }


}
