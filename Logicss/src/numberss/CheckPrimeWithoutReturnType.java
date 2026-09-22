package numberss;

public class CheckPrimeWithoutReturnType {
	public static void isPrime(int n) {
		boolean flag =true;
		if (n <= 1) {
		flag=	 false;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % 2 == 0) {
					flag= false;

				}
			}
			flag= true;
		}
if (flag) {
	System.out.println("It  is a Prime Number");
} else {

	System.out.println("It  is not  a Prime Number");
}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
isPrime(5);
	}

}
