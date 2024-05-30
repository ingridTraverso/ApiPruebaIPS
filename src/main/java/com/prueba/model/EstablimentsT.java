package com.prueba.model;

import javax.persistence.*;

@Entity
@Table(name= "EstablimentsT", schema = "dbo")
public class EstablimentsT {

    @Id
    @Column(name = "CodiEstab")
    private String codiEstab;

    @Column(name = "NomEstab")
    private String nomEstab;

    // Getters y setters
    public String getCodiEstab() {
        return codiEstab;
    }

    public void setCodiEstab(String codiEstab) {
        this.codiEstab = codiEstab;
    }

    public String getNomEstab() {
        return nomEstab;
    }

    public void setNomEstab(String nomEstab) {
        this.nomEstab = nomEstab;
    }
}
