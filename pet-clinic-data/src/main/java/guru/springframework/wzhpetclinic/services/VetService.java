package guru.springframework.wzhpetclinic.services;

import java.util.Set;

import guru.springframework.wzhpetclinic.model.Vet;

public interface VetService {
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
