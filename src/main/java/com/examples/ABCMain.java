package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kushan_chinthaka on 6/10/2017.
 */
public class ABCMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        A a = (A)context.getBean("a");
        a.print();
    }
}
