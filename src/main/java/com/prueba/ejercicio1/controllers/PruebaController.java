package com.prueba.ejercicio1.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.prueba.ejercicio1.request.PalindromoRequest;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class PruebaController {

    @PostMapping("palindromo")
    public Map<String, Object> putIsPalindromo(@RequestBody PalindromoRequest palindromo) {
        int lengthCadena = palindromo.getPalindromo().length();
        int lengthCaracteresEspeciales = 0;
        Map<String, Object> response = new java.util.HashMap<>();

        String str = palindromo.getPalindromo().replaceAll(" ", "").toLowerCase();
        String strReverse = new StringBuilder(str).reverse().toString();

        for (char c : str.toCharArray()) {
            if (String.valueOf(c).matches("[^a-zA-Z0-9]")) {
                lengthCaracteresEspeciales++;
            }
        }


        response.put("isPalindromo", str.equals(strReverse) ? 1 : 0);
        response.put("lengthCadena", lengthCadena);
        response.put("lengthCaracteresEspeciales", lengthCaracteresEspeciales);

        return response;
    }
    
}