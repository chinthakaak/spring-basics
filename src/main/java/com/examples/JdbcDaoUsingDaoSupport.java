package com.examples;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by kushan_chinthaka on 6/5/2017.
 */
public class JdbcDaoUsingDaoSupport extends JdbcDaoSupport {
    public Car getCar(int id) {
        String sql = "select * from car where id = ?";
        return (Car) getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper(Car.class), id);
    }
}
