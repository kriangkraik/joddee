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
@Table(name = "payment")
@Getter
@Setter
@ToString
public class Payment {
	@Id
	@Column(name = "paymentId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
