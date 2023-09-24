package net.joddee.main.entitys;

import static jakarta.persistence.GenerationType.SEQUENCE;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "rental")
@Getter
@Setter
public class Rental {
	@Id
	@SequenceGenerator(name = "rental_sequence", sequenceName = "rental_sequence", allocationSize = 1)
	@GeneratedValue(strategy = SEQUENCE, generator = "rental_sequence")
	private Long rentalId;

	@Column(name = "rentalDate")
	private String rentalDate;

	@Column(name = "parkId")
	private Long parkId;

	@Column(name = "customerId")
	private Long customerId;

	@Column(name = "returnDate")
	private String returnDate;

	@Column(name = "staffId")
	private Long staffId;

	@Column(name = "lastupDate")
	private String lastupDate;
}
