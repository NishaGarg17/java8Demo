package com.java8.demoApps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.java8.entity.Student;
import com.java8.utility.StudentUtility;

public class StudentDemoStep3UsingComparatorThenComparing {

	public static void main(String[] args) {
		ArrayList<Student> studentList = StudentUtility.getStudentList();
		System.out.println("Student List is: ");
		StudentUtility.printStudentList();
		Collections.sort(studentList, Comparator.comparing(Student :: getAge).reversed().thenComparing(Student :: getFirstName));
		System.out.println("StudentList sorted by first name in descending order is: ");
		StudentUtility.printStudentList();
	}

}
