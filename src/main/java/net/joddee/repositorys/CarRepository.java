package net.joddee.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.joddee.entitys.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
	
}
