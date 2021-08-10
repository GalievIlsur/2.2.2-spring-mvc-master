package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> allCarsPage();
    public List<Car> showSomeCars(int number);
}
