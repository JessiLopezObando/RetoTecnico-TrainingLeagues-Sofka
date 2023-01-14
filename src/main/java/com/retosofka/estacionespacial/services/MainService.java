package com.retosofka.estacionespacial.services;

import com.retosofka.estacionespacial.models.NaveDTO;
import com.retosofka.estacionespacial.models.NaveRoboticaDTO;
import com.retosofka.estacionespacial.models.VehiculoLanzaderaDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainService {

    /*private final NaveRepository naveRepository;

    public NaveDTO newNave(NaveDTO nave){
        return this.naveRepository.save(nave);
    }*/
    List<NaveDTO> naves = new ArrayList<>();
    public List<NaveDTO> getNaves(){

        NaveDTO naveRobotica = new NaveRoboticaDTO();
        NaveDTO lanzadora = new VehiculoLanzaderaDTO(naveRobotica);

        System.out.println(lanzadora.tieneCombustible());

        naveRobotica.getId();
        naveRobotica.setNombre("AVT");

        naves.add(naveRobotica);
        naves.add(lanzadora);
        return naves;
    }

    /*

    public Optional<NaveDTO> getNave(Long id) throws Exception{
        NaveDTO nave = this.naveRepository.findById(id).orElseThrow(
                () -> new Exception("No hay naves")
        );
        return Optional.ofNullable(nave);


    }*/
}