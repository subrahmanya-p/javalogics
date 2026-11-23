package twodarray;

import arraywithcollection.printMissigElement;

public class Main {
	static int[][] arr = { { 1, 4, 5 }, { 8, 9, 10 }, { 2, 7, 66 } };

	public static void sumOfAll() {
		int sum = 0;
		for (int[] innerArr : arr) {
			for (int element : innerArr) {
				sum += element;
			}
		}
		System.out.println("Sum of All :" + sum);

	}

	public static void DiagonalElement() {
		int sum = 0;
		System.out.println("Diagonal Elements : ");
		int i = 0;
		for (int[] innerArr : arr) {

			System.out.print(innerArr[i] + " ");
			sum += innerArr[i];
			i++;

		}
		System.out.println();
		System.out.println("Sum fo the Diagonal Elements is " + sum);

	}

	public static void radialElement() {
		int sum = 0;
		System.out.println("Radial Elements : ");
		int r = arr.length - 1;
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j][r] + " ");
			sum += arr[j][r];
			r--;

		}
		System.out.println();
		System.out.println("Sum fo the Diagonal Elements is " + sum);

	}

	public static void sumOfRowAndColumn() {
		System.out.println("Sum of the Row : ");
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.println("Sum of the " + i + "th Row :" + sum);
		}
		System.out.println("Sum of the Column : ");
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[j][i];
			}
			System.out.println("Sum of the " + i + "th Column :" + sum);
		}

	}

	public static void printOnlyEven() {
		System.out.println("Print Only Even : ");
		for (int[] outer : arr) {
			for (int i : outer) {
				if (i % 2 == 0)
					System.out.print(i + " ");

			}

		}
		System.out.println();
	}

	public static void printOnlyOdd() {
		System.out.println("Print Only Odd : ");
		for (int[] outer : arr) {
			for (int i : outer) {
				if (i % 2 != 0)
					System.out.print(i + " ");

			}

		}
	}

	public static void main(String[] args) {

		sumOfAll();
		DiagonalElement();
		radialElement();
		sumOfRowAndColumn();
		printOnlyEven();
		printOnlyOdd();
	}

}
