package com.seraviws.repository;

import com.seraviws.entity.EstadoServicio;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoServicioRepository extends JpaRepository<EstadoServicio,Long> {

	List<EstadoServicio> findByBorradoFalse(Sort sort);

}
