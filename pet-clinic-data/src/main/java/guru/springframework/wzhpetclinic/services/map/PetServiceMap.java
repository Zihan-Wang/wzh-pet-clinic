package guru.springframework.wzhpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.wzhpetclinic.model.Pet;
import guru.springframework.wzhpetclinic.services.PetService;

@Service
@Profile({"default", "map"})
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public
	Set<Pet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public
	Pet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}
	
	@Override
	public
	void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public
	void delete(Pet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

}
