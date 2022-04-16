package dao.implementation;

import dao.BaseDAO;
import entity.Course;

public class CourseDAO extends BaseDAO<Course> {

    public CourseDAO() {

        super.setClass(Course.class);
    }
}