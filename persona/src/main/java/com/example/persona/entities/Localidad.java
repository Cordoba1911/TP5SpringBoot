package com.example.persona.entities.audit;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "Localidad")
public class Localidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "denominacion")
    private String denominacion;
}
