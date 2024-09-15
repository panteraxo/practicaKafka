package com.prestamo.service;

import java.util.List;

import com.prestamo.entity.DataCatalogo;

public interface DataCatalogoService {

	public List<DataCatalogo> listaPorCatalogo(int idCatalogo);
}
