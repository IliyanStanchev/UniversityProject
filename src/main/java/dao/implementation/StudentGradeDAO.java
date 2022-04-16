package dao.implementation;

import dao.BaseDAO;
import entity.StudentGrade;
import entity.User;
import manager.EntityManagerExtender;

import javax.persistence.NoResultException;

public class StudentGradeDAO extends BaseDAO<StudentGrade> {

    public StudentGradeDAO() {

        super.setClass(StudentGrade.class);
    }

    public StudentGrade getStudentGrade(int disciplineID, int studentID) {
        StudentGrade studentGrade;
        try {
            studentGrade = (StudentGrade) EntityManagerExtender.getEntityManager().createQuery("FROM STUDENT_GRADES s WHERE s.discipline.id =: disciplineID and s.student.id =: studentID ")
                    .setParameter("disciplineID", disciplineID)
                    .setParameter("studentID", studentID)
                    .getSingleResult();

        } catch (NoResultException e) {
            studentGrade = null;
        }
        return studentGrade;
    }
}