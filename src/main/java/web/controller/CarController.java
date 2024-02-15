package web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import web.model.Car;

import java.util.List;

@RestController
public class CarController {

    @GetMapping(value = "/cars")
    public List<Car> getCars() {
        return null;
    }

    @GetMapping(value = "/cars{count}")
    public List<Car> cars(@PathVariable Integer count) {
        return null;
    }
}
