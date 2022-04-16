package services;

import dao.implementation.UniversityDAO;
import entity.University;
import enums.UniversityUID;

public class UniversityService {

    UniversityDAO  universityDAO = new UniversityDAO();

    public University getUniversity(UniversityUID universityUID){
        return universityDAO.getUniversity(universityUID);
    }
}
