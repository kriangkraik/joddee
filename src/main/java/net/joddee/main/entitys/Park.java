package net.joddee.main.entitys;

import static jakarta.persistence.GenerationType.SEQUENCE;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "park")
@Getter
@Setter
public class Park {
	@Id
	@SequenceGenerator(name = "park_sequence", sequenceName = "park_sequence", allocationSize = 1)
	@GeneratedValue(strategy = SEQUENCE, generator = "park_sequence")
	private Long parkId;

	@Column(name = "parkname")
	private String parkname;

	@Column(name = "lastupDate")
	private String lastupDate;
}
