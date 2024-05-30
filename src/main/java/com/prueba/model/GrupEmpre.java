package com.prueba.model;

import javax.persistence.*;

@Entity
@Table(name= "GrupEmpre", schema = "dbo")

public class GrupEmpre {

    @Id
    @Column(name = "NomGrupEmpre")
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String nomGrupEmpre;

    // Getters y setters

    public String getNomGrupEmpre() {
        return nomGrupEmpre;
    }

    public void setNomGrupEmpre(String nomGrupEmpre) {
        this.nomGrupEmpre = nomGrupEmpre;
    }
}
