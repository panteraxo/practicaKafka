package com.prestamo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prestamo.entity.DataCatalogo;
import com.prestamo.repository.DataCatalogoRepository;

@Service
public class DataCatalogoServiceImpl implements DataCatalogoService{

	@Autowired
	private DataCatalogoRepository repository;
	
	@Override
	public List<DataCatalogo> listaPorCatalogo(int idCatalogo) {
		return repository.listaPorCatalogo(idCatalogo);
	}
	

}
