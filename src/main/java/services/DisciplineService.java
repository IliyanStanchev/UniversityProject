package services;

import dao.implementation.DisciplineDAO;
import entity.Discipline;
import entity.Speciality;

import java.util.List;

public class DisciplineService {

    DisciplineDAO disciplineDAO = new DisciplineDAO();

    public List<Discipline> getAll() {

        return disciplineDAO.getAll();
    }

    public Discipline getDiscipline(String disciplineName) {
        return disciplineDAO.getDiscipline(disciplineName);
    }

    public void saveOrUpdate(Discipline currentDiscipline) {

        if( currentDiscipline == null )
            return;

        if( currentDiscipline.getCourse() == null )
            return;

        if( currentDiscipline.getTeacher() == null )
            return;

        disciplineDAO.saveOrUpdate(currentDiscipline);
    }

    public List<Discipline> getDisciplinesByTeacher(int teacherID) {
        return disciplineDAO.getDisciplinesByTeacher(teacherID);
    }

    public List<Discipline> getDisciplinesBySpeciality(int specialityID) {
        return disciplineDAO.getDisciplinesBySpeciality(specialityID);
    }
}
