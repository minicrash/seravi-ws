package com.seraviws.repository;

import com.seraviws.entity.CategoriaServicio;
import com.seraviws.entity.TipoEspecie;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaServicioRepository extends JpaRepository<CategoriaServicio,Long> {

	List<CategoriaServicio> findByBorradoFalse(Sort sort);

}
