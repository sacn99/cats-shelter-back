package com.shelter.animalback.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "VACCINE")
public class VaccineDao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VACCINE_GENERATOR")
    @SequenceGenerator(name="VACCINE_GENERATOR", sequenceName = "VACCINE_SEQ", allocationSize = 1)
    private Long id;

    @Column(unique = true)
    private String name;

    public VaccineDao(String name) {
        this.name = name;
    }
}
