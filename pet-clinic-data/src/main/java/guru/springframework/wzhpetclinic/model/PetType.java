package guru.springframework.wzhpetclinic.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import guru.springframework.wzhpetclinic.model.Owner.OwnerBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "types")
public class PetType extends BaseEntity{	
	@Column(name = "name")
    private String name;

	@Builder
	public PetType(Long id, String name) {
		super(id);
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
