package com.globallogic.bootcampgl.service;

import java.util.Collection;

import com.globallogic.bootcampgl.entity.Vehiculo;



public interface VehiculoService {

	public abstract Collection<Vehiculo> getVehiculo();
	public abstract void createVehiculo(Vehiculo vehiculo);
	public abstract Vehiculo updateVehiculo(Long id, Vehiculo vehiculo);
	public abstract Vehiculo deleteVehiculo(Long id);
}