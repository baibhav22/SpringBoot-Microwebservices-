package com.example.restdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by baibhavghimire on 9/27/18.
 */
@RestController
@RequestMapping("/go")
public class StudentController {

    @Autowired
    private StudentResource service;

    @GetMapping("/students")
    public List<Student> geAllStudents(){

        return service.getAllStudents();

    }

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public void addStudents( @RequestBody Student student){

        service.addStudents(student);


    }
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id){

        return service.getStudentById(id);

    }
    @RequestMapping(value="/students/{id}",method=RequestMethod.PUT)
    public void updateStudents( @PathVariable int id, @RequestBody Student student) {
        service.updateStudents(id,student);
    }
    @RequestMapping(value="students/{id}",method=RequestMethod.DELETE)
    public void deleteStudents(@PathVariable int id){

        service.deleteStudents(id);
    }


    }


