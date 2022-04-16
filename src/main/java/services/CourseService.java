package services;

import dao.implementation.CourseDAO;
import entity.Course;

import java.util.List;

public class CourseService {

    CourseDAO courseDAO = new CourseDAO();

    public List<Course> getAll(){
        return courseDAO.getAll();
    }
}
