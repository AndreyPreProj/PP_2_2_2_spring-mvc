package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.stream.Collectors;

@Controller
public class CarController {
    @Autowired
    CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String getCars(Model model) {
        model.addAttribute("cars", carService.getCars());
        return "car";
    }

    @GetMapping(value = "/cars/{count}")
    public String cars(@PathVariable Integer count, Model model) {
        model.addAttribute("cars", carService.getCars().stream().limit(count).collect(Collectors.toList()));
        return "car";
    }
}
