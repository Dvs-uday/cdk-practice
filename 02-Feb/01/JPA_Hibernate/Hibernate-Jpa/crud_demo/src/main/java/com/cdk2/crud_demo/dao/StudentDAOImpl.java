package com.cdk2.crud_demo.dao;

import com.cdk2.crud_demo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository // Helps in component scanning and DAO implementation

public class StudentDAOImpl implements StudentDAO{

    //First we have to define field for entity manager
    private EntityManager entityManager;


    //Then we have to inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    //then implementing save method
    @Override
    @Transactional //begins and ends transaction of our jpa code
    public void save(Student thestudent) {

        entityManager.persist(thestudent);
    }


    // this step is for retrieving the data
    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class,id);  //entity class , id
    }

    @Override
    public List<Student> findall() {
        TypedQuery<Student> theQuery= entityManager.createQuery("FROM Student", Student.class); //Name od JPA entity and and entity class
        return theQuery.getResultList();
    }

    @Transactional
    @Override
    public void update(Student theStudent) {
        entityManager.merge(theStudent);

    }

    //deleting the DAO objects
    @Override
    @Transactional
    public void delete(Integer id) {
        Student theStudent=entityManager.find(Student.class,id); //to get the Data Access Object

        entityManager.remove(theStudent);

    }


}
