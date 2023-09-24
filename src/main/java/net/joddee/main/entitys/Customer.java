package net.joddee.main.entitys;

import static jakarta.persistence.GenerationType.SEQUENCE;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "customer")
@Getter
@Setter
public class Customer {
	@Id
	@SequenceGenerator(name = "customer_sequence", sequenceName = "customer_sequence", allocationSize = 1)
	@GeneratedValue(strategy = SEQUENCE, generator = "customer_sequence")
	private Long customerId;

	@Column(name = "fname")
	private String fname;

	@Column(name = "lname")
	private String lname;

	@Column(name = "age")
	private Integer age;

	@Column(name = "citizenId")
	private String citizenId;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private String phone;
}
