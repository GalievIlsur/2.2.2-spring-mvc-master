package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> allCarsPage();
    public List<Car> showSomeCars(int number);
}
