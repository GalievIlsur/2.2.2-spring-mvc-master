package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {
    private List<Car> cars;
    private List<Car> showSomeCars;

    {
        showSomeCars = new ArrayList<>();
        cars = new ArrayList<>();

        cars.add(new Car("model1", 1, 2001));
        cars.add(new Car("model2", 2, 2002));
        cars.add(new Car("model3", 3, 2003));
        cars.add(new Car("model4", 4, 2004));
        cars.add(new Car("model5", 5, 2005));
    }

    public List<Car> allCarsPage() {
        return cars;
    }

    public List<Car> showSomeCars(int number) {
        showSomeCars.clear();
        for(int i = 0; i < number; i++) {
            showSomeCars.add(cars.get(i));
        }
        return showSomeCars;
    }
}
