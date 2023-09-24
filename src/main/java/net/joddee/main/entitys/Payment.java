package net.joddee.main.entitys;

import static jakarta.persistence.GenerationType.SEQUENCE;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "payment")
@Getter
@Setter
public class Payment {
	@Id
	@SequenceGenerator(name = "payment_sequence", sequenceName = "payment_sequence", allocationSize = 1)
	@GeneratedValue(strategy = SEQUENCE, generator = "payment_sequence")
	private Long paymentId;

	@Column(name = "customerId")
	private Long customerId;

	@Column(name = "staffId")
	private Long staffId;

	@Column(name = "rentalId")
	private String rentalId;

	@Column(name = "paymentDate")
	private String paymentDate;

	@Column(name = "lastupDate")
	private String lastupDate;

	@Column(name = "amount")
	private double amount;
}
