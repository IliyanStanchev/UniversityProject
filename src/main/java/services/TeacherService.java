package services;

import dao.implementation.TeacherDAO;
import entity.Teacher;

import java.util.List;

public class TeacherService {

    TeacherDAO teacherDAO = new TeacherDAO();

    public List<Teacher> getAll() {
        return teacherDAO.getAll();
    }

    public Teacher getTeacher(String identifier) {
        return teacherDAO.getTeacher(identifier);
    }

    public void saveOrUpdate(Teacher currentTeacher) {

        if( currentTeacher == null )
            return;

        if( currentTeacher.getUser() == null )
            return;

        teacherDAO.saveOrUpdate(currentTeacher);
    }
}
