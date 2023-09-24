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
@Table(name = "rental")
@Getter
@Setter
@ToString
public class Rental {
	@Id
	@Column(name = "rentalId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rentalId;

	@Column(name = "rentalDate")
	private String rentalDate;

	@Column(name = "parkId")
	private Integer parkId;

	@Column(name = "customerId")
	private Integer customerId;

	@Column(name = "returnDate")
	private String returnDate;

	@Column(name = "staffId")
	private Integer staffId;

	@Column(name = "lastupDate")
	private String lastupDate;
}
