package com.seraviws.service;

import com.seraviws.entity.TipoEspecie;
import com.seraviws.repository.TipoEspecieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoEspecieService implements ServiceBase<TipoEspecie> {

	@Autowired
	private TipoEspecieRepository tipoEspecieRepository;

	@Override
	public List<TipoEspecie> findAll () throws Exception {
		return tipoEspecieRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}

	public List<TipoEspecie> findByBorradoFalse() throws Exception {
		return tipoEspecieRepository.findByBorradoFalse(Sort.by(Sort.Direction.ASC, "nome"));
	}

}
