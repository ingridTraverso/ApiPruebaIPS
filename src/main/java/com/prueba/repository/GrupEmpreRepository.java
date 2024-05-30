package com.prueba.repository;

import com.prueba.model.GrupEmpre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupEmpreRepository extends JpaRepository<GrupEmpre, Long> {

    GrupEmpre findByNomGrupEmpre(String nomGrupEmpre);
}
