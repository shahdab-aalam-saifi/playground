package com.saalamsaifi.playground.immutable;

public class ImmutableApplication {
	public static void main(String[] args) throws CloneNotSupportedException {
		Course msc = new Course(01L, "M. Sc. Computer Science", 3);
		Student student = new Student(100, "Shahdab", msc);

		System.out.println(student.getCourse());

		Course modifiedCourse = student.getCourse();
		modifiedCourse.setId(101L); // performing changes on deep copy of object

		System.out.println(student.getCourse()); // change MUST not be applied on this reference
	}
}
