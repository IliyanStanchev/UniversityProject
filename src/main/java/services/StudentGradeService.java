package services;

import dao.implementation.StudentGradeDAO;
import entity.StudentGrade;

public class StudentGradeService {

    StudentGradeDAO studentGradeDAO = new StudentGradeDAO();

    public StudentGrade getStudentGrade(int disciplineID, int studentID) {

        return studentGradeDAO.getStudentGrade(disciplineID, studentID);
    }

    public StudentGrade saveOrUpdate(StudentGrade studentGrade) {
        return studentGradeDAO.saveOrUpdate(studentGrade);
    }
}
