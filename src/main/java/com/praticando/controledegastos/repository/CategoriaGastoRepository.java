package com.praticando.controledegastos.repository;

import com.praticando.controledegastos.entity.CategoriaGasto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaGastoRepository extends JpaRepository<CategoriaGasto, Long> {
}
