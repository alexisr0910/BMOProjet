package com.yourcompany.parisenligne.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity  
@Getter @Setter
public class Compte {
	
	@Id
	@Column(length=100)
    String email;
	
	@Column(length=100)
	@Required
    String motDePasse; 

}
