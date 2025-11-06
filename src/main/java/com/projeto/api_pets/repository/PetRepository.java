package com.projeto.api_pets.repository;

import com.projeto.api_pets.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> { 
    List<Pet> findByAtivoTrue();


}
