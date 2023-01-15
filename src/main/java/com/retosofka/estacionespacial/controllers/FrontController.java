package com.retosofka.estacionespacial.controllers;

import com.retosofka.estacionespacial.services.MainService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class FrontController {

    MainService mainService;
    @GetMapping("/")
    public String index(Model model){
        return "index";
    }

}
