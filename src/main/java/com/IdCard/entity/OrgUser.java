package com.IdCard.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import javax.naming.Name;
import java.util.List;

@Entity
@Table(name = "org_user")
public class OrgUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;
    private String phone;
    private String firstName;
    private String lastName;
    private String Role;
    private String organization;
    private String officeAddress;

    @OneToMany(mappedBy = "orgUser", cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonIgnoreProperties("orgUser")
    private List<OrgId> orgId;

    //constructor




    public OrgUser() {

    }

    public OrgUser(Long id, String email, String password, String phone, String firstName, String lastName, String role, String organization, String officeAddress, List<OrgId> orgId) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
        Role = role;
        this.organization = organization;
        this.officeAddress = officeAddress;
        this.orgId = orgId;
    }

    //Getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public List<OrgId> getOrgId() {
        return orgId;
    }

    public void setOrgId(List<OrgId> orgId) {
        this.orgId = orgId;
    }


    //to-string method


    @Override
    public String toString() {
        return "OrgUser{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Role='" + Role + '\'' +
                ", organization='" + organization + '\'' +
                ", officeAddress='" + officeAddress + '\'' +
                ", orgId=" + orgId +
                '}';
    }
}
