package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kushan_chinthaka on 6/10/2017.
 */
public class VehicleMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("src/spring.xml");
        Bus bus = context.getBean("bus", Bus.class);
        System.out.println(bus.getDetails());
        System.out.println(bus.getSystems());
    }
}
