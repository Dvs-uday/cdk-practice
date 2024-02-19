package com.cdk2.RestCurdTable.rest;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String message) {
        super(message); //calls super class
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }
}
