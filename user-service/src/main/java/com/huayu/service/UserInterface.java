package com.huayu.service;

import com.huayu.aop.Auth;

import java.sql.SQLException;

/**
 *
 */
public interface UserInterface {

   void test() throws SQLException;

    @Auth
    void test2() throws SQLException;
}
