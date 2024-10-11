package com.example.parcialDesarrolloMercado.controllers;

import com.example.parcialDesarrolloMercado.services.MutantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class MutantController {

    @Autowired
    private MutantService mutantService;

    @PostMapping(path = "/mutant")
    public ResponseEntity<?> checkMutant(@RequestBody String[] dna){
        boolean isMutant = mutantService.isMutant(dna);
        if(isMutant){
            return ResponseEntity.ok().body("True");
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }

}
