package com.kjquito.institucion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import com.kjquito.institucion.dao.InstitucionDao;
import com.kjquito.institucion.entity.InstitucionEntity;

@Service
public class InstitucionServiceImplement implements InstitucionService {

	@Autowired
	private InstitucionDao institucionDao;

	@Override
	@Transactional(readOnly = true)
	public List<InstitucionEntity> findAll() {
		return (List<InstitucionEntity>) institucionDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public InstitucionEntity findById(Long id) {
		return institucionDao.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
				String.format("ID de institucion invalido %s", id)));
	}

	@Override
	public InstitucionEntity save(InstitucionEntity institucion) {
		return institucionDao.save(institucion);
	}

	@Override
	public void deleteById(Long id) {
		institucionDao.deleteById(id);
	}
}
