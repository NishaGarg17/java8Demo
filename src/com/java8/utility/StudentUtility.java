package com.java8.utility;

import java.util.ArrayList;
import com.java8.entity.Student;

public class StudentUtility {
	static ArrayList<Student> studentList = new ArrayList<Student>();
	private StudentUtility() {
		
	}
	public static ArrayList<Student> getStudentList() {
		// create list of students
		studentList.add(new Student("Nisha",21));
		studentList.add(new Student("Manisha",22));
		studentList.add(new Student("Manpreet Kaur",20));
		return studentList;
	}
	public static void printStudentList() {
		// print list of students
		for(Student student: studentList) {
			System.out.println(student);
		}
	}
	
}
