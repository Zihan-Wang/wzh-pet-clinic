package guru.springframework.wzhpetclinic.services;

import java.util.List;

import guru.springframework.wzhpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	Owner findByLastName(String lastName);
	List<Owner> findAllByLastNameLike(String lastName);
}
