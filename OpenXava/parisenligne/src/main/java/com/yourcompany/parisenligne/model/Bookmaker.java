package com.yourcompany.parisenligne.model;

import javax.persistence.*;

import lombok.*;

@Entity  
@Getter @Setter
public class Bookmaker extends Compte {
	
	
	@Column(length=100)
    String nomBookmaker; 

}
