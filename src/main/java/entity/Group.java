/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import enums.GroupNumber;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "STUDENT_GROUPS")
public class Group implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private GroupNumber groupNumber;

    @ManyToOne
    private Course course;

    public Group() {
    }

    public Group(GroupNumber groupNumber, Course course) {
        this.groupNumber = groupNumber;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GroupNumber getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(GroupNumber groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return course.getSpeciality().getShortName() + " Course: " + course.getCourseNumber() + " Group: " + groupNumber;
    }

    public String getDetails() {
        return "Group " + groupNumber + " " + getCourse().getSpeciality().getShortName() + " Course " + getCourse().getCourseNumber();
    }
}
