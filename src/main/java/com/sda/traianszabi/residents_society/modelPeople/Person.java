package com.sda.traianszabi.residents_society.modelPeople;

import org.graalvm.compiler.lir.LIRInstruction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "persons")
public class Person  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotBlank
    @Column(name = "name")
    private String name;

    @NotBlank
    @Column(name = "socialNumber")
    private String socialNumber;

    @NotBlank
    @Column(name = "living_address")
    private String livingAddress;

    @NotBlank
    @Column(name = "postal_adress")
    private String postalAddress;

    @OneToMany
    private List<User> users;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public String getLivingAddress() {
        return livingAddress;
    }

    public void setLivingAddress(String livingAddress) {
        this.livingAddress = livingAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postAddress) {
        this.postalAddress = postAddress;
    }
}
