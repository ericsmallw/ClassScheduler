/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1.DataAccess;

import java.util.ArrayList;
import java.util.HashMap;
import Project1.Course;
import Project1.Semester;

/**
 *
 * @author ESmallwood
 */
public interface ICourseRepository {
    ArrayList<Course> getCourses();
    HashMap<String, String[]> getPrerequisites();
    HashMap<String, Semester[]> getCourseAvailablilty();
}
