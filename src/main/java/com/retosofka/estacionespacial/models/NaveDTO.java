package com.retosofka.estacionespacial.models;

import com.retosofka.estacionespacial.interfaces.Misionable;
import lombok.Data;

import java.util.ArrayList;

/**
 * Esta clase es la clase Padre de todos los tipos de Naves
 */
@Data
public abstract class NaveDTO implements Misionable {

    protected Long id;
    protected String tipoNave;
    protected String nombre;
    protected Double peso;
    protected Double empuje;
    protected Double potencia;
    protected Double velocidad;
    protected String combustible;
    protected boolean active;
    protected int cantCombustible;
    private ArrayList misiones= new ArrayList<>();

//Los constructores, getters y setters fueron generados con lombok

    /**
     * Comportamientos abstractos de la Nave
     */
    public abstract void iniciar();
    public abstract void apagar();

    /**
     *
     * Estos metodos se encargan de verificar si la nave tiene combustible y que no esté activa y si no está activa y tiene combustible puede ir al espacio
     */
    public boolean tieneCombustible(){
        boolean tieneCombustible = cantCombustible > 0;
        return tieneCombustible;
    }

    public void irAlEspacio(){
        if (tieneCombustible() && !active){
            this.active = true;
        }
    }

    /**
     *
     * Este método permite que las naves cumplan su mision respectiva adicionandolas a una lista
     */

    public void adicionarMisiones(String mision){
        this.misiones.add(mision);

    }

    /**
     *
     * Este método permite obtener el numero de misiones que tiene una nave
     */

    public int getCantidadMisionesActivas(){
        return this.misiones.size();
    }

}

