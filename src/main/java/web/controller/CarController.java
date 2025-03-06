package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String carController(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        CarServiceImpl carService = new CarServiceImpl();
        List<Car> cars = carService.carService(initCarList(), count);
        model.addAttribute("cars", cars);
        return "car";
    }

    private List<Car> initCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("First", 1111, 111));
        cars.add(new Car("Second", 2222, 222));
        cars.add(new Car("Third", 3333, 333));
        cars.add(new Car("Fourth", 4444, 444));
        cars.add(new Car("Fifth", 5555, 555));
        return cars;
    }

}
