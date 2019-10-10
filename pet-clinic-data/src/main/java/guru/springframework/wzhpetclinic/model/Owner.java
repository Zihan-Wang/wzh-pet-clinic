package guru.springframework.wzhpetclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table(name = "owners")
public class Owner extends Person {
	@Builder
	public Owner(Long id, String firstName, String lastName, Set<Pet> pets, String city, String address, String telephone) {
		super(id, firstName, lastName);
		this.pets = pets;
		this.city = city;
		this.address = address;
		this.telephone = telephone;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	private Set<Pet> pets = new HashSet<>();
	
	@Column(name="coty")
	private String city;
	
	@Column(name="address")
	private String address;
	
	@Column(name="telephone")
	private String telephone;
}