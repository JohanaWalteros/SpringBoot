package com.riwi.beautySalon.domain.entities;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "service")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ServiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 100, nullable = false)
    private String name;
    @Lob //->Declara el atributo como un tipo text
    private String description; 
    @Column(nullable = false)
    private BigDecimal price; //->BigDecimal: Tipo de dato que se usa para datos numericos precisos

    /*RELACIONES*/
    //->1. Un servicio puede tener muchas citas 
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
        fetch = FetchType.EAGER, 
        mappedBy = "service", 
        cascade = CascadeType.ALL, 
        orphanRemoval = false)
    private List<AppoinmentEntity> appoinments; 
   
}
