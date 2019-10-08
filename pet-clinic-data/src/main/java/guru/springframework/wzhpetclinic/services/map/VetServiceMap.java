package guru.springframework.wzhpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.wzhpetclinic.model.Speciality;
import guru.springframework.wzhpetclinic.model.Vet;
import guru.springframework.wzhpetclinic.services.SpecialtyService;
import guru.springframework.wzhpetclinic.services.VetService;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{
	private SpecialtyService specialtyService;
	@Override
	public Set<Vet> findAll() {return super.findAll();}
	
	
	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		if(object.getSpecialities().size()>0) {
			object.getSpecialities().forEach(speciality->{
				if(speciality.getId() == null) {
					Speciality savedSpeciality = specialtyService.save(speciality);
					speciality.setId(savedSpeciality.getId());
			}
			});
		}
		return super.save(object);
	}

	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) { super.deleteById(id);}


}
