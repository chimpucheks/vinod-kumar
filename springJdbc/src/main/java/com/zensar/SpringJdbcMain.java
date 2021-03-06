package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entity.Student;
import com.zensar.repository.StudentRepositoryImpl;

public class SpringJdbcMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("jdbc example");
		StudentRepositoryImpl studentRepositoryImpl = context.getBean("studentRepository", StudentRepositoryImpl.class);

		// StudentRepository studentRepository = new StudentRepositoryImpl();
		// studentRepository.insert(student);

		Student student = new Student();
		student.setStudentId(4);
		student.setStudentName("raju");
		student.setStudentAge(25);
		student.setAddress("vsp");

		studentRepositoryImpl.insert(student);
		studentRepositoryImpl.findById(1);
		studentRepositoryImpl.findByName("kumar");
		studentRepositoryImpl.deleteStudent(2);
		studentRepositoryImpl.updateStudent(3, "vinod");

	}

}
