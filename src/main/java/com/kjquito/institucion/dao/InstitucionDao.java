package com.kjquito.institucion.dao;

import org.springframework.data.repository.CrudRepository;

import com.kjquito.institucion.entity.InstitucionEntity;

public interface InstitucionDao extends CrudRepository<InstitucionEntity, Long>  {

}
