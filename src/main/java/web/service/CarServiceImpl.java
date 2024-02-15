package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    List<Car> garage = new ArrayList<>();

    @Override
    public List<Car> getCars() {
        return null;
    }

    @Override
    public List<Car> getCarsByCount(Integer count) {
        return null;
    }

}
