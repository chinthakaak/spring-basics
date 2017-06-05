package com.examples;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by kushan_chinthaka on 6/4/2017.
 */
public class JdbcDao {
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private DataSource dataSource;

    public Car getCar(int id) throws SQLException {
        Connection connection = dataSource.getConnection();
        return null;
    }
}
