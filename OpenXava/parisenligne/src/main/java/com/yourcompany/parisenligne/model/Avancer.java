package com.yourcompany.parisenligne.model;

import javax.persistence.*;

import lombok.*;

@Embeddable
@Getter @Setter 
public class Avancer {
	
		@Column(length=20)
	    int scoreEquipe1;
	    
	    @Column(length=20)
	    int scoreEquipe2;
	    
	    @Column(length=20)
	    int intervalle;
	    
	    
}
