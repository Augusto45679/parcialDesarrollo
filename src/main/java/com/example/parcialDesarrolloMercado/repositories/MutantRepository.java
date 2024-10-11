package com.example.parcialDesarrolloMercado.repositories;


import com.example.parcialDesarrolloMercado.entities.Mutant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MutantRepository extends JpaRepository<Mutant, Long> {

    long countByIsMutant(boolean isMutant);
}
