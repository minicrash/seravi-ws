package com.seraviws.controller;

import com.seraviws.dto.CategoriaServicioDTO;
import com.seraviws.service.CategoriaServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/servicio/categoriaservicio")
public class CategoriaServicioController {

	@Autowired
	private CategoriaServicioService categoriaServicioService;

	@GetMapping("/getAll")
	@ResponseStatus(HttpStatus.OK)
	public List<CategoriaServicioDTO> getAll() throws Exception {

		return categoriaServicioService.findAll();

	}

	@GetMapping("/getActive")
	@ResponseStatus(HttpStatus.OK)
	public List<CategoriaServicioDTO> getActive() throws Exception {

		return categoriaServicioService.findByBorradoFalse();

	}

}
