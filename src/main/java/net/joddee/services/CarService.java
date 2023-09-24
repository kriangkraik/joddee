package net.joddee.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.joddee.entitys.Car;
import net.joddee.repositorys.CarRepository;

@Service
public class CarService {
	private final CarRepository carRepository;
	
	@Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
	
	public Car createCar(Car car) {
        return carRepository.save(car);
    }
	
	public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(Integer id) {
        return carRepository.findById(id);
    }

    public void deleteCarById(Integer id) {
        carRepository.deleteById(id);
    }
	
}
