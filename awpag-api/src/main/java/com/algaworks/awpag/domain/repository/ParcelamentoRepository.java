package com.algaworks.awpag.domain.repository;

import com.algaworks.awpag.domain.model.Parcelamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcelamentoRepository extends JpaRepository<Parcelamento, Long> {
}
