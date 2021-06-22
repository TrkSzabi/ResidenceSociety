package com.sda.traianszabi.residents_society.modelPeople;

import com.sda.traianszabi.residents_society.modelBuilding.Residence;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "owners")
public class Owner extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id")
    private Integer ownerId;

    @NotBlank
    @Column(name = "full_name")
    private String fullName;

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

    @OneToMany
    private List<Residence> residenceList;

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public List<Residence> getResidenceList() {
        return residenceList;
    }

    public void setResidenceList(List<Residence> residenceList) {
        this.residenceList = residenceList;
    }
}

