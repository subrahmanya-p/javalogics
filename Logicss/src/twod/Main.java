package twod;

public class Main {
	int[][] arr;

	public Main(int row, int column) {
		try {
			arr = new int[row][column];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					arr[i][j] = Integer.MIN_VALUE;

				}

			}
			System.out.println(" Matrix Created  Succefully!");

		} catch (Exception e) {
			System.out.println("Invalid  row or column ");
		}
	}

	void insert(int row, int column, int value) {
		try {
			if (arr[row][column] == Integer.MIN_VALUE) {
				arr[row][column] = value;
				System.out.println("The values are inserted !");
			} else {
				arr[row][column] = value;
				System.out.println("The values are  updated !");

			}

		} catch (Exception e) {
			System.out.println("Invalid");
		}
	}

	void searchByValue(int value) {
		try {

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] == value) {
						System.out.println(
								"The value : " + value + " is present at the index :" + "[" + i + "]" + "[" + j + "]");
					}

				}
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

	void deleteByValue(int value) {
		try {

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] == value) {
						arr[i][j] = Integer.MIN_VALUE;
						System.out.println("The value : " + value + " is present at the index :" + "[" + i + "]" + "["
								+ j + "]   has beeen deleted ");
					}

				}
			}
		} catch (Exception e) {
			System.out.println("Invalid");

		}

	}

	void deleteByRowAndColumn(int row, int column) {
		try {
			arr[row][column] = Integer.MIN_VALUE;
			System.out.println("In row " + row + ", column " + column + ", the value " + arr[row][column]
					+ " is present. has been deleted..!");

		} catch (Exception e) {
			System.out.println("Invalid");

		}

	}

	public static void main(String[] args) {
		Main matrix = new Main(3, 3);
		matrix.insert(0, 0, 10);
		matrix.insert(0, 1, 20);
		matrix.insert(0, 2, 30);

		matrix.insert(1, 0, 40);
		matrix.insert(1, 1, 30);
		matrix.insert(1, 2, 60);

		matrix.insert(2, 0, 70);
		matrix.insert(2, 1, 80);
		matrix.insert(2, 2, 90);
		matrix.searchByValue(30);
		matrix.searchByRowAndColumn(0, 23);
		matrix.deleteByValue(30);

	}
}
