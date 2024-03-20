package com.yourcompany.parisenligne.model;

import java.math.*;
import java.util.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity  
@Getter @Setter
public class Evenement {

	@Id
	@Hidden 
    @GeneratedValue(generator="system-uuid") 
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length=32)
    String oid;
 
	@Column(length=20)
    String nomEvenement;  
    
    @Column(length=20)
    Date debutEvenement;
    
    @ManyToOne
    @JoinColumn(name = "sport_id")
    Sport sport;
    
    @Column(length=50)
    BigDecimal limiteDeGain;
    
    @Column(length=50)
    BigDecimal limiteDeParis;
    
    
    @ManyToOne
    @JoinColumn(name = "cote_id")
    Cote cote;
  

    
}
