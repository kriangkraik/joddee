package net.joddee.main.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.joddee.main.entitys.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}
