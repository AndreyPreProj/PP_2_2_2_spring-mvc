package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    static List<Car> garage;

    static {
        garage = new ArrayList<>();
        garage.add(new Car("Black", "China", 2012));
        garage.add(new Car("White", "USA", 2020));
        garage.add(new Car("Yellow", "Italy", 1985));
        garage.add(new Car("Brown", "Spain", 1983));
        garage.add(new Car("Blue", "Russia", 1973));
    }

    @Override
    public List<Car> getCars() {
        return garage;
    }

    @Override
    public List<Car> getCarsByCount(Integer count) {
        return null;
    }

}
