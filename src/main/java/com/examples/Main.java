package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * Created by kushan_chinthaka on 6/4/2017.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Car car = (Car)context.getBean("car");
        System.out.println(car.getModel());

        JdbcDao jdbcDao = (JdbcDao)context.getBean("jdbcDao");
        jdbcDao.getCar(2);

        JdbcDaoUsingTemplate jdbcDaoTemplate = (JdbcDaoUsingTemplate)context.getBean("jdbcDaoTemplate");
        Car c = jdbcDaoTemplate.getCar(3);
        System.out.println(c.getModel());

    }
}
