package com.example.parcialDesarrolloMercado.controllers;

import com.example.parcialDesarrolloMercado.services.MutantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

   //  @GetMapping(path = "/generateDNA")
    // public String[] generateDna(@RequestParam int size){
    // return mutantService.generateRandomDna(size);
    // }

}
