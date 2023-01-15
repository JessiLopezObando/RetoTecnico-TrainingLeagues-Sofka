package com.retosofka.estacionespacial.controllers;

import com.retosofka.estacionespacial.entities.Nave;
import com.retosofka.estacionespacial.repositories.NaveRepository;
import com.retosofka.estacionespacial.services.MainService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inventario")
public class MainController {

    private final MainService mainService;
    private final NaveRepository naveRepository;

    public MainController(MainService mainService, NaveRepository naveRepository) {
        this.mainService = mainService;
        this.naveRepository = naveRepository;
    }

    /**
     *
     * Para obtener todas las Naves
     */
    @GetMapping("")
    public List<Nave> getNaves(){
        return this.mainService.getNaves();
    }
    /**
     *
     * Para crear una Nave
     */
    @PostMapping("/nueva")
    public RedirectView saveNave(@ModelAttribute Nave nave, Model model) throws Exception {
        model.addAttribute(nave);
        this.mainService.saveNave(nave);
        return new RedirectView("");
    }

    /**
     *
     * Para obtener solo una nave
     */
    @GetMapping("/{id}")
    public Optional<Nave> getNave(@PathVariable Long id) throws Exception{
        return this.mainService.getNave(id);
    }




}
