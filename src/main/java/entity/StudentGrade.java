/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import enums.Grade;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author ench3
 */
@Entity(name ="STUDENT_GRADES")
public class StudentGrade implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Grade grade;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Discipline discipline;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public StudentGrade() {
    }

    public StudentGrade(Grade grade, Student student, Discipline discipline) {
        this.grade = grade;
        this.student = student;
        this.discipline = discipline;
    }
}
