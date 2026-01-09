package com.corporativoX.cursoSpringBoot.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepositsController {


    public String processDeposits(int[] deposits){

        int total= 0;
        int count= 0;
        String mensaje = "";

        for(int i =0; i< deposits.length; i++ ){

            if(deposits[i]<0) continue;

            total += deposits[i];

            if(deposits[i] >1000) count++;
        }

        mensaje = "El total es " + total + " y el count es: " + count;

        return mensaje;

    }

    @GetMapping("/deposits")
    public String Deposits(){

        int[] deposits = {500, 1200, -200, 3000, 800};

        String mensaje = processDeposits(deposits);

        return mensaje;
    }
    

}
