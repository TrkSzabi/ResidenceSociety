package com.sda.traianszabi.residents_society.modelBuilding;

import jdk.jfr.BooleanFlag;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "buildings")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer buildingId;

    @NotBlank
    @Column(name = "city")
    private String city;

    @NotBlank
    @Column(name = "street")
    private String street;

    @Column(name = "number")
    @NotBlank
    private Integer number;

    @NotBlank
    @Column(name = "building_name")
    private String buildingName;

    @Column(name = "hasElevator")
    @BooleanFlag
    private Boolean hasElevator;

    @NotBlank
    @Column(name = "common_space")
    private String commonSpace;

    @OneToMany
    private List<Residence> residences;

    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Boolean getHasElevator() {
        return hasElevator;
    }

    public void setHasElevator(Boolean hasElevator) {
        this.hasElevator = hasElevator;
    }

    public String getCommonSpace() {
        return commonSpace;
    }

    public void setCommonSpace(String commonSpace) {
        this.commonSpace = commonSpace;
    }

    public List<Residence> getResidences() {
        return residences;
    }

    public void setResidences(List<Residence> residences) {
        this.residences = residences;
    }
}
