package scenario;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String designation;
	private int exp;
	private String gender;
	private String location;

	public Employee(int id, String name, double salary, String designation, int exp, String location, String gender) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.exp = exp;
		this.location = location;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
	public double getSalary() {
		return salary;
	}

	public String getDesignation() {
		return designation;
	}

	public int getExp() {
		return exp;
	}

	public String getGender() {
		return gender;
	}

	public String getLocation() {
		return location;
	}

	public static void main(String[] args) {

	}
}

