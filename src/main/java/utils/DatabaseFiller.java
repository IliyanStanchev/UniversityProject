/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import dao.implementation.*;
import entity.*;
import enums.*;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DatabaseFiller {
       
    public void fillDatabase(){

        AddressDAO addressDAO = new AddressDAO();
        Address address = addressDAO.saveOrUpdate( new Address("Varna", "Studentska N: 15"));

        UniversityDAO universityDAO = new UniversityDAO();
        University university = universityDAO.saveOrUpdate( new University("Technical university - Varna", UniversityUID.TU_VARNA, address) );

        SpecialityDAO specialityDAO = new SpecialityDAO();
        Speciality specialitySIT = specialityDAO.saveOrUpdate( new Speciality("Software and Internet technologies", "SIT", university) );
        Speciality specialityKST = specialityDAO.saveOrUpdate( new Speciality("Computer and software technologies", "CST", university) );
        Speciality specialityIT = specialityDAO.saveOrUpdate( new Speciality("Internet technologies", "IT", university) );
        Speciality specialityIM = specialityDAO.saveOrUpdate( new Speciality("Industrial management", "IM", university) );
        Speciality specialityE = specialityDAO.saveOrUpdate( new Speciality("Electronics", "E", university) );
        Speciality specialityAI = specialityDAO.saveOrUpdate( new Speciality("Artificial Intelligence", "AI", university) );

        CourseDAO courseDAO = new CourseDAO();

        Course courseSIT1 = courseDAO.saveOrUpdate( new Course(CourseNumber.FIRST, specialitySIT) );
        Course courseSIT2 = courseDAO.saveOrUpdate( new Course(CourseNumber.SECOND, specialitySIT) );
        Course courseSIT3 = courseDAO.saveOrUpdate( new Course(CourseNumber.THIRD, specialitySIT) );
        Course courseSIT4 = courseDAO.saveOrUpdate( new Course(CourseNumber.FORTH, specialitySIT) );
        Course courseKST1 = courseDAO.saveOrUpdate( new Course(CourseNumber.FIRST, specialityKST) );
        Course courseKST2 = courseDAO.saveOrUpdate( new Course(CourseNumber.SECOND, specialityKST) );
        Course courseKST3 = courseDAO.saveOrUpdate( new Course(CourseNumber.THIRD, specialityKST) );
        Course courseKST4 = courseDAO.saveOrUpdate( new Course(CourseNumber.FORTH, specialityKST) );
        Course courseIT1 = courseDAO.saveOrUpdate( new Course(CourseNumber.FIRST, specialityIT) );
        Course courseIT2 = courseDAO.saveOrUpdate( new Course(CourseNumber.SECOND, specialityIT) );
        Course courseIT3 = courseDAO.saveOrUpdate( new Course(CourseNumber.THIRD, specialityIT) );
        Course courseIT4 = courseDAO.saveOrUpdate( new Course(CourseNumber.FORTH, specialityIT) );
        Course courseIM1 = courseDAO.saveOrUpdate( new Course(CourseNumber.FIRST, specialityIM) );
        Course courseIM2 = courseDAO.saveOrUpdate( new Course(CourseNumber.SECOND, specialityIM) );
        Course courseE1 = courseDAO.saveOrUpdate( new Course(CourseNumber.FIRST, specialityE) );
        Course courseE2 = courseDAO.saveOrUpdate( new Course(CourseNumber.SECOND, specialityE) );

        GroupDAO groupDAO = new GroupDAO();

        Group group1SIT1 = groupDAO.saveOrUpdate( new Group(GroupNumber.FIRST, courseSIT1));
        Group group2SIT1 = groupDAO.saveOrUpdate( new Group(GroupNumber.SECOND, courseSIT1));
        Group group1SIT2 = groupDAO.saveOrUpdate( new Group(GroupNumber.FIRST, courseSIT2));
        Group group2SIT2 = groupDAO.saveOrUpdate( new Group(GroupNumber.SECOND, courseSIT2));
        Group group1SIT3 = groupDAO.saveOrUpdate( new Group(GroupNumber.FIRST, courseSIT3));
        Group group2SIT3 = groupDAO.saveOrUpdate( new Group(GroupNumber.SECOND, courseSIT3));
        Group group1SIT4 = groupDAO.saveOrUpdate( new Group(GroupNumber.FIRST, courseSIT4));
        Group group2SIT4 = groupDAO.saveOrUpdate( new Group(GroupNumber.SECOND, courseSIT4));
        Group group1KST1 = groupDAO.saveOrUpdate( new Group(GroupNumber.FIRST, courseKST1));
        Group group2KST1 = groupDAO.saveOrUpdate( new Group(GroupNumber.SECOND, courseKST1));
        Group group1KST2 = groupDAO.saveOrUpdate( new Group(GroupNumber.FIRST, courseKST2));
        Group group2KST2 = groupDAO.saveOrUpdate( new Group(GroupNumber.SECOND, courseKST2));

        RoleDAO roleDAO = new RoleDAO();
        Role student    = roleDAO.saveOrUpdate( new Role("Student", RoleEnum.Student) );
        Role admin      = roleDAO.saveOrUpdate(new Role("Administrator", RoleEnum.Administrator) );
        Role teacher    = roleDAO.saveOrUpdate(new Role("Teacher", RoleEnum.Teacher) );

        UserDAO userDAO = new UserDAO();

        User studentUser = userDAO.saveOrUpdate(new User("student@gmail.com","student","password","Iliyan","Stanchev","9902265750","0897875640",student));
        User adminUser = userDAO.saveOrUpdate(new User("admin@gmail.com","admin","password","Stoyan","Stoyanov","9910285770","0897875641",admin));
        User teacherUser = userDAO.saveOrUpdate(new User("teacher@gmail.com","teacher","password","Ivan","Ivanov","9902265770","0897875642",teacher));

        StudentDAO studentDAO = new StudentDAO();

        Student student1 = studentDAO.saveOrUpdate(new Student("18621750", studentUser, group1SIT1));

        TeacherDAO teacherDAO = new TeacherDAO();

        Teacher teacher1 = teacherDAO.saveOrUpdate(new Teacher(Degree.DOCENT,teacherUser));

        DisciplineDAO disciplineDAO = new DisciplineDAO();

        Discipline disciplineOOP = disciplineDAO.saveOrUpdate(new Discipline("OOP",teacher1,courseSIT1));

        LaboratoryExerciseDAO laboratoryExerciseDAO = new LaboratoryExerciseDAO();
        LaboratoryExercise laboratoryExercise = laboratoryExerciseDAO.saveOrUpdate(new LaboratoryExercise(disciplineOOP,teacher1, group1SIT1, DayOfWeek.WEDNESDAY, "8:45", "11:00" ));

    }

}
