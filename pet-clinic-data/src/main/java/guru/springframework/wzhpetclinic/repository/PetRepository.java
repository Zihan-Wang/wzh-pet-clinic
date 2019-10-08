package guru.springframework.wzhpetclinic.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.wzhpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long>{

}
