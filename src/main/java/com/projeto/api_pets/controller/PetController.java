package com.projeto.api_pets.controller;

import com.projeto.api_pets.repository.model.Pet;
import com.projeto.api_pets.repository.PetRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pets")

public class PetController {

    private final PetRepository petRepository;
    
    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @GetMapping

    public List<Pet> listarTodos() {
        return petRepository.findByAtivoTrue();
    }

    @GetMapping("/{id}")

    public ResponseEntity<Pet> obterPorId(@PathVariable Long id) {
        Optional<Pet> pet = petRepository.findById(id);
        if (pet.isPresent() && Boolean.TRUE.equals(pet.get().getAtivo())) {
            return ResponseEntity.ok(pet.get());
        } else {
            return ResponseEntity.notFound().build();
        }

        @PostMapping
        public ResponseEntity<Pet> criarPet(@RequestBody Pet pet) {
            pet novoPet = petRepository.save(pet);
            return new ResponseEntity<>(novoPet, HttpStatus.CREATED);
        }

        @PutMapping("/{id}")
        public ResponseEntity<Pet> atualizarPet(@PathVariable Long id, @RequestBody Pet petDetalhes) {
            Optional<Pet> petExistente = petRepository.findById(id);
            if (petExistente.isPresent()){
                Pet pet = petExistente.get();
                pet.setNome(petAtualizado.getNome());
                pet.setEspecie(petAtualizado.getEspecie());
                pet.setRaca(petAtualizado.getRaca());
                pet.setIdade(petAtualizado.getIdade());
                Pet.setTutor(petAtualizado.getTutor());
                Pet salvo = petRepository.save(pet);
                return ResponseEntity.ok(salvo);
            } else {
                return ResponseEntity.notFound().build();
            }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deletarPet(@PathVariable Long id) {
            Optional<Pet> pet = petRepository.findById(id);
            if (pet.isPresent()) {
                Pet existente = pet.get();
                existente.setAtivo(false);
                petRepository.save(existente);
                return ResponseEntity.noContent().build();
            } else {
                return ResponseEntity.notFound().build();
            }
   
        }

    }
