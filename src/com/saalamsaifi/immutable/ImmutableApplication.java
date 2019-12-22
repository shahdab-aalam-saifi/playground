package com.saalamsaifi.immutable;

public class ImmutableApplication {
	public static void main(String[] args) {
		Student student = new Student(100, "Shahdab");
		
		System.out.println(student.getRollNumber() + " " + student.getName());
		
		student = new Student(100, "Shahdab Aalam");

		System.out.println(student.getRollNumber() + " " + student.getName());
	}
}
