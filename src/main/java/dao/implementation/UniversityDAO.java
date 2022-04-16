package dao.implementation;

import dao.BaseDAO;
import entity.University;
import entity.User;
import enums.UniversityUID;
import manager.EntityManagerExtender;

import javax.persistence.NoResultException;

public class UniversityDAO extends BaseDAO<University> {

    public UniversityDAO() {

        super.setClass(University.class);
    }

    public University getUniversity(UniversityUID universityUID) {
        University university;
        try {
            university = (University) EntityManagerExtender.getEntityManager().createQuery("FROM UNIVERSITIES u WHERE  u.universityUID=: universityUID ")
                    .setParameter("universityUID", universityUID)
                    .getSingleResult();

        } catch (NoResultException e) {
            university = null;
        }
        return university;
    }
}