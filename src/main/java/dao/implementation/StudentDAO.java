package dao.implementation;

import dao.BaseDAO;
import entity.Student;
import entity.User;
import manager.EntityManagerExtender;

import javax.persistence.NoResultException;
import java.util.List;

public class StudentDAO extends BaseDAO<Student> {

    public StudentDAO() {

        super.setClass(Student.class);
    }
    
    public Student getByFacultyNumber(String facultyNumber) {
        Student student;
        try {
            student = (Student) EntityManagerExtender.getEntityManager().createQuery("FROM STUDENTS s WHERE s.facultyNumber =: facultyNumber ")
                    .setParameter("facultyNumber", facultyNumber)
                    .getSingleResult();

        } catch (NoResultException e) {
            student = null;
        }
        return student;
    }

    public void deleteByFacultyNumber(String facultyNumber) {

        Student student = getByFacultyNumber(facultyNumber);
        if( student == null )
            return;

        deleteById(student.getId());
    }

    public List<Student> getStudentsByGroup(int groupID) {
        return EntityManagerExtender.getEntityManager().createQuery("FROM STUDENTS student WHERE student.group.id =: groupID")
                .setParameter("groupID", groupID)
                .getResultList();
    }

    public List<Student> getStudentsByCourse(int courseID) {
        return EntityManagerExtender.getEntityManager().createQuery("FROM STUDENTS student WHERE student.group.course.id =: courseID")
                .setParameter("courseID", courseID)
                .getResultList();
    }

    public Student getByIdentifier(String identifier) {
        Student student;
        try {
            student = (Student) EntityManagerExtender.getEntityManager().createQuery("FROM STUDENTS s WHERE s.user.identifier =: identifier ")
                    .setParameter("identifier", identifier)
                    .getSingleResult();

        } catch (NoResultException e) {
            student = null;
        }
        return student;
    }
}