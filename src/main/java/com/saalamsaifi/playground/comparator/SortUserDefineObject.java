package com.saalamsaifi.playground.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortUserDefineObject {

  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();

    students.add(new Student(12, "Shubham"));
    students.add(new Student(10, "Rahul"));
    students.add(new Student(1, "Amol"));
    students.add(new Student(20, "Sheela"));
    students.add(new Student(19, "Mishika"));

    // Roll number wise sorting using Comparable (I)
    Collections.sort(students);

    System.out.println(students);

    // Name wise sorting
    Collections.sort(students, (Student o1, Student o2) -> o1.getName().compareTo(o2.getName()));

    System.out.println(students);
  }
}
