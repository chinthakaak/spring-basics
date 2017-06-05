package com.examples;

import javax.sql.DataSource;
import java.sql.*;

/**
 * Created by kushan_chinthaka on 6/4/2017.
 */
public class JdbcDao {
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private DataSource dataSource;

    public Car getCar(int id) throws SQLException {
        Connection connection=null;
        try {
            String driver = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driver);

            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "company","password");

            PreparedStatement preparedStatement = connection.prepareStatement("select * from car where id = ?");
            preparedStatement.setInt(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();

            Car car = new Car();

            while (resultSet.next()) {
                car.setModel(resultSet.getString("model"));
            }

            preparedStatement.close();
            resultSet.close();
            return car;

        }catch (Exception e) {
            throw new RuntimeException();
        } finally {
            try {
                connection.close();

            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
