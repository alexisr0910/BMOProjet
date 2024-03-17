package com.yourcompany.parisenligne.model;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity  
@Getter @Setter 
public class Paris {
	@Id
    @Column(length=20)
    int id;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=true) 
	 Evenement evenement;
	
    
    @Required
    BigDecimal montantParis;
    
    @ReadOnly
    @Calculation("montantParis * evenement.cote")
    BigDecimal gain;
    
    @Column(length=20)
    String nomVainqueur;
    
    @Column(length=100)
    Boolean matchNul;
    
    @Column(length=50)
    int ecartDePoint;
    
    @Embedded @NoFrame
    Avancer avancer;
	   
}

