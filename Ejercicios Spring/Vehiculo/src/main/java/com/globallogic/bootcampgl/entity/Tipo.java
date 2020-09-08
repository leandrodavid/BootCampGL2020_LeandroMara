package com.globallogic.bootcampgl.entity;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tipos")
public class Tipo {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long codigo;
	
	@Column(name = "categoria")
	private String categoria;
	
	@Column(name = "puertas")
	private Integer puertas;
	
//	@OneToOne(mappedBy="tipo")
//	private Vehiculo vehiculo;
	
	
}
