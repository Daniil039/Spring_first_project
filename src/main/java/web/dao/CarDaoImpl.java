package web.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Mercedes-Benz ", 2017, "C200"));
        carList.add(new Car("Bmw", 2015, "X5M"));
        carList.add(new Car("Lada",  2022, "Granta"));
        carList.add(new Car("AUDI",  2000, "A6"));
        carList.add(new Car("Volkswagen",  1993, "Passat"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= carList.size() || count < 1) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}