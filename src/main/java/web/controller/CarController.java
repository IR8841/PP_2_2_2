package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceCar;




@Controller
public class CarController {
    private final ServiceCar service;

    @Autowired
    public CarController(ServiceCar service) {
        this.service = service;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam("count") int value, ModelMap model) {
    return service.getVariableCar(value, model);
    }

}
