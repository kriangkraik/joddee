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
@Table(name = "park")
@Getter
@Setter
@ToString
public class Park {
	@Id
	@Column(name = "parkId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  parkId;
	
	@Column(name = "parkname")
	private String parkname;
	
	@Column(name = "lastupDate")
	private String lastupDate;
}
