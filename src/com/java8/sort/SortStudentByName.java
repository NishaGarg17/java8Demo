package com.java8.sort;

import java.util.Comparator;

import com.java8.entity.Student;

public class SortStudentByName implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return student1.getFirstName().compareTo(student2.getFirstName());
	}
	
}
