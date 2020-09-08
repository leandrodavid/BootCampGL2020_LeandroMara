package com.globallogic.bootcampgl.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.bootcampgl.entity.Vehiculo;
import com.globallogic.bootcampgl.service.VehiculoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class VehiculoController {

	@Autowired
	VehiculoService vehiculoService;
	
	@GetMapping(path = "/vehiculos")
	public ResponseEntity<Object> getVehiculo() {

	return new ResponseEntity<>(vehiculoService.getVehiculo(), HttpStatus.OK);
	}
	
	@PostMapping(path = "/vehiculos")
	public ResponseEntity<Object> createProduct(@RequestBody Vehiculo vehiculo) {
		vehiculoService.createVehiculo(vehiculo);
		return new ResponseEntity<>( HttpStatus.CREATED);
	}
	
	@PutMapping(path = "/vehiculos/{id}")
	public ResponseEntity<Object> updateVehiculos(@PathVariable("id") Long
			id , @RequestBody Vehiculo vehiculo) {
		vehiculoService.updateVehiculo(id, vehiculo);
		return new ResponseEntity<>("Vehiculo is updated successfully", HttpStatus.OK);
	}
	@DeleteMapping(path = "/vehiculos/{id}")
	public ResponseEntity<Object> deleteVehiculos(@PathVariable("id") Long id) {
		vehiculoService.deleteVehiculo(id);
		return new ResponseEntity<>("Vehiculo is deleted successfully", HttpStatus.OK);
	}
	
	
}
