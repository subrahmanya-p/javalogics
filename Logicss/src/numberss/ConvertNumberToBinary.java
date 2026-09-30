package numberss;

public class ConvertNumberToBinary {
	public static void main(String[] args) {
		int n = 9;
		String reString="";
		 while (n!=0) {
			 int rem=n%2;
			 reString=rem+reString;
			 n/=2;
			
		}
		 System.out.println(reString);
	}

}
