package com.retosofka.estacionespacial.controllers;

import com.retosofka.estacionespacial.models.NaveDTO;
import com.retosofka.estacionespacial.services.MainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inventario")
public class MainController {

    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    /**
     *
     * Para obtener todas las Naves
     */
    @GetMapping("")
    public List<NaveDTO> getNaves(){
        return this.mainService.getNaves();

    }

    /**
     *
     * Para obtener solo una nave
     */
    /*@GetMapping("/{id}")
    public Optional<NaveDTO> getNave(@PathVariable Long id) throws Exception{
        return this.mainService.getNave(id);
    }*/


}
