package com.seraviws.repository;

import com.seraviws.entity.CategoriaServicio;
import com.seraviws.entity.DetalleServicio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleServicioRepository extends JpaRepository<DetalleServicio,Long> {

	Page<DetalleServicio> findByCategoriaServicio(CategoriaServicio categoria, Pageable pageable);

	List<DetalleServicio> findTop10ByCategoriaServicio(CategoriaServicio categoria, Sort sort);

}
