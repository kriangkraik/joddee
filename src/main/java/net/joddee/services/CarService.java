package net.joddee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.joddee.repositorys.CarRepository;

@Service
public class CarService {
	private final CarRepository carRepository;
	
	@Autowired
	public CarService(CarRepository carRepository) {
		this.carRepository = carRepository;
	}
}
