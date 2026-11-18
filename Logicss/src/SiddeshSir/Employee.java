package SiddeshSir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {
	int id;
	String name;
	int age;

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee { id :" + id + ", name : " + name + ", age : " + age + "}";
	}

	static void SortByName(List<Employee> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {

				if (list.get(j).name.toLowerCase().compareTo(list.get(j + 1).name.toLowerCase()) > 0) {
					Employee temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);

				}

			}

		}
	}

	static void sortById(List<Employee> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {

				if (list.get(j).id > list.get(j + 1).id) {
					Employee temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);

				}

			}

		}
	}

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>(Arrays.asList(new Employee(21, "subbu", 21),
				new Employee(28, "varun", 23), new Employee(29, "ajay", 24), new Employee(30, "vijay", 22),
				new Employee(22, "rahul", 23), new Employee(23, "rohan", 24), new Employee(24, "arun", 22),
				new Employee(25, "kiran", 25), new Employee(26, "sachin", 21), new Employee(27, "manoj", 26)));
		SortByName(list);

		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
}
