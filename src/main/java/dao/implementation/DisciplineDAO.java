package dao.implementation;

import dao.BaseDAO;
import entity.Discipline;
import entity.User;
import manager.EntityManagerExtender;

import javax.persistence.NoResultException;
import java.util.List;

public class DisciplineDAO extends BaseDAO<Discipline> {

    public DisciplineDAO() {

        super.setClass(Discipline.class);
    }

    public Discipline getDiscipline(String disciplineName) {
        Discipline discipline;
        try {
            discipline = (Discipline) EntityManagerExtender.getEntityManager().createQuery("FROM DISCIPLINES d WHERE d.name =: disciplineName ")
                    .setParameter("disciplineName", disciplineName)
                    .getSingleResult();

        } catch (NoResultException e) {
            discipline = null;
        }
        return discipline;
    }

    public List<Discipline> getDisciplinesByTeacher(int teacherID) {
        return EntityManagerExtender.getEntityManager().createQuery("FROM DISCIPLINES discipline WHERE discipline.teacher.id =: teacherID")
                .setParameter("teacherID", teacherID)
                .getResultList();
    }

    public List<Discipline> getDisciplinesBySpeciality(int specialityID) {
        return EntityManagerExtender.getEntityManager().createQuery("FROM DISCIPLINES discipline WHERE discipline.course.speciality.id =: specialityID order by discipline.course.courseNumber")
                .setParameter("specialityID", specialityID)
                .getResultList();
    }
}