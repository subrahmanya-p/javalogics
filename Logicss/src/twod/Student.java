package twod;

import java.util.Arrays;
import java.util.Objects;

import SiddeshSir.Employee;

public class Student {
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	Student[][] arr;

	@Override
	public String toString() {
		return "Student : {  id : " + id + ", name : " + name + ", age : " + age + "}";
	}

	@Override
	public boolean equals(Object obj) {
		Student s1 = (Student) obj;
		return this.id == s1.id && this.name.equals(s1.name) && this.age == s1.age;

	}

	public Student(int row, int column) {
		try {
			arr = new Student[row][column];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					arr[i][j] = null;

				}

			}
			System.out.println(" Matrix Created  Succefully!");

		} catch (Exception e) {
			System.out.println("Invalid  row or column ");
		}
	}

	public void traverse() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != null)
					System.out.println(arr[i][j]);
			}
		}

	}

	void insert(int row, int column, Student student) {
		try {
			if (arr[row][column] == null && student != null) {
				arr[row][column] = student;
				System.out.println("The values are inserted !");
			} else {
				System.out.println("Sorry Something went Wrong! !");
			}

		} catch (Exception e) {
			System.out.println("Invalid Index ");
		}
	}

	void searchByValue(Student student) {
		try {

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (student != null && arr[i][j].equals(student)) {
						System.out.println("The value : " + student + " is present at the index :" + "[" + i + "]" + "["
								+ j + "]");
					}

				}
				System.out.println("Not Found");
			}
		} catch (Exception e) {
			System.out.println("Invalid");

		}

	}

	void searchByRowAndColumn(int row, int column) {
		try {

			System.out.println(
					"In row " + row + ", column " + column + ", the value " + arr[row][column] + " is present.");
			return;

		} catch (Exception e) {
			System.out.println("Invalid");

		}

	}

	void deleteByValue(Student student) {
		try {

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j].equals(student) && student != null) {
						arr[i][j] = null;
						System.out.println("The value : " + student + " is present at the index :" + "[" + i + "]" + "["
								+ j + "]   has beeen deleted ");
						return;
					}

				}
			}
			System.out.println("Not Found!");
		} catch (Exception e) {
			System.out.println("Invalid");

		}

	}

	void deleteByRowAndColumn(int row, int column) {
		try {
			arr[row][column] = null;
			System.out.println("In row " + row + ", column " + column + ", the value " + arr[row][column]
					+ " is present. has been deleted..!");

		} catch (Exception e) {
			System.out.println("Invalid");

		}

	}

	public void SortById() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length ; j++) {
				for (int j2 = 0; j2 < arr[i].length - j - 1; j2++) {
					if (arr[i][j2].id > arr[i][j2 + 1].id) {
						Student temp = arr[i][j2];
						arr[i][j2] = arr[i][j2 + 1];
						arr[i][j2 + 1] = temp;
					}
				}

			}

		}

	}

	public static void main(String[] args) {
		Student matrix = new Student(3, 3);

		matrix.insert(0, 0, new Student(992, "subbu", 21));
		matrix.insert(0, 1, new Student(13, "harish", 22));
		matrix.insert(0, 2, new Student(0, "mahesh", 23));

		matrix.insert(1, 0, new Student(1999, "shubha", 20));
		matrix.insert(1, 1, new Student(90, "nishmitha", 21));
		matrix.insert(1, 2, new Student(17, "sandya", 22));

		matrix.insert(2, 0, new Student(18, "dj", 20));
		matrix.insert(2, 1, new Student(19, "nuknown", 23));
		matrix.insert(2, 2, new Student(0, "sia", 21));

//		matrix.searchByValue(new Student(16, "nishmitha", 21));
//		matrix.searchByRowAndColumn(2, 1);
//		matrix.deleteByValue(new Student(14, "mahesh", 23));
//		matrix.deleteByRowAndColumn(1, 2);
		System.out.println("before");
		matrix.traverse();
		System.out.println("After");
		matrix.SortById();
		matrix.traverse();
		
		

	}
}
