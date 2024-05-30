package com.riwi.beautySalon.domain.entities;

import java.util.List;

import com.riwi.beautySalon.utils.enums.RoleEmployee;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

@Entity(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     
    private long id;
    @Column(length = 100, nullable = false)
    private String firstName;
    @Column(length = 100, nullable = false)
    private String lastName;
    @Column(length = 100)
    private String email;
    @Column(length = 20)
    private String phone;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RoleEmployee role;

    /*RELACIONES*/
    //->1. Un empleado tiene muchas citas 
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
        fetch = FetchType.EAGER, 
        mappedBy = "employee", 
        cascade = CascadeType.ALL, 
        orphanRemoval = false)
    private List<AppoinmentEntity> appoinments;
}
