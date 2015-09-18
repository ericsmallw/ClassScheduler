/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1.BusinessLayer;

import java.util.ArrayList;
import Project1.Course;
import Project1.DataAccess.IStudentRepository;
import Project1.Student;


public class StudentManager implements IStudentManager {
    private final IStudentRepository studentRepository;
    
    public StudentManager(IStudentRepository studentRepository){
           this.studentRepository = studentRepository;    
    }
    
    @Override
    public ArrayList<Student> getStudents(String data){
        return studentRepository.getStudents(data);
    }
}
