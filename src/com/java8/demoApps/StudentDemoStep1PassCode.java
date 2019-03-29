package com.java8.demoApps;

import java.util.ArrayList;
import java.util.Collections;

import com.java8.entity.Student;
import com.java8.sort.SortStudentByName;
import com.java8.utility.StudentUtility;

public class StudentDemoStep1PassCode {
	public static void main(String args[]) {
		ArrayList<Student> studentList = StudentUtility.getStudentList();
		System.out.println("Student List is: ");
		StudentUtility.printStudentList();
		Collections.sort(studentList, new SortStudentByName());
		System.out.println("StudentList sorted by first name: ");
		StudentUtility.printStudentList();
	}
}
