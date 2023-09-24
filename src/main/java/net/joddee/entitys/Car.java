package net.joddee.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "car")
@Getter
@Setter
@ToString
public class Car {
	@Id
	@Column(name = "carId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer carId;

	@Column(name = "plateId")
	private String plateId;

	@Column(name = "color")
	private String color;

	@Column(name = "typeCar")
	private String typeCar;

	@Column(name = "isactive")
	private Integer isactive;

}
