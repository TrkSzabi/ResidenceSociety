package com.sda.traianszabi.residents_society.modelPeople;

import com.sda.traianszabi.residents_society.modelBuilding.Residence;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "occupants")
public class Occupant extends Person {

    @Id
    @Column(name = "occupant_id")
    private Integer occupantId;

    @NotBlank
    @Column(name = "name")
    private String occupantName;

    @NotBlank
    @Column(name = "phone")
    private String phone;

    @NotBlank
    @Email
    @Column(name = "email")
    private String email;

    @NotBlank
    @Column(name = "social_nr")
    private String socialNumber;

    @OneToOne
    private Residence residence;

    public Integer getOccupantId() {
        return occupantId;
    }

    public void setOccupantId(Integer occupantId) {
        this.occupantId = occupantId;
    }

    public String getOccupantName() {
        return occupantName;
    }

    public void setOccupantName(String occupantName) {
        this.occupantName = occupantName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getSocialNumber() {
        return socialNumber;
    }

    @Override
    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public Residence getResidence() {
        return residence;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }
}
