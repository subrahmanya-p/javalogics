package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student1 {
	String name;
	int age;
	int mark;
	double cgpa;

	public Student1(String name, int age, int mark, double cgpa) {

		this.name = name;
		this.age = age;
		this.mark = mark;
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "name : " + name + ", age : " + age + ", mark : " + mark + ", cgpa : " + cgpa + " ";
	}

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>(
				Arrays.asList(new Student("Subrahmnyaa", 21, 89, 8.1), new Student("shubha", 32, 45, 9.8),
						new Student("sharath", 67, 56, 7.5), new Student("manoj", 69, 89, 1.2),
						new Student("mithun", 45, 30, 6.6), new Student("chidu", 21, 66, 1.1),
						new Student("mithun", 45, 21, 9.0), new Student("dinakar", 45, 67, 4.5)));
		Collections.sort(list, (Student s1, Student s2) -> {
			return s1.mark - s2.mark;

		});
		list.forEach((ele) -> {
			System.out.println(ele);
		});
	}
}
