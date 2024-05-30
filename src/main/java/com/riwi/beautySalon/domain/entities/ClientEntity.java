package com.riwi.beautySalon.domain.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "clients")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 100, nullable = false)
    private String name; 
    @Column(length = 100, nullable = false)
    private String lastName; 
    @Column(length = 20)
    private String phone;
    @Column(length = 100)
    private String email;
    
    /*RELACIONES*/
    //->1. Un cliente muchas citas
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
    fetch = FetchType.EAGER, 
    mappedBy = "client", 
    cascade = CascadeType.ALL, 
    orphanRemoval = false  )
    private List<AppoinmentEntity> appoinments; 
}
