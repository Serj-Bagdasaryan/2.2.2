package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    public List<Car> carService(List<Car> cars, int count) {
        return cars.subList(0, count);
    }
}
