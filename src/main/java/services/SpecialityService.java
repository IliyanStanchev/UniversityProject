package services;

import dao.implementation.SpecialityDAO;
import entity.Speciality;

import java.util.List;

public class SpecialityService {

    SpecialityDAO specialityDAO = new SpecialityDAO();

    public List<Speciality> getAll() {
        return specialityDAO.getAll();
    }

    public Speciality getSpeciality(String specialityShortName) {
        return specialityDAO.getSpeciality(specialityShortName);
    }

    public void saveOrUpdate(Speciality currentSpeciality) {

        if( currentSpeciality == null )
            return;

        specialityDAO.saveOrUpdate(currentSpeciality);
    }
}
