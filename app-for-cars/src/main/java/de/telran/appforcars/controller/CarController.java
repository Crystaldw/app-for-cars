package de.telran.appforcars.controller;

import de.telran.appforcars.service.CarService;
import de.telran.appforcars.antity.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping(value = "/car/{id}")
    public Car getCarById(@PathVariable(value = "id") Integer id) {
        Car car = carService.getById(id);
        return car;
    }

    @PostMapping(value = "/car")
    public void save(@RequestBody Car car){
        carService.save(car);
    }

    @DeleteMapping(value = "/car/{id}")
    public void deleteById(@PathVariable(value = "id") Integer id){
        carService.deleteById(id);
    }
    @PutMapping(value = "/car/{id}")
    public void updateById(@PathVariable(value = "id") Integer id, @RequestBody Car car){
        carService.update(id, car);
    }
}

