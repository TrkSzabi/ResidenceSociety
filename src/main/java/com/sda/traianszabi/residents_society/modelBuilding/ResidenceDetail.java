package com.sda.traianszabi.residents_society.modelBuilding;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "residence_details")
public class ResidenceDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer resDetailId;

    @NotBlank
    @Column(name = "rooms")
    private Integer roomNr;

    @NotBlank
    @Column(name = "built_surface")
    private String builtSurface;

    @NotBlank
    @Column(name = "living_space")
    private String livingSpace;

    @NotBlank
    @Column(name = "pool")
    private Boolean hasPool;

    @NotBlank
    @Column(name = "garden")
    private Boolean hasGarden;

    @NotBlank
    @Column(name = "balcony")
    private Boolean hasBalcony;

    @NotBlank
    @Column(name = "garage")
    private Boolean hasGarage;

    @NotBlank
    @Column(name = "parking_space")
    private Boolean parkingSpace;

    public Integer getResDetailId() {
        return resDetailId;
    }

    public void setResDetailId(Integer resDetailId) {
        this.resDetailId = resDetailId;
    }

    public Integer getRoomNr() {
        return roomNr;
    }

    public void setRoomNr(Integer roomNr) {
        this.roomNr = roomNr;
    }

    public String getBuiltSurface() {
        return builtSurface;
    }

    public void setBuiltSurface(String builtSurface) {
        this.builtSurface = builtSurface;
    }

    public String getLivingSpace() {
        return livingSpace;
    }

    public void setLivingSpace(String livingSpace) {
        this.livingSpace = livingSpace;
    }

    public Boolean getHasPool() {
        return hasPool;
    }

    public void setHasPool(Boolean hasPool) {
        this.hasPool = hasPool;
    }

    public Boolean getHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(Boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public Boolean getHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(Boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public Boolean getHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(Boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public Boolean getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(Boolean parkingSpace) {
        this.parkingSpace = parkingSpace;
    }
}
