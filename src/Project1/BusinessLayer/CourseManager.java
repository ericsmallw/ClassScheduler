/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1.BusinessLayer;

import java.util.ArrayList;
import Project1.Course;
import Project1.DataAccess.ICourseRepository;


public class CourseManager implements ICourseManager {
    private final ICourseRepository courseRepository;
    
    public CourseManager(ICourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }
    
    @Override
    public ArrayList<Course> getCourses() {
        return  courseRepository.getCourses();
    }
}
