package com.corporativoX.cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromoController {

    public static String esPalindromo(String palabra){

        String inverso = "";
        String resultado = "";

        for(int i = palabra.length() - 1; i>=0; i--){
            inverso += palabra.charAt(i);
        }

        if(palabra.equalsIgnoreCase(inverso)) 
        {
            resultado = "La palabra " + palabra + " es un palindromo";
        }else{
            resultado =  "La palabra " + palabra + " NO es un palindromo";
        }

    
        return resultado;
        
    }

    /**
     * Endpoint para verificar si una palabra es palindromo
     * @param palabra
     * @return Un mensaje si la palabra es palindromo o no
     */

    @GetMapping("/palindromo/{palabra}")
    public String Palindromo(@PathVariable String palabra){

        String resultado = esPalindromo(palabra);

        return resultado;
    }

}
