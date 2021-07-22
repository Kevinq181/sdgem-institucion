package com.kjquito.institucion.services;

import java.util.List;

import com.kjquito.institucion.entity.InstitucionEntity;


public interface InstitucionService {
	
	public List<InstitucionEntity> findAll();

	public InstitucionEntity findById(Long id);

	public InstitucionEntity save(InstitucionEntity institucion);

	public void deleteById(Long id);

}
