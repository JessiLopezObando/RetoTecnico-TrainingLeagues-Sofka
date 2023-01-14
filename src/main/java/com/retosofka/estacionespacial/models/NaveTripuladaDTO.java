package com.retosofka.estacionespacial.models;

import java.io.Serializable;

public class NaveTripuladaDTO extends NaveDTO implements Serializable {

    private Double minOrbita = 400.0;
    private Double orbita;
    private int maxCapacidadPersonas = 3;
    private int cantidadPersonas;

    /**
     *
     * Los siguientes dos métodos son comportamientos de la nave
     */

    public String investigar(){
        return "Experimentación y estudio del comportamiento humano en condiciones ingrávidas y en el exterior de la cápsula";

    }

    public String probar(){
        return "probar acoplamientos con otras naves y equipos electrónicos";
    }

    /**
     * Los siguientes dos métodos son la implementación de métodos abstractos de la clase padre
     */

    @Override
    public void iniciar() {
        irAlEspacio();
    }

    @Override
    public void apagar() {
        this.active = false;
    }

    /**
     * Implementación de la Interface Misionable
     */

    @Override
    public void cumplirMision() {
       if (orbita > minOrbita &&  cantidadPersonas <= maxCapacidadPersonas) {
           investigar();
       } else if ((orbita <= minOrbita &&  cantidadPersonas <= maxCapacidadPersonas)) {
           probar();
       }

    }
}
