package com.seraviws.service;

import com.seraviws.entity.EstadoServicio;
import com.seraviws.entity.TipoEspecie;
import com.seraviws.repository.EstadoServicioRepository;
import com.seraviws.repository.TipoEspecieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoServicioService implements ServiceBase<EstadoServicio> {

	@Autowired
	private EstadoServicioRepository estadoServicioRepository;

	@Override
	public List<EstadoServicio> findAll () throws Exception {
		return estadoServicioRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}

	public List<EstadoServicio> findByBorradoFalse() throws Exception {
		return estadoServicioRepository.findByBorradoFalse(Sort.by(Sort.Direction.ASC, "nome"));
	}

}
