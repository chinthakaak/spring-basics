package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * Created by kushan_chinthaka on 6/4/2017.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
//        // Pure JDBC
//        JdbcDao jdbc = new JdbcDao();
//        System.out.println(jdbc.getCar(2).getModel());
//
//        // JDBC with DataSource injected in spring
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Car car = (Car)context.getBean("car");
//        System.out.println(car.getModel());
//
//        JdbcDao jdbcDao = (JdbcDao)context.getBean("jdbcDao");
//        jdbcDao.getCar(2);
//
//        // Using spring JDBC template
//        JdbcDaoUsingTemplate jdbcDaoTemplate = (JdbcDaoUsingTemplate)context.getBean("jdbcDaoTemplate");
//        Car c = jdbcDaoTemplate.getCar(3);
//        System.out.println(c.getModel());
//
//        // Using spring JDBC dao support
//        JdbcDaoUsingDaoSupport jdbcDaoUsingDaoSupport = (JdbcDaoUsingDaoSupport) context.getBean("jdbcDaoUsingDaoSupport");
//        System.out.println(jdbcDaoUsingDaoSupport.getCar(1).getModel());

        // Internationalization
        // 1. Using ApplicationContext
        MessageSource messageSoruce = (MessageSource) context.getBean("messageSource");
        System.out.println(messageSoruce.getMessage("message4", null, "default message", null));
        System.out.println(messageSoruce.getMessage("message4", new Object[] {"sri lanka",5}, "default message", null));

        // 2. Using ResourceBundleMessageSource
        Van van = (Van) context.getBean("van");
        van.drive();
    }
}
