package ecole.suptech.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data 
@Entity
public class Employe {
	@Id
	Long id;
	String nom;
	double salaire;
	@ManyToOne
	Departement departement;
}
