package ru.alexander.learning.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService us = (UserService) context.getBean("us");
        System.out.println(us.getPrivileges(1));

        EditorService es = context.getBean(EditorService.class);
        es.edit(1, "abc");

//        UserService userService = new UserService(true, false);
//        EditorService editorService = new EditorService(userService);
//        editorService.edit(1, "abc");
    }

}
