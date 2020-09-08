package com.globallogic.bootcampgl.rest.serviceimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.bootcampgl.rest.entity.Carrera;
import com.globallogic.bootcampgl.rest.repository.CarreraRepository;
import com.globallogic.bootcampgl.rest.service.CarreraService;

@Service
public class CarreraServiceImpl implements CarreraService {
	
	@Autowired
	CarreraRepository carreraRepository;

	public Collection<Carrera> getCarrera() {
		
		List<Carrera> carreras = new ArrayList<Carrera>();  
		carreraRepository.findAll().forEach(carrera -> carreras.add(carrera));  
		return carreras;
	}

	public void createCarrera(Carrera carrera) {
		
		carreraRepository.save(carrera);

	}

	public Carrera updateCarrera(Long id, Carrera carrera) {
		
		return null;
	}

	public Carrera deleteCarrera(Long id) {
	
		return null;
	}

}
