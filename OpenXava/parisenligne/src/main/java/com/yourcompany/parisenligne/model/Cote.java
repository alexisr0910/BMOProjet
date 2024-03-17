package com.yourcompany.parisenligne.model;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity  
@Getter @Setter
public class Cote {
	
	@Id
	@Hidden 
    @GeneratedValue(generator="system-uuid") 
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length=32)
    String oid;
	
	@Column(length=20)
	double coteVictoire;
	
    @Column(length=20)
    double coteDefaite;
    
    @Column(length=20)
    double coteNul;
    

}
