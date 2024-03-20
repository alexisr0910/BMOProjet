package com.yourcompany.parisenligne.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity  
@Getter @Setter
public class Parieur extends Compte {
	
	
	@Column(length=100)
    String nomUtilisateur; 
	
	@Column(length=100)
	int ajoutJeton;
	
	@Column(length=100)
	@ReadOnly
    @Calculation("ajoutJeton + 10000")
	int jetonSolde;
	
	    
}
