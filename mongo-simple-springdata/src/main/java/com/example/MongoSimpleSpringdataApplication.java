package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication

public class MongoSimpleSpringdataApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoSimpleSpringdataApplication.class);
        UserDaoImpl userDaoImpl = (UserDaoImpl) ctx.getBean("userDaoImpl");

        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setId("" + i);
            user.setAge(i);
            user.setName("zcy" + i);
            user.setPassword("zcy" + i);
            userDaoImpl.insert(user, "users");
        }
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("maxAge", 50);
        List<User> list = userDaoImpl.findAll(params, "users");
        System.out.println("user.count()==" + list.size());

    }

}

