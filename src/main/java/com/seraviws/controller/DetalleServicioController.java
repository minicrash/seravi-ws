package com.seraviws.controller;

import com.seraviws.dto.CategoriaDetallePrincipalServicioDTO;
import com.seraviws.dto.CategoriaDetalleServicioDTO;
import com.seraviws.dto.CategoriaServicioDTO;
import com.seraviws.dto.DetalleServicioDTO;
import com.seraviws.service.CategoriaServicioService;
import com.seraviws.service.DetalleServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/servicio/detalleservicio")
public class DetalleServicioController {

	@Autowired
	private CategoriaServicioService categoriaServicioService;

	@Autowired
	private DetalleServicioService detalleServicioService;

	@GetMapping("/getListaPrincipal")
	@ResponseStatus(HttpStatus.OK)
	public List<CategoriaDetallePrincipalServicioDTO> getListaPrincipal() {

		List<CategoriaDetallePrincipalServicioDTO> categoriaDetalles = new ArrayList<>();

		try{
			List<CategoriaServicioDTO> categorias = categoriaServicioService.findByBorradoFalse();
			for(CategoriaServicioDTO categoria : categorias) {
				List<DetalleServicioDTO> detalleServicios = detalleServicioService.findTop10ByCategoriaServicio(categoria);
				CategoriaDetallePrincipalServicioDTO listaPrincipal = CategoriaDetallePrincipalServicioDTO.builder()
						.codigo(categoria.getCodigo())
						.nome(categoria.getNome())
						.servicios(detalleServicios).build();
				categoriaDetalles.add(listaPrincipal);
			}
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		return categoriaDetalles;
	}

	@GetMapping("/getListaCategoria/{id}")
	@ResponseStatus(HttpStatus.OK)
	public CategoriaDetalleServicioDTO getDetallesCategoriaServicio(
			@PathVariable Long id,
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "5") int size) {

		CategoriaDetalleServicioDTO categoriaDetalleServicio = null;

		try{
			CategoriaServicioDTO categoria = categoriaServicioService.findById(id);
			if(categoria == null) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND);
			}
			Page<DetalleServicioDTO> detallesServicioCategoria = detalleServicioService.findByCategoriaServicio(
					categoria,
					PageRequest.of(page, size, Sort.by(Sort.Direction.ASC, "titulo")));
			categoriaDetalleServicio = CategoriaDetalleServicioDTO.builder()
					.codigo(categoria.getCodigo())
					.nome(categoria.getNome())
					.servicios(detallesServicioCategoria)
					.build();
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		return categoriaDetalleServicio;
	}

	@GetMapping("/get/{id}")
	@ResponseStatus(HttpStatus.OK)
	public DetalleServicioDTO getDetalleServicio(@PathVariable Long id) {

		DetalleServicioDTO detalleServicio = null;

		try{
			detalleServicio = detalleServicioService.findById(id);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		return detalleServicio;
	}

}
