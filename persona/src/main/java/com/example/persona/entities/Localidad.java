package com.example.persona.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "localidad")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Localidad extends Base {
    @Column(name = "denominacion")
    private String denominacion;
}
