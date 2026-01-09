package com.corporativoX.cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorldRestCobtroller {

    @GetMapping("/hello")
    public String HelloWorld(){
        System.out.println("Solicitud ejecutada");
        return "Hello World";
    }

}
