package com.kjquito.institucion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.kjquito.institucion.entity.InstitucionEntity;
import com.kjquito.institucion.services.InstitucionService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,RequestMethod.PUT})
//@RequestMapping("/sisexample/api/v1")
public class InstitucionController {
	
	@Autowired
	private InstitucionService institucionService;
	
	@CrossOrigin
	@GetMapping("/institucion")
	@ResponseStatus(HttpStatus.OK)
	public List<InstitucionEntity> getAll() {
		return institucionService.findAll();
	}
	
	@GetMapping("/institucion/{id}")
	@ResponseStatus(HttpStatus.OK)
	public InstitucionEntity getById(@PathVariable Long id) {
		return institucionService.findById(id);
	}

	@PostMapping("/institucion")
	@ResponseStatus(HttpStatus.CREATED)
	public InstitucionEntity save(@RequestBody InstitucionEntity institucion) {
		return institucionService.save(institucion);
	}

	@PutMapping("/institucion/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public InstitucionEntity updateById(@RequestBody InstitucionEntity institucion, @PathVariable Long id) {
		InstitucionEntity institucionDB = institucionService.findById(id);
		institucionDB.setNombreInstitucion(institucion.getNombreInstitucion());
		institucionDB.setRif(institucion.getRif());
		institucionDB.setDireccion(institucion.getDireccion());
		institucionDB.setTelefono(institucion.getTelefono());
		institucionDB.setContactoOrganizacion(institucion.getContactoOrganizacion());
		institucionDB.setTelefonoContacto(institucion.getTelefonoContacto());
		institucionDB.setCargoContacto(institucion.getCargoContacto());
		return institucionService.save(institucionDB);
	}

	@DeleteMapping("/institucion/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteById(@PathVariable Long id) {
		institucionService.deleteById(id);
	}

}
