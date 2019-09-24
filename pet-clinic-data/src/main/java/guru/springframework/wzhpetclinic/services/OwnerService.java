package guru.springframework.wzhpetclinic.services;

import guru.springframework.wzhpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	Owner findByLastName(String lastName);
}
