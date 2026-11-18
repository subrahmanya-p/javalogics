package SiddeshSir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee1 {
	int id;
	String name;
	int age;

	public Employee1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee :  { id :" + id + ", name : " + name + ", age : " + age + "}";
	}

	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<>(Arrays.asList(
				new Employee1(21, "subbu", 21),
				new Employee1(28, "varun", 23), new Employee1(29, "ajay", 24), new Employee1(30, "vijay", 22),
				new Employee1(22, "rahul", 23), new Employee1(23, "rohan", 24), new Employee1(24, "arun", 22),
				new Employee1(25, "kiran", 25), new Employee1(-12, "sachin", 21), new Employee1(27, "manoj", 26)));
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {

				if (list.get(j).id>list.get(j+1).id) {
					Employee1 temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);

				}

			}

		}
		for (Employee1 Employee1 : list) {
			System.out.println(Employee1);
		}
	}
}
