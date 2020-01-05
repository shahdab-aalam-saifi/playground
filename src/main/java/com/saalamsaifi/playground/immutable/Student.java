package com.saalamsaifi.playground.immutable;

public final class Student {
	private final int rollNumber;
	private final String name;

	public Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}
}
