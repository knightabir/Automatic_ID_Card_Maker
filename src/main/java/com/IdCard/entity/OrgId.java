package com.IdCard.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "org_id")
public class OrgId {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String position;
    private String candidateAddress;
    private String email;
    private String dateOfJoin;
    private String blood;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "org_user_id",nullable = false)
    @JsonIgnoreProperties("orgId")
    private OrgUser orgUser;

    //constructor
    public OrgId() {

    }
    public OrgId(Long id, String firstName, String lastName, String phone, String position, String candidateAddress, String email, String dateOfJoin, String blood, OrgUser orgUser) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.position = position;
        this.candidateAddress = candidateAddress;
        this.email = email;
        this.dateOfJoin = dateOfJoin;
        this.blood = blood;
        this.orgUser = orgUser;
    }

    //getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCandidateAddress() {
        return candidateAddress;
    }

    public void setCandidateAddress(String candidateAddress) {
        this.candidateAddress = candidateAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(String dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public OrgUser getOrgUser() {
        return orgUser;
    }

    public void setOrgUser(OrgUser orgUser) {
        this.orgUser = orgUser;
    }


    //to-string method
    @Override
    public String toString() {
        return "OrgId{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                ", candidateAddress='" + candidateAddress + '\'' +
                ", email='" + email + '\'' +
                ", dateOfJoin='" + dateOfJoin + '\'' +
                ", blood='" + blood + '\'' +
                ", orgUser=" + orgUser +
                '}';
    }
}
