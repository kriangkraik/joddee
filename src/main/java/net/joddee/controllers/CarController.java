package net.joddee.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.joddee.entitys.Car;

@RestController
@RequestMapping("/car")
public class CarController {
	Car car;

	@GetMapping("{carId}")
	public Car getCarbyId(String carId) {
		return car;
	}

	@PostMapping
	public String createCars(@RequestBody Car car) {
		this.car = car;
		return "Car Created Successfully";
	}

	@PutMapping
	public String updateCars(@RequestBody Car car) {
		this.car = car;
		return "Car Updated Successfully";
	}

	@DeleteMapping("{carId}")
	public String deleteCars(String carId) {
		this.car = null;
		return "Car Deleted Successfully";
	}

}
