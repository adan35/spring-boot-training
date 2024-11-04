package com.springboot.cruddemo;

import com.springboot.cruddemo.dao.StudentDAO;
import com.springboot.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO student) {
		return runner -> {
			readStudent(student);
		};
	}

	private void readStudent(StudentDAO student) {
		System.out.println("Creating student");
		Student tempStudent = new Student("John", "Doe", "john@example.com");
		student.save(tempStudent);

		tempStudent = student.findById(tempStudent.getId());
		System.out.println("Student: " + tempStudent);
	}


}
