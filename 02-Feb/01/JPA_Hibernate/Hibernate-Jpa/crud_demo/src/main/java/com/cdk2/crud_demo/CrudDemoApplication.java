package com.cdk2.crud_demo;

import com.cdk2.crud_demo.dao.StudentDAO;
import com.cdk2.crud_demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) //executed after the spring beans have loaded
	{
		return runner->{
			//createStudent(studentDAO);
			//createMultipleStudent(studentDAO);

			//readStudent(studentDAO);
			//queryForStudents(studentDAO); //reading as list

			//updateStudent(studentDAO); //updating method

			deleteStudent(studentDAO);
		};
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId=3;

		System.out.println("Deleting student id"+studentId);

		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentId=4;
		System.out.println("Student ID:"+studentId);

		Student myStudent=studentDAO.findById(studentId);

		System.out.println("Updating");

		myStudent.setFirstname("New Name"); //setfirstname
		studentDAO.update(myStudent); //then merge

		System.out.println("Updated student="+myStudent);
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> theStudent=studentDAO.findall();

		for(Student tempStudent:theStudent)
		{
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		//creating student object

		System.out.println("Creating student object");
		Student tempstudent=new Student("uday","Kiran","uk@gmail.com");

		//saving
		System.out.println("Saving the student object");
		studentDAO.save(tempstudent);

		//get id and retriving using id

		int theId= tempstudent.getId();
		System.out.println("Retreiving with student id "+theId);

		Student mystudent=studentDAO.findById(theId);

		System.out.println("found the student");

	}

	private void createMultipleStudent(StudentDAO studentDAO)
	{
		//creating multiple student objects
		System.out.println("Creating 4 student object");
		Student tempstudent1=new Student("AB","Devilliers","abd@gmail.com");
		Student tempstudent2=new Student("KL","Rahul","rahul@gmail.com");
		Student tempstudent3=new Student("virat","Kohli","vk@gmail.com");
		Student tempstudent4=new Student("Jos","Buttler","jos@gmail.com");

		//saving multiple student objects
		System.out.println("Saving the student objects");
		studentDAO.save(tempstudent1);
		studentDAO.save(tempstudent2);
		studentDAO.save(tempstudent3);
		studentDAO.save(tempstudent4);
	}


	private void createStudent(StudentDAO studentDAO)
	{
		//first create the student object
		System.out.println("Creating new student object");
		Student tempstudent=new Student("uday","Damarla","dvs@gmail.com");

		//save the student object
		System.out.println("Saving the student object");
		studentDAO.save(tempstudent);

		//display id of the saved student
		System.out.println("saved student id. Genarated id"+tempstudent.getId());
	}
}
