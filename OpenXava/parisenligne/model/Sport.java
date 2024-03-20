package com.yourcompany.parisenligne.model;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity  
@Getter @Setter
public class Sport {
	
	@Id
	@Hidden 
    @GeneratedValue(generator="system-uuid") 
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length=32)
    String oid;
	
	@Column(length=20)
    String nomSport;
	
    @Column(length=20)
    String equipe;
    
    @Column(length=20)
    String scoreEquipe;
    

}
