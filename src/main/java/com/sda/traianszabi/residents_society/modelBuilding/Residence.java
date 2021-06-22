package com.sda.traianszabi.residents_society.modelBuilding;

import com.sda.traianszabi.residents_society.modelPeople.Person;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "residences")
public class Residence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer residenceId;

    @NotBlank
    @Column(name = "residence_nr")
    private String residenceNr;

    @OneToOne
    private Person person;

    @OneToOne
    private Building building;

    @OneToMany
    private List<ResidenceDetail> residenceDetails;

}
