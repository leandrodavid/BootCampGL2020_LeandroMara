package com.globallogic.bootcampgl.rest.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="competidor")
public class Competidor {

	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long numero;
	
	@Column(name = "nombre")
	private String nombre;
	
	
}
