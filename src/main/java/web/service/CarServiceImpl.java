package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import web.model.Car;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    @PostConstruct
    private void initCarList() {
        cars = new ArrayList<Car>();
        cars.add(new Car("First", 1111, 111));
        cars.add(new Car("Second", 2222, 222));
        cars.add(new Car("Third", 3333, 333));
        cars.add(new Car("Fourth", 4444, 444));
        cars.add(new Car("Fifth", 5555, 555));
    }

    public List<Car> getCars(int count) {
        return cars.subList(0, count);
    }
}
