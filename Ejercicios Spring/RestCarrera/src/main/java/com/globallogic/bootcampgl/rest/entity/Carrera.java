package com.globallogic.bootcampgl.rest.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="carrera")
public class Carrera {

	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "competidor")
	private List<Competidor> Competidores;
	
	
}
