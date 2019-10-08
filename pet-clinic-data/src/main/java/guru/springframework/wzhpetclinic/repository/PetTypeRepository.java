package guru.springframework.wzhpetclinic.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.wzhpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long>{

}
