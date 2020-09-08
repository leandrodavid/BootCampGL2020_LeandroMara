package com.globallogic.bootcampgl.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.bootcampgl.rest.entity.Carrera;
import com.globallogic.bootcampgl.rest.service.CarreraService;

@RestController
public class CarreraController {
	
	@Autowired
	CarreraService carreraService;
	
	@GetMapping(path = "/carreras")
	public ResponseEntity<Object> getCarrera() {

	return new ResponseEntity<>(carreraService.getCarrera(), HttpStatus.OK);
	}
	
	@PostMapping(path = "/carreras")
	public ResponseEntity<Object> createCarrera(@RequestBody Carrera carrera) {
		carreraService.createCarrera(carrera);
		return new ResponseEntity<>( HttpStatus.CREATED);
	}

}
