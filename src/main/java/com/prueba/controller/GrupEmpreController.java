package com.prueba.controller;

import com.prueba.model.GrupEmpre;
import com.prueba.repository.GrupEmpreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GrupEmpreController {

    @Autowired
    private GrupEmpreRepository grupEmpreRepository;

    @GetMapping("/grup/{nomGrupEmpre}")

    //http://localhost:8080/api/grup/EMPRESA%20DEMOSTRACI%C3%93N
    public ResponseEntity<GrupEmpre> getGrupEmpreByNom(@PathVariable String nomGrupEmpre) {
        GrupEmpre grupEmpre = grupEmpreRepository.findByNomGrupEmpre(nomGrupEmpre);
        if (grupEmpre != null) {
            return ResponseEntity.ok(grupEmpre);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


//http://localhost:8080/api/grup/all


    @GetMapping("/grup/all")
    public ResponseEntity<List<GrupEmpre>> getAllGrupEmpres() {
        List<GrupEmpre> grupEmpres = grupEmpreRepository.findAll();
        if (!grupEmpres.isEmpty()) {
            return ResponseEntity.ok(grupEmpres);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}
