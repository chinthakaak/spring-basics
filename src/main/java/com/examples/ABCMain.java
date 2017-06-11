package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kushan_chinthaka on 6/10/2017.
 */
public class ABCMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("src/spring.xml");
        A a = context.getBean("a", A.class);
        a.print();
    }
}
