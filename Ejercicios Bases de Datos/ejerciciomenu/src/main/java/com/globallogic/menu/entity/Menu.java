package com.globallogic.menu.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	
	@Column(name = "descripcion")
    private String descripcion;
	
	//@OneToMany(mappedBy = "plato")
	//List<Plato> platoList;

	public Menu(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
		//this.platoList = platoList;
	}

	public Menu() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

//	public List<Plato> getPlatoList() {
//		return platoList;
//	}
//
//	public void setPlatoList(List<Plato> platoList) {
//		this.platoList = platoList;
//	}
//	
//	public void addPlato(Plato elPlato) {
//		
//		if (platoList == null) {
//			platoList = new ArrayList<Plato>();
//		}
//		
//		platoList.add(elPlato);
//	}
}
