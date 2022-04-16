package services;

import dao.implementation.RoleDAO;
import dao.implementation.StudentDAO;
import entity.Student;
import org.eclipse.persistence.internal.jpa.config.converters.EnumeratedImpl;

import java.util.Collection;
import java.util.List;

public class StudentService {

    StudentDAO studentDAO = new StudentDAO();

    public List<Student> getStudentsByGroup(int groupID) {
        return studentDAO.getStudentsByGroup(groupID);
    }

    public List<Student> getAll(){
        return studentDAO.getAll();
    }

    public void deleteStudent(String facultyNumber) {
        studentDAO.deleteByFacultyNumber(facultyNumber);
    }

    public Student getStudentByFacultyNumber(String facultyNumber) {
       return studentDAO.getByFacultyNumber(facultyNumber);
    }

    public Student saveOrUpdate(Student currentStudent) {

        if( currentStudent == null )
            return null;

        if( currentStudent.getUser() == null )
            return null;

        return studentDAO.saveOrUpdate(currentStudent);
    }


    public List<Student> getStudentsByCourse(int courseID) {
        return studentDAO.getStudentsByCourse( courseID );
    }

    public Student getStudentByIdentifier(String identifier) {
        return studentDAO.getByIdentifier(identifier);
    }
}
