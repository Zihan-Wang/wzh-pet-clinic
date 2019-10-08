package guru.springframework.wzhpetclinic.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.wzhpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long>{

}
