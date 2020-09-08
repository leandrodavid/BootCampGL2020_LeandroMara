package com.globallogic.menu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "plato")
public class Plato {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
    private String nombre;
	
	@Column(name = "descripcion")
    private String descripcion;
	
	@Column(name = "precio")
	private double precio;
	
	//@ManyToOne
	//@JoinColumn(name = "pla_menu")
	//Menu menu;
	
	
	
	

	public Plato() {
	}

	public Plato(int id, String nombre, String descripcion, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "\n Plato:\n     -   nombre: " + nombre + "\n     -   descripcion: " + descripcion + "\n     -   precio: " + precio;
	}
	
//	public Menu getMenu() {
//		return menu;
//	}
//
//	public void setMenu(Menu menu) {
//		this.menu = menu;
//	}
	
	
}
