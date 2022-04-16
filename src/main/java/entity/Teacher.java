/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import enums.Degree;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author ench3
 */
@Entity( name = "TEACHERS" )
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Degree degree;

    @OneToOne
    private User user;

    public Teacher() {
    }

    public Teacher(Degree degree, User user) {
        this.degree = degree;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return  getDegree() + " " + getUser().getFirstName() + " " + getUser().getLastName();
    }

    @Override
    public String toString() {
        return getName();
    }
}
