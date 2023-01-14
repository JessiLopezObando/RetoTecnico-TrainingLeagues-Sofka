package com.retosofka.estacionespacial.entities;

import javax.persistence.*;

@Entity
@Table(name = "naves")
public class NaveTripulada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "tipo_nave")
    private String tipoNave;

    @Column(nullable = false, unique = true)
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoNave() {
        return tipoNave;
    }

    public void setTipoNave(String tipoNave) {
        this.tipoNave = tipoNave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getEmpuje() {
        return empuje;
    }

    public void setEmpuje(Double empuje) {
        this.empuje = empuje;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
}
