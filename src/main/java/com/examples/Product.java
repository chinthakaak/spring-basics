package com.examples;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by kushan_chinthaka on 6/10/2017.
 */
public class Product implements InitializingBean, DisposableBean {
    public void destroy() throws Exception {
        System.out.println("distroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("after property set");
    }
}
