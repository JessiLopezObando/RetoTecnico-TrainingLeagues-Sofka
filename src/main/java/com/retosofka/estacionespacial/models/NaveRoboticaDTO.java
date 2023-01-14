package com.retosofka.estacionespacial.models;

import java.io.Serializable;

public class NaveRoboticaDTO extends NaveNoTripuladaDTO implements Serializable {

    @Override
    public void adicionarMisiones(String mision) {
        super.adicionarMisiones("Abastecer y limpiar  la EEI");
    }

    public String mantener(){
        return "Regular periódicamente la elevación de la EEI";
    }
}


