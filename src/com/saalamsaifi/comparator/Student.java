package com.saalamsaifi.comparator;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int rollNumber;
	private String name;

	Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("{ %d, %s }", this.rollNumber, this.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollNumber == other.rollNumber;
	}

	@Override
	public int compareTo(Student o) {
		return this.rollNumber - o.rollNumber;
	}
}
