package dao.implementation;

import dao.BaseDAO;
import entity.Teacher;
import entity.User;
import manager.EntityManagerExtender;

import javax.persistence.NoResultException;

public class TeacherDAO extends BaseDAO<Teacher> {

    public TeacherDAO() {

        super.setClass(Teacher.class);
    }

    public Teacher getTeacher(String identifier) {
        Teacher teacher;
        try {
            teacher = (Teacher) EntityManagerExtender.getEntityManager().createQuery("FROM TEACHERS t WHERE t.user.identifier =: identifier ")
                    .setParameter("identifier", identifier)
                    .getSingleResult();

        } catch (NoResultException e) {
            teacher = null;
        }
        return teacher;
    }
}