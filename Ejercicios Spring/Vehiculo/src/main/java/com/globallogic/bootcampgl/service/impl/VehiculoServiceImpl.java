package com.globallogic.bootcampgl.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.globallogic.bootcampgl.entity.Vehiculo;
import com.globallogic.bootcampgl.repository.VehiculosRepository;
import com.globallogic.bootcampgl.service.VehiculoService;


@Service
public class VehiculoServiceImpl implements VehiculoService{
	
	@Autowired
	VehiculosRepository vehiculoRepository;
	
	@Override
	public Collection<Vehiculo> getVehiculo() {
		
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();  
		vehiculoRepository.findAll().forEach(vehiculo -> vehiculos.add(vehiculo));  
		return vehiculos;
	}

	@Override
	public void createVehiculo(Vehiculo vehiculo) {
		
		 vehiculoRepository.save(vehiculo);
	}

	@Override
	public Vehiculo updateVehiculo(Long id, Vehiculo vehiculo) {
//		Vehiculo vehiculo = vehiculoRepository.findById(id).get();

		vehiculoRepository.save(vehiculo);
		return vehiculo;
	}

	@Override
	public Vehiculo deleteVehiculo(Long id) {
		Vehiculo vehiculo = vehiculoRepository.findById(id).get();
		vehiculoRepository.delete(vehiculo);
		return vehiculo;
		
	}

	
	
}
