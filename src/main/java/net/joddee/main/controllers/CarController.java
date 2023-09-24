package net.joddee.main.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.joddee.main.entitys.Car;
import net.joddee.main.repositorys.CarRepository;

@RestController
@RequestMapping("/cars")
public class CarController {
	private final CarRepository carRepository;

	public CarController(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	@GetMapping
	public List<Car> getAllCars() {
		return carRepository.findAll();
	}

	@PostMapping
	public Car createCar(@RequestBody Car car) {
		return carRepository.save(car);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Car> getCarById(@PathVariable int id) {
		Optional<Car> car = carRepository.findById(id);
		return car.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("/{id}")
	public ResponseEntity<Car> updateCar(@PathVariable int id, @RequestBody Car updatedCar) {
		Optional<Car> existingCar = carRepository.findById(id);

		if (existingCar.isPresent()) {
			Car car = existingCar.get();
			car.setCarId(updatedCar.getCarId());
			car.setColor(updatedCar.getColor());
			car.setIsactive(updatedCar.getIsactive());
			car.setPlateId(updatedCar.getPlateId());
			car.setPlateprovince(updatedCar.getPlateprovince());
			car.setTypeCar(updatedCar.getTypeCar());
			carRepository.save(car);
			return ResponseEntity.ok(car);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCar(@PathVariable int id) {
		if (carRepository.existsById(id)) {
			carRepository.deleteById(id);
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
