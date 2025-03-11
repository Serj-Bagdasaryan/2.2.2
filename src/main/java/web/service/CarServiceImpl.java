package web.service;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static List<Car> cars;

    public List<Car> carService(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }

    @PostConstruct
    private void initCarList() {
        cars = new ArrayList<>();
        cars.add(new Car("First", 1111, 111));
        cars.add(new Car("Second", 2222, 222));
        cars.add(new Car("Third", 3333, 333));
        cars.add(new Car("Fourth", 4444, 444));
        cars.add(new Car("Fifth", 5555, 555));
    }
}
