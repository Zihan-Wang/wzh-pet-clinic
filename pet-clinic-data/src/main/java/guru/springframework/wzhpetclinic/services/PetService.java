package guru.springframework.wzhpetclinic.services;

import java.util.Set;

import guru.springframework.wzhpetclinic.model.Pet;

public interface PetService {
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}
