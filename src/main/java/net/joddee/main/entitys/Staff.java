package net.joddee.main.entitys;

import static jakarta.persistence.GenerationType.SEQUENCE;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "staff")
@Getter
@Setter
public class Staff {
	@Id
	@SequenceGenerator(name = "staff_sequence", sequenceName = "staff_sequence", allocationSize = 1)
	@GeneratedValue(strategy = SEQUENCE, generator = "staff_sequence")
	private Long staffId;

	@Column(name = "fname")
	private String fname;

	@Column(name = "lname")
	private String lname;

	@Column(name = "citizenId")
	private String citizenId;

	@Column(name = "address1")
	private String address1;

	@Column(name = "address2")
	private String address2;

	@Column(name = "phoneno")
	private String phoneno;

	@Column(name = "email")
	private String email;
}
