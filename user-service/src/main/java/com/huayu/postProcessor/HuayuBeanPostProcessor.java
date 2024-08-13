package com.huayu.postProcessor;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 */
@Component("huayuBeanPostProcessor")
public class HuayuBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("初始化前");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
//        System.out.println("初始化后");
//        if (beanName.equals("userService")){
//            Object proxyInstance = Proxy.newProxyInstance(HuayuBeanPostProcessor.class.getClassLoader(),
//                    bean.getClass().getInterfaces(), new InvocationHandler() {
//                        @Override
//                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                            System.out.println("代理逻辑");
//                            System.out.println("代理逻辑");
//                            System.out.println("代理逻辑");
//                            return method.invoke(bean,args);
//                        }
//                    });
//            return proxyInstance;
//        }
        return bean;
    }

}
