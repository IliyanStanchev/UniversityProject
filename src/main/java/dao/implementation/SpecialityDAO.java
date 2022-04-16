package dao.implementation;

import dao.BaseDAO;
import entity.Speciality;
import entity.User;
import manager.EntityManagerExtender;
import services.SpecialityService;

import javax.persistence.NoResultException;

public class SpecialityDAO extends BaseDAO<Speciality> {

    public SpecialityDAO() {

        super.setClass(Speciality.class);
    }

    public Speciality getSpeciality(String specialityShortName) {
        Speciality speciality;
        try {
            speciality = (Speciality) EntityManagerExtender.getEntityManager().createQuery("FROM SPECIALITIES s WHERE s.shortName =: shortName ")
                    .setParameter("shortName", specialityShortName)
                    .getSingleResult();

        } catch (NoResultException e) {
            speciality = null;
        }
        return speciality;
    }
}