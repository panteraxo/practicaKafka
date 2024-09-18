package com.prestamo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prestamo.entity.Pais;
import com.prestamo.kafka.service.PaisEventsService;
import com.prestamo.repository.PaisRepository;

@Service
public class PaisServiceImpl implements PaisService {

	@Autowired
	private PaisRepository paisRepository;
	
	private final PaisEventsService paisEventsService;
	
	public PaisServiceImpl(PaisEventsService paisEventsService) {
		super();
		this.paisEventsService = paisEventsService;
	}
	
	@Override
	public List<Pais> findAll() {
		return paisRepository.findAll();
	}

	@Override
	public Pais insertaPais(Pais pais) {
		this.paisEventsService.publish(pais);
		return paisRepository.save(pais);
	}

}
