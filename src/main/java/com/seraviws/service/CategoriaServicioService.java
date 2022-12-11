package com.seraviws.service;

import com.seraviws.dto.CategoriaServicioDTO;
import com.seraviws.entity.CategoriaServicio;
import com.seraviws.mapper.CategoriaServicioMapper;
import com.seraviws.repository.CategoriaServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServicioService implements ServiceBase<CategoriaServicioDTO> {

	@Autowired
	private CategoriaServicioRepository categoriaServicioRepository;

	@Override
	public List<CategoriaServicioDTO> findAll () throws Exception {
		return CategoriaServicioMapper.mapToCategoriaServicioListaxeDTO(
				categoriaServicioRepository.findAll(Sort.by(Sort.Direction.ASC, "nome")));
	}

	public List<CategoriaServicioDTO> findByBorradoFalse () throws Exception {
		return CategoriaServicioMapper.mapToCategoriaServicioListaxeDTO(
				categoriaServicioRepository.findByBorradoFalse(Sort.by(Sort.Direction.ASC, "nome")));
	}

	public CategoriaServicioDTO findById (Long id) throws Exception {
		return CategoriaServicioMapper.mapToCategoriaServicioDTO(
				categoriaServicioRepository.findById(id).orElse(null));
	}

}
