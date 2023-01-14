package com.retosofka.estacionespacial.models;

import com.retosofka.estacionespacial.interfaces.Misionable;

import java.io.Serializable;
import java.util.List;

public class VehiculoLanzaderaDTO extends NaveDTO implements Serializable {

    private int cantidadMinCombustible =100;

    private List<NaveDTO> tipoCarga;
    private NaveDTO cargaActiva;
    private Double pesoCarga;

    /**
     *
     * Este es el constructor para instanciar la nave y ponerle una carga
     */
    public VehiculoLanzaderaDTO(NaveDTO carga) {
        this.cargaActiva = carga;
    }

    public void lanzar(){
        this.adicionarMisiones("lanzar Vehiculo al Espacio " + cargaActiva.nombre );
    }

    /**
     * Este metodo sobreescribe el metodo tieneCombustible de la clase padre
     *
     */
    @Override
    public boolean tieneCombustible() {
        return cantCombustible > cantidadMinCombustible;
    }

    /**
     * Implementación de los metodos abstractos iniciar y apagar de la clase padre
     *
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
        if (Misionable.CANT_DE_MISIONES < getCantidadMisionesActivas()) {
            lanzar();
        }
    }
}
