package com.examples.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by kushan_chinthaka on 6/10/2017.
 */
public class ColMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collections-spring.xml");
        ShoppingCart shoppingCart = context.getBean("shoppingcart", ShoppingCart.class);
        System.out.println(shoppingCart.getItems());

        ShoppingCart shoppingCart2 = context.getBean("shoppingcart2", ShoppingCart.class);
        System.out.println(shoppingCart2.getItems());

        System.out.println(shoppingCart.getQuantities());
        List items= shoppingCart2.getItems();
        System.out.println(items instanceof ArrayList);

        System.out.println(shoppingCart.getGifts());
        Set gifts = shoppingCart.getGifts();
        System.out.println(gifts instanceof TreeSet);


    }
}
