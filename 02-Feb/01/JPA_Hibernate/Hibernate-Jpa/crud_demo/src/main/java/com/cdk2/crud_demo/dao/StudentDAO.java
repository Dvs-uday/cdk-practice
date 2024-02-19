package com.cdk2.crud_demo.dao;

import com.cdk2.crud_demo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student thestudent);

    Student findById(Integer id);

    List<Student> findall();

    void update(Student theStudent);

    void delete(Integer id);
}
