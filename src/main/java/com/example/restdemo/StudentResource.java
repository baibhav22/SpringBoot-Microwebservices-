package com.example.restdemo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by baibhavghimire on 9/27/18.
 */

@Service
public class StudentResource {
    List<Student> students = new ArrayList<>(Arrays.asList
            (new Student(1, "baibhav"), new Student(2, "Jack")));

    public List<Student> getAllStudents() {

       return students;

   }

    public void addStudents( Student student){

        students.add(student);


    }
    public Student getStudentById( int id){

        for(int i=0; i<students.size();i++){
            Student ss= students.get(i);
            if (ss.getId()==id){
                return ss;

            }

        }
        return null;
    }
    public void updateStudents( int id,Student student){

        for(int i=0; i<students.size();i++){
            Student ss= students.get(i);
            if(ss.getId()==id) {
                students.set(i,student);

            }

        }

    }

    public void deleteStudents(int id){

        for(int i=0; i<students.size();i++){
            Student ss= students.get(i);
            if (ss.getId()==id){
                students.remove(i);


            }

        }
    }


}
