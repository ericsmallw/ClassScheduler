/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1.BusinessLayer;

import java.util.ArrayList;
import java.util.Random;
import Project1.Course;
import Project1.Student;


public class MockOptimizationManager implements IOptimizationManager {

    @Override
    public String getMinimizedCourseSize(ArrayList<Course> courses, ArrayList<Student> students, 
                                    int numberOfSemesters, int allowedNoOfCoursesPerSemester) {
        Random rand = new Random();
        
        return String.valueOf(rand.nextInt((100 - 0) + 1) + 0);
    }
    
    @Override
    public String getCourseScheduleForStudent(ArrayList<Course> courses, ArrayList<Student> students, 
                                    int numberOfSemesters, 
                                    int allowedNumberOfCoursesPerSemester, int studentNumber){
        return "test";
    }
    
}
