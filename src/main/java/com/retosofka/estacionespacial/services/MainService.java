package com.retosofka.estacionespacial.services;

import com.retosofka.estacionespacial.entities.Nave;
import com.retosofka.estacionespacial.models.*;
import com.retosofka.estacionespacial.repositories.NaveRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MainService {

    @Autowired
    private ModelMapper modelMapper;

    private final NaveRepository naveRepository;


    List<NaveDTO> naves = new ArrayList<>();

   public MainService(NaveRepository naveRepository) {
        this.naveRepository = naveRepository;
    }

    /**
     * Para crear una nueva nave utilizando un switch
     */
    public NaveDTO saveNave(NaveDTO naveDTO){

        if(naveDTO != null){
            NaveDTO naveNuevaDTO;

            switch(naveDTO.getTipoNave()){
                case "noTripulada":
                    naveNuevaDTO = new NaveNoTripuladaDTO();
                    break;
                case "tripulada":
                    naveNuevaDTO = new NaveTripuladaDTO();
                    break;
                case "robotica":
                    naveNuevaDTO = new NaveRoboticaDTO();
                    break;
                case "lanzadera":
                    NaveDTO naveRobotica = new NaveRoboticaDTO();
                    naveNuevaDTO = new VehiculoLanzaderaDTO(naveRobotica);
                    break;
                default:
                    naveNuevaDTO = new NaveTripuladaDTO();
                    break;

            }
            Nave nave = modelMapper.map(naveNuevaDTO, Nave.class);
            return modelMapper.map(nave, NaveDTO.class);
        }
        return null;
    }

    /**
     *
     * Para crear una nueva nave Nave
     */


    public Nave saveNave(Nave nave){
       return this.naveRepository.save(nave);
    }


    /**
     * Para listar todas las naves existentes
     */
    public List<Nave> getNaves(){
        return this.naveRepository.findAll();

    }

    /*public List<NaveDTO> getNaves(){
        List<Nave> listaNaves = this.naveRepository.findAll();
        return modelMapper.map(listaNaves, List.class);
    }*/

    /**
     * Para obtener una sola Nave
     */
    public Optional<Nave> getNave(Long id) throws Exception{
        Nave nave = this.naveRepository.findById(id).orElseThrow(
                () -> new Exception("La nave no existe")
        );
        return Optional.ofNullable(nave);
    }




}