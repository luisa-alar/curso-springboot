package com.corporativoX.cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GretingRestController {

    @GetMapping("/saludo/{name}")
    public String Greating(@PathVariable String name){
        return "Hola " + name;
    }
}
