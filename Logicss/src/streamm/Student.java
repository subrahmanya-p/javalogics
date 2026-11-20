package streamm;

import java.util.*;

public class Student {

	int id;
	String name;
	double sal;

	Student(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSal() {
		return sal;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + sal;
	}

	public static void main(String[] args) {

		List<Student> students = List.of(new Student(3, "Rahul", 30000), new Student(1, "Subbu", 40000),
				new Student(4, "Kiran", 25000), new Student(2, "Arun", 35000));

		/*
		 * students.stream() .sorted(Comparator.comparing(Student::getId))
		 * .forEach(System.out::println);
		 */

		students.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);

	}
}
