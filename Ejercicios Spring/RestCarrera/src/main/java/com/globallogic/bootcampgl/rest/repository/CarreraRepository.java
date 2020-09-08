package com.globallogic.bootcampgl.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.bootcampgl.rest.entity.Carrera;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long>{

}
