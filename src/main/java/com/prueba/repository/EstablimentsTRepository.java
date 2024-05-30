package com.prueba.repository;

import com.prueba.model.EstablimentsT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstablimentsTRepository extends JpaRepository<EstablimentsT, String> {
    EstablimentsT findByCodiEstab(String codiEstab);
}
