package com.globallogic.bootcampgl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.bootcampgl.entity.Vehiculo;



@Repository
public interface VehiculosRepository extends JpaRepository<Vehiculo, Long> {

}
