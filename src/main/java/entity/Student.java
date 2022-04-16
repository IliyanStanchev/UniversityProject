/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "STUDENTS")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String facultyNumber;

    @OneToOne
    private User user;

    @ManyToOne
    private Group group;

    public Student() {
        user = new User();
        group = new Group();
    }

    public Student(String facultyNumber, User user, Group group) {
        this.facultyNumber = facultyNumber;
        this.user = user;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getDetails() {
        return " FN: " + getFacultyNumber() + " Group: " + getGroup().getGroupNumber();
    }
}
