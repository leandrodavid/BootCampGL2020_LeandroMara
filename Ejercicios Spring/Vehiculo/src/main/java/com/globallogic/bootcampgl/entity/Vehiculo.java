package com.globallogic.bootcampgl.entity;

import java.util.Date;

import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "vehiculo")
public class Vehiculo {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long codigo;
	
	@Column(name = "identificacion")
	private String identificacion;
	
	@OneToOne( cascade = CascadeType.ALL)
	@JoinColumn(name = "vehiculo_tipo")
	private Tipo tipo;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "vehiculo_modelo")
	private Modelo modelo;
	
  //private Date fechaProduccion;
	
	
	
	
}
