package com.prestamo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prestamo.entity.DataCatalogo;
import com.prestamo.service.DataCatalogoService;

@RestController
@RequestMapping("/url/dataCatalogo")
public class DataCatalogoController {

	@Autowired
	private DataCatalogoService service;
	
    @GetMapping("/listar/{id}")
	public List<DataCatalogo> listar(@PathVariable("id") int idCatalogo) {
		return service.listaPorCatalogo(idCatalogo);
	}
	

}
