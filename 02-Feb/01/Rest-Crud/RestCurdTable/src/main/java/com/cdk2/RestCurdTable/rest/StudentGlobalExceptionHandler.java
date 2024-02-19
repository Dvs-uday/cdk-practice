package com.cdk2.RestCurdTable.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice  // this class and @ is used to handle exceptions globally
public class StudentGlobalExceptionHandler {
    //now pasting normal exception controller code here

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        //return response entity
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    //To handle all other exceptions this method is declared

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exc)
    {
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value()); //instead of 404 here it shows 400 error Status
        //error.setMessage(exc.getMessage()); //we can change this message as our wish
        error.setMessage("TRY Again"); //here i added a user friendly message to be shown
        error.setTimeStamp(System.currentTimeMillis());

        //return response entity
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
