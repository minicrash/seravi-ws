package com.seraviws.service;

import com.seraviws.dto.CategoriaServicioDTO;
import com.seraviws.dto.DetalleServicioDTO;
import com.seraviws.mapper.CategoriaServicioMapper;
import com.seraviws.mapper.DetalleServicioMapper;
import com.seraviws.repository.DetalleServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DetalleServicioService implements ServiceBase<DetalleServicioDTO> {

	@Autowired
	private DetalleServicioRepository detalleServicioRepository;

	@Override
	public List<DetalleServicioDTO> findAll () throws Exception {
		return DetalleServicioMapper.mapToDetalleServicioListaxeDTO(
				detalleServicioRepository.findAll(Sort.by(Sort.Direction.ASC, "titulo")));
	}

	public Page<DetalleServicioDTO> findByCategoriaServicio(CategoriaServicioDTO categoria, Pageable pageable) throws Exception {
		return new PageImpl<>(detalleServicioRepository.findByCategoriaServicio(
				CategoriaServicioMapper.mapFromCategoriaServicioDTO(categoria),
				pageable)
				.stream()
				.map(DetalleServicioDTO::entityToDTO)
				.collect(Collectors.toList()));
	}

	public List<DetalleServicioDTO> findTop10ByCategoriaServicio(CategoriaServicioDTO categoria) throws Exception {
		return DetalleServicioMapper.mapToDetalleServicioListaxeDTO(
				detalleServicioRepository.findTop10ByCategoriaServicio(
						CategoriaServicioMapper.mapFromCategoriaServicioDTO(categoria),
						Sort.by(Sort.Direction.ASC, "titulo")));
	}

	public DetalleServicioDTO findById (Long id) throws Exception {
		return DetalleServicioMapper.mapToDetalleServicioDTO(
				detalleServicioRepository.findById(id).orElse(null));
	}

}
