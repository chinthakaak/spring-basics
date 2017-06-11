package com.examples;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kushan_chinthaka on 6/10/2017.
 */
public class ProductMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("src/spring.xml");
        context.registerShutdownHook();
        Product product = context.getBean("product", Product.class);
    }
}
