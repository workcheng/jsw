package com.cheng.jws;

import com.cheng.jws.domain.User;
import com.cheng.jws.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenghui
 */
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("spring-mybatis.xml");
        log.info("the app is running!");
        context.start();
        UserServiceImpl bean = context.getBean(UserServiceImpl.class);
        User test = bean.test();
        log.info("test={}",test);
        User user = bean.getUser(1);
        log.info("user={}",user);

    }
}
