package com.example.ClinicApis.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name="Clinic_Name")
@NoArgsConstructor
@AllArgsConstructor
public class Clients {
    @Id
    @Column(name="ID")
    @GeneratedValue
    private int id;
    
    @Column(name="Property_Code")
    private int value;

    @Column(name="Clinic_Name")
    private String name;
    
}
