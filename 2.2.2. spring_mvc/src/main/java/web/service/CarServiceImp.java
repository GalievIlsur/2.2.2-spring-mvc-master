package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    final CarDaoImp carDaoImp;

    @Autowired
    public CarServiceImp(CarDaoImp carDaoImp) {
        this.carDaoImp = carDaoImp;
    }

    public List<Car> allCarsPage() {
        return carDaoImp.allCarsPage();
    }

    public List<Car> showSomeCars(int number) {
        return carDaoImp.showSomeCars(number);
    }

}
