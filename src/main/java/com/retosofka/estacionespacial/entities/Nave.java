package com.retosofka.estacionespacial.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "naves")
@Data
public class Nave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_nave")
    private String tipoNave;

    @Column(unique = true)
    private String nombre;

    @Column
    private Double peso;
    @Column
    private Double empuje;
    @Column
    private Double potencia;
    @Column
    private Double velocidad;
    @Column
    private String combustible;
    @Column
    private boolean active;
    @Column
    private int cantCombustible;

    public Nave() {
    }

    public Nave(Long id, String tipoNave, String nombre, Double peso, Double empuje, Double potencia, Double velocidad, String combustible) {
        this.id = id;
        this.tipoNave = tipoNave;
        this.nombre = nombre;
        this.peso = peso;
        this.empuje = empuje;
        this.potencia = potencia;
        this.velocidad = velocidad;
        this.combustible = combustible;
    }

    public void setNave(String tipoNave, String nombre, Double peso, Double empuje, Double potencia, Double velocidad, String combustible){
        this.tipoNave = tipoNave;
        this.nombre = nombre;
        this.peso = peso;
        this.empuje = empuje;
        this.potencia = potencia;
        this.velocidad = velocidad;
        this.combustible = combustible;
    }

}
