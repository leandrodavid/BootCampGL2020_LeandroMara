package com.globallogic.bootcampgl.rest.service;

import java.util.Collection;


import com.globallogic.bootcampgl.rest.entity.Carrera;

public interface CarreraService {

	public abstract Collection<Carrera> getCarrera();
	public abstract void createCarrera(Carrera carrera);
	public abstract Carrera updateCarrera(Long id, Carrera carrera);
	public abstract Carrera deleteCarrera(Long id);
	
}
