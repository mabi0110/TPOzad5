package com.example.zad5;

import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarDao {

    private final DataSource dataSource;

    public CarDao() {
        try {
            this.dataSource = DataSourceProvider.getDataSource();
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }

    List<Car> findAllWithQuery(String sql) {
        List<Car> resultList = new ArrayList<>();
        try(Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement()){
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String carType = resultSet.getString("carType");
                String brand = resultSet.getString("brand");
                String model = resultSet.getString("model");
                Integer productionYear = resultSet.getInt("productionYear");
                Double fuelConsumption = (double) resultSet.getInt("fuelConsumption");
                resultList.add(new Car(id, carType, brand, model, productionYear, fuelConsumption));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultList;
    }
}
