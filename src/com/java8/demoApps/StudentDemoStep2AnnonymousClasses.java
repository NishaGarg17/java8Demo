package com.java8.demoApps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import com.java8.entity.Student;
import com.java8.utility.StudentUtility;

public class StudentDemoStep2AnnonymousClasses {
	public static void main(String args[]) {
		ArrayList<Student> studentList = StudentUtility.getStudentList();
		System.out.println("Student List is: ");
		StudentUtility.printStudentList();
		Collections.sort(studentList, new Comparator<Student>() {

			@Override
			public int compare(Student student1, Student student2) {
				return student1.getAge()-student2.getAge();
			}});
		System.out.println("StudentList sorted by age: ");
		StudentUtility.printStudentList();
	}
}
