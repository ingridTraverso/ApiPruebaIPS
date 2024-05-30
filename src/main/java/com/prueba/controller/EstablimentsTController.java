package com.prueba.controller;

import com.prueba.model.EstablimentsT;
import com.prueba.repository.EstablimentsTRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EstablimentsTController {

    @Autowired
    private EstablimentsTRepository establimentsTRepository;

    @GetMapping("/establecimiento/{codiEstab}")
    public ResponseEntity<EstablimentsT> getEstablecimientoByCodigo(@PathVariable String codiEstab) {
        EstablimentsT establimentsT = establimentsTRepository.findByCodiEstab(codiEstab);
        if (establimentsT != null) {
            return ResponseEntity.ok(establimentsT);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/establecimientos")
    public ResponseEntity<List<EstablimentsT>> getAllEstablecimientos() {
        List<EstablimentsT> establecimientos = establimentsTRepository.findAll();
        if (!establecimientos.isEmpty()) {
            return ResponseEntity.ok(establecimientos);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}
