package com.huayu.aop;

import com.huayu.service.UserService;
import org.springframework.annotationAop.Around;
import org.springframework.annotationAop.Before;
import org.springframework.coreAop.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 *
 */
@org.springframework.annotationAop.Aop(joinAnnotationClass = Auth.class)
@Component("aop")
public class Aop {

    @Around
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知前置拦截器");
        Object invoke = joinPoint.invoke();
        System.out.println("环绕通知后置拦截器");
        return invoke;
    }

}
