package com.globallogic.bootcampgl.entity;

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
@Table(name = "modelo")
public class Modelo {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long codigo;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "nombre")
	private String nombre;
	
//	@OneToOne(mappedBy="vehiculo")
//	private Vehiculo vehiculo;
	
}
