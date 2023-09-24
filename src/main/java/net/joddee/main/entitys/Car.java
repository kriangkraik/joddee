package net.joddee.main.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "car")
@Getter
@Setter
public class Car {
	@Id
	@SequenceGenerator(name = "car_sequence", sequenceName = "car_sequence", allocationSize = 1)
	@GeneratedValue(strategy = SEQUENCE, generator = "car_sequence")
	private Long carId;

	@Column(name = "plateId")
	private String plateId;

	@Column(name = "color")
	private String color;

	@Column(name = "typeCar")
	private String typeCar;

	@Column(name = "isactive")
	private Integer isactive;

	@Column(name = "plateprovince")
	private String plateprovince;

}
