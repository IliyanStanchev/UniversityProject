package dao.implementation;

import dao.BaseDAO;
import entity.LaboratoryExercise;
import manager.EntityManagerExtender;

import java.util.List;

public class LaboratoryExerciseDAO extends BaseDAO<LaboratoryExercise> {

    public LaboratoryExerciseDAO() {

        super.setClass(LaboratoryExercise.class);
    }

    public List<LaboratoryExercise> getTeacherLaboratoryExercises(int teacherID) {
        return EntityManagerExtender.getEntityManager().createQuery("FROM LABORATORY_EXERCISES l WHERE l.teacher.id =: teacherID")
                .setParameter("teacherID", teacherID)
                .getResultList();
    }

    public List<LaboratoryExercise> getGroupLaboratoryExercises(int groupID) {
        return EntityManagerExtender.getEntityManager().createQuery("FROM LABORATORY_EXERCISES l WHERE l.group.id =: groupID")
                .setParameter("groupID", groupID)
                .getResultList();
    }
}