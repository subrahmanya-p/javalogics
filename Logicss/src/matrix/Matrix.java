package matrix;

public class Matrix {

	public static void printReverseEachRow(int[][] a) {

		for (int r = 0; r < a.length; r++) {
			for (int c = a[r].length - 1; c >= 0; c--) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static void reverseEachRow(int[][] a) {

		for (int r = 0; r < a.length; r++) {

			int i = 0, j = a[r].length - 1;

			while (i < j) {
				int temp = a[r][i];
				a[r][i] = a[r][j];
				a[r][j] = temp;

				i++;
				j--;
			}
		}

		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

	// Reverse row order (print only)
	public static void reverseRowOrder(int[][] a) {

		for (int r = a.length - 1; r >= 0; r--) {
			for (int c = 0; c < a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

	// Reverse columns (print only)
	public static void reverseColumnOrder(int[][] a) {

		for (int r = a.length - 1; r >= 0; r--) {
			for (int c = 0; c < a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

	// Reverse each column using two pointers
	public static void reverseColumns(int[][] a) {

		for (int col = 0; col < a[0].length; col++) {

			int top = 0, end = a.length - 1;

			while (top < end) {
				int temp = a[top][col];
				a[top][col] = a[end][col];
				a[end][col] = temp;

				top++;
				end--;
			}
		}

		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

	// Transpose (print only)
	public static void transpose(int[][] a) {

		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a.length; c++) {
				System.out.print(a[c][r] + " ");
			}
			System.out.println();
		}
	}

	// In-place transpose
	public static void transposeInPlace(int[][] a) {

		for (int r = 0; r < a.length; r++) {
			for (int c = r + 1; c < a[r].length; c++) {

				int t = a[r][c];
				a[r][c] = a[c][r];
				a[c][r] = t;
			}
		}

		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

	// Rotate 90 degrees clockwise (print only)
	public static void rotate90ClockwisePrint(int[][] a) {

		for (int r = 0; r < a.length; r++) {
			for (int c = a.length - 1; c >= 0; c--) {
				System.out.print(a[c][r] + " ");
			}
			System.out.println();
		}
	}

	// Rotate 90 degrees clockwise (in-place)
	public static void rotate90ClockwiseInPlace(int[][] a) {

		for (int r = 0; r < a.length; r++) {

			int i = 0, j = a[r].length - 1;

			while (i < j) {
				int t = a[i][r];
				a[i][r] = a[j][r];
				a[j][r] = t;

				i++;
				j--;
			}
		}

		for (int r = 0; r < a.length; r++) {
			for (int c = r + 1; c < a[r].length; c++) {

				int t = a[r][c];
				a[r][c] = a[c][r];
				a[c][r] = t;
			}
		}

		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

	// Rotate 90 degrees anti-clockwise (print only)
	public static void rotate90AntiClockwisePrint(int[][] a) {

		for (int r = a.length - 1; r >= 0; r--) {
			for (int c = 0; c < a.length; c++) {
				System.out.print(a[c][r] + " ");
			}
			System.out.println();
		}
	}

	// Rotate 90 degrees anti-clockwise (in-place)
	public static void rotate90AntiClockwiseInPlace(int[][] a) {

		for (int r = 0; r < a.length; r++) {
			for (int c = r + 1; c < a[r].length; c++) {

				int t = a[r][c];
				a[r][c] = a[c][r];
				a[c][r] = t;
			}
		}

		for (int c = 0; c < a[0].length; c++) {

			int top = 0, end = a.length - 1;

			while (top < end) {
				int t = a[top][c];
				a[top][c] = a[end][c];
				a[end][c] = t;

				top++;
				end--;
			}
		}

		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Call whichever method you want
		// printReverseEachRow(a);
		// reverseEachRow(a);
		// reverseRowOrder(a);
		// reverseColumnOrder(a);
		// reverseColumns(a);
		// transpose(a);
		// transposeInPlace(a);
		// rotate90ClockwisePrint(a);
		// rotate90ClockwiseInPlace(a);
		// rotate90AntiClockwisePrint(a);
		rotate90AntiClockwiseInPlace(a);
	}
}