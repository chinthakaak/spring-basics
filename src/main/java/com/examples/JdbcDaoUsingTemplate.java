package com.examples;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by kushan_chinthaka on 6/4/2017.
 */
public class JdbcDaoUsingTemplate {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Car getCar(int id) {
        String query = "select * from car where id = ?";
        Car c = (Car) jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper(Car.class), id);
        return c;
    }

    private class CustomRowMapper implements RowMapper{

        public Object mapRow(ResultSet resultSet, int i) throws SQLException {
            return null;
        }
    }
}
