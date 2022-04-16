/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import enums.UniversityUID;

import javax.persistence.*;
import java.io.Serializable;

@Entity( name = "UNIVERSITIES" )
public class University implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private UniversityUID universityUID;

    private String name;

    @OneToOne
    private Address address;

    public University() {
    }

    public University(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public University(String s, UniversityUID tuVarna, Address address) {
        this.name = s;
        this.universityUID = tuVarna;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
