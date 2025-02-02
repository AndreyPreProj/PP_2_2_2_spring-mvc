package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.stream.Collectors;

@Controller
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(name = "count", required = false, defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carService.getCars().stream().limit(count).collect(Collectors.toList()));
        return "car";
    }

}
