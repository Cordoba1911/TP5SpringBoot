package com.example.persona.entities;

import com.example.persona.entities.audit.Base;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Localidad")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Audited
public class Localidad extends Base {

    @Column(name = "denominacion")
    private String denominacion;
}
