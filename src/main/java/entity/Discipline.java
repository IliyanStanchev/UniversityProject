/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "DISCIPLINES")
public class Discipline implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne
    private Teacher teacher;

    @ManyToOne
    private Course course;

    public Discipline(){
    }

    public Discipline(String name, Teacher teacher, Course course) {
        this.name = name;
        this.teacher = teacher;
        this.course = course;
    }

    public Discipline(Teacher teacher, Course course) {
        this.teacher = teacher;
        this.course = course;
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return getCourse().getSpeciality().getShortName() + " " + getName();
    }
}
