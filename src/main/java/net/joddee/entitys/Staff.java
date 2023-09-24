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
@Table(name = "staff")
@Getter
@Setter
@ToString
public class Staff {
	@Id
	@Column(name = "staffId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
