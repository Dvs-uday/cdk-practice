package com.cdk2.RestCurdTable.rest;

import com.cdk2.RestCurdTable.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct //this is defined to load the student data only once and more efficient way
    public void loadData()
    {
        theStudents =new ArrayList<>();

        theStudents.add(new Student("Uday","Damarla"));
        theStudents.add(new Student("Aniketh","B"));
        theStudents.add(new Student("Rahul","KL"));
    }
    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return theStudents;

    }

    //now we can get a student by studentID
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId)//path variable is used to match studentId
    {

        if((studentId >=theStudents.size()) || (studentId <0))
        {
            throw new StudentNotFoundException("Student is not found"+studentId); //throws the exception step-3
        }

        return theStudents.get(studentId);

    }

    //Step 4 handling the exception using @ExceptionHandler
    //Which is now done at global exception class to handle global exceptions
    //Because of this in any REST Controller it can handle
}

