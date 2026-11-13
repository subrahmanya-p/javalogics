package twod;

public class StringMain {
	String[][] arr;

	public StringMain(int row, int column) {
		try {
			arr = new String[row][column];
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

	void insert(int row, int column, String value) {
		try {
			if (arr[row][column] == null) {
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

	void searchByValue(String  value) {
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

	void deleteByValue(String value) {
		try {

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] == value) {
						arr[i][j] = null;
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
			arr[row][column] = null;
			System.out.println("In row " + row + ", column " + column + ", the value " + arr[row][column]
					+ " is present. has been deleted..!");

		} catch (Exception e) {
			System.out.println("Invalid");

		}

	}

	public static void main(String[] args) {
		StringMain matrix = new StringMain(3, 3);
		matrix.insert(0, 0, "subbu");
		matrix.insert(0, 1, "hari");
		matrix.insert(0, 2, "mahesh");

		matrix.insert(1, 0, "shubha");
		matrix.insert(1, 1, "nishmitha");
		matrix.insert(1, 2, "sandya");

		matrix.insert(2, 0, "charishma");
		matrix.insert(2, 1, "sushma");
		matrix.insert(2, 2, "kususma");
		matrix.searchByValue("shubha");
		matrix.searchByRowAndColumn(1,1);
		matrix.deleteByValue("charishma");

	}
}
