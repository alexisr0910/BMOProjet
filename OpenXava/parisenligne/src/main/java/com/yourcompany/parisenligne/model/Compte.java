package com.yourcompany.parisenligne.model;

import javax.persistence.*;

import lombok.*;


@MappedSuperclass
@Embeddable 
@Getter @Setter
public class Compte {
	
	@Id
	@Column(length=100)
    String email;
	
	@Column(length=100)
    String motDePasse; 

}
