package com.java8.demoApps;

import java.util.ArrayList;
import java.util.Collections;

import com.java8.entity.Student;
import com.java8.utility.StudentUtility;

public class StudentDemoStep3UsingLambda {

	public static void main(String[] args) {
		ArrayList<Student> studentList = StudentUtility.getStudentList();
		System.out.println("Student List is: ");
		StudentUtility.printStudentList();
		//Collections.sort(studentList, (Student student1, Student student2) -> student1.getFirstName().compareTo(student2.getFirstName()));
		Collections.sort(studentList, (student1, student2) -> student1.getFirstName().compareTo(student2.getFirstName()));
		System.out.println("StudentList sorted by first name: ");
		StudentUtility.printStudentList();
	}

}
