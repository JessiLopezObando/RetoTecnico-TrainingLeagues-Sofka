package com.retosofka.estacionespacial.models;

import java.io.Serializable;

public class NaveNoTripuladaDTO extends NaveDTO implements Serializable {

    /**
     * Este método permite que la nave explore
     *
     */

    public String explorar(){
        return "Explorando todo el lugar";
    }

    /**
     *
     * Este método sobrecarga el metodo anterior introduciendo un atributo
     */
    public String explorar(String lugar){
        return "Explorando " + lugar;
    }

    @Override
    public void iniciar() {
        irAlEspacio();
        this.cantCombustible--;
    }

    @Override
    public void apagar() {
        this.active = false;
    }

    @Override
    public void cumplirMision() {
        explorar();
    }
}


