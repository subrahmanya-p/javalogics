package scenario;

import java.nio.charset.CoderMalfunctionError;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	private final static int ID = 0;
	private final static int NAME = 1;
	private final static int SAL = 2;
	private final static int DESIGNATION = 3;
	private final static int YEAROFEXPER = 4;
	private final static int LOCATION = 5;
	private final static int GENDER = 6;
	private final static int EMAIL = 7;

	private final static String[][] employees = {

			{ "101", "Asha", "85000", "Java Full Stack Developer", "5", "Hyderabad", "Female", "Asha@gmail.com" },
			{ "102", "Rahul", "92000", "Backend Developer", "7", "Bengaluru", "Male", "Rahul@gamil.com" },
			{ "103", "Sneha", "98000", "Java Full Stack Developer", "6", "Hyderabad", "Female", "Sneha@gamil.com" },
			{ "104", "Kiran", "76000", "Java Full Stack Developer", "4", "Hyderabad", "Male",
					"kirahjioyutrgfyuioioiouyhnjn@gmail.com" },
			{ "105", "Divya", "88000", "QA Engineer", "8", "Chennai", "Female", "@Divaya@gmail.com" },
			{ "106", "Arjun", "105000", "Technical Lead", "10", "Pune", "Male", "Arjun@gmail.com" },
			{ "107", "Priya", "91000", "Java Full Stack Developer", "9", "Hyderabad", "Female", "p.ri.ya@gmail.com" }

	};

	public static void highestSal() {

		Optional<String[]> first = Arrays.stream(employees)
				.sorted(Comparator.comparingDouble((String[] emp) -> Double.parseDouble(emp[SAL])).reversed())
				.findFirst();

		first.ifPresent(Main::display);
	}

	public static void femaleHighestSal() {
		Optional<String[]> femalMax = Arrays.stream(employees).filter(emp -> emp[GENDER].equalsIgnoreCase("female"))
				.max(Comparator.comparingDouble(emp -> Double.parseDouble(emp[SAL])));

		femalMax.ifPresent(Main::display);
	}

	// java developer from hyderbad
	public static void developersFromHyderBad() {
		List<String[]> data = Arrays.stream(employees).filter(emp -> emp[LOCATION].equalsIgnoreCase("Hyderabad")
				&& emp[DESIGNATION].equalsIgnoreCase("Java Full Stack Developer")).collect(Collectors.toList());

		data.forEach(emp -> display(emp));
	}

	public static void display(String[] emp) {
		System.out.println(emp[ID] + " " + emp[NAME] + " " + emp[SAL] + " " + emp[DESIGNATION] + " " + emp[YEAROFEXPER]
				+ " " + emp[LOCATION] + " " + emp[GENDER] + " " + emp[EMAIL]);
	}

	public static void main(String[] args) {
		System.out.println("---------");
		highestSal();
		System.out.println("---------");
		femaleHighestSal();
		System.out.println("---------");
		developersFromHyderBad();

	}
}
