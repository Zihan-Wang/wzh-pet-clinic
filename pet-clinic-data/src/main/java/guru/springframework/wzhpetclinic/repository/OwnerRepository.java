package guru.springframework.wzhpetclinic.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.wzhpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long>{
	Owner findByLastName(String lastName); 
}
