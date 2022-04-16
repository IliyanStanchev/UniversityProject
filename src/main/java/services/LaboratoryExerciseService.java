package services;

import dao.implementation.LaboratoryExerciseDAO;
import entity.LaboratoryExercise;

import java.util.List;

public class LaboratoryExerciseService {

    LaboratoryExerciseDAO laboratoryExerciseDAO = new LaboratoryExerciseDAO();

    public List<LaboratoryExercise> getAll() {
        return laboratoryExerciseDAO.getAll();
    }

    public void saveOrUpdate(LaboratoryExercise laboratoryExercise){
        if( laboratoryExercise == null )
            return;

        if( laboratoryExercise.getDiscipline() == null )
            return;

        if( laboratoryExercise.getTeacher() == null )
            return;

        if( laboratoryExercise.getGroup() == null )
            return;

        if( laboratoryExercise.getDayOfWeek() == null )
            return;

        laboratoryExerciseDAO.saveOrUpdate(laboratoryExercise);
    }

    public LaboratoryExercise getLaboratoryExercise(int laboratoryExerciseID) {
        return laboratoryExerciseDAO.findById(laboratoryExerciseID);
    }

    public List<LaboratoryExercise> getTeacherLaboratoryExercises(int teacherID) {
        return laboratoryExerciseDAO.getTeacherLaboratoryExercises(teacherID);
    }

    public List<LaboratoryExercise> getGroupLaboratoryExercises(int groupID) {
        return laboratoryExerciseDAO.getGroupLaboratoryExercises(groupID);
    }
}
