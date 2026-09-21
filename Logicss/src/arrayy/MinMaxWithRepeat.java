package arrayy;

public class MinMaxWithRepeat {
	public static void FirstMin(int arr[]) {
		int min = Integer.MAX_VALUE;
		for (int i : arr) {
			if (i < min) {
				min = i;

			}
		}
		System.out.println("First Min : " + min);

	}

	public static void FirstMax(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > max) {
				max = i;

			}
		}
		System.out.println("First Max : " + max);

	}

	public static void SecondMin(int arr[]) {
		int Firstmin = Integer.MAX_VALUE;
		int Secondmin = Integer.MAX_VALUE;
		for (int i : arr) {
			if (i < Firstmin) {
				Secondmin = Firstmin;
				Firstmin = i;
			} else if (i < Secondmin && i!=Firstmin) {
				Secondmin = i;

			}
		}
		System.out.println("First Min : " + Firstmin);
		System.out.println("Second Min : " + Secondmin);
	}

	public static void SecondMax(int arr[]) {
		int Firstmax = Integer.MIN_VALUE;
		int Secondmax = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > Firstmax) {
				Secondmax = Firstmax;
				Firstmax = i;
			} else if (i > Secondmax && i!=Firstmax) {
				Secondmax = i;

			}
		}
		System.out.println("First Max : " + Firstmax);
		System.out.println("Second Max : " + Secondmax);
	}

	// third min
	public static void ThirdMin(int arr[]) {
		int Firstmin = Integer.MAX_VALUE;
		int Secondmin = Integer.MAX_VALUE;
		int Thirdmin = Integer.MAX_VALUE;
		for (int i : arr) {
			if (i < Firstmin) {
				Thirdmin = Secondmin;
				Secondmin = Firstmin;
				Firstmin = i;
			} else if (i < Secondmin && i!=Firstmin) {
				Thirdmin = Secondmin;
				Secondmin = i;
			} else if (i < Thirdmin && i!=Firstmin&& i!=Secondmin) {
				Thirdmin = i;

			}

		}
		System.out.println("First Min : " + Firstmin);
		System.out.println("Second Min : " + Secondmin);
		System.out.println("Third  Min : " + Thirdmin);

	}

	public static void ThirdMax(int arr[]) {
		int Firstmax = Integer.MIN_VALUE;
		int Secondmax = Integer.MIN_VALUE;
		int Thirdmax = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > Firstmax) {
				Thirdmax = Secondmax;
				Secondmax = Firstmax;
				Firstmax = i;
			} else if (i > Secondmax && i!=Firstmax) {
				Thirdmax = Secondmax;
				Secondmax = i;
			} else if (i > Thirdmax && i!=Secondmax && i!=Firstmax) {
				Thirdmax = i;

			}

		}
		System.out.println("First Max : " + Firstmax);
		System.out.println("Second Max : " + Secondmax);
		System.out.println("Third  Max : " + Thirdmax);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8,8,8,0,0,0,0,1,2,3,4,5,6,6,7,7,6,5 };
		FirstMin(arr);
		FirstMax(arr);
		System.out.println("**********************************************");
		SecondMin(arr);

		SecondMax(arr);
		System.out.println("**********************************************");
		ThirdMin(arr);
		ThirdMax(arr);

	}

}
 