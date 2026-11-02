package recursion;

public class Main {
	 public static void  print( int n) { 
		 if(n==11) {
			 return;
		 }
		 System.out.println(n);
		 print(n+1);
		
	}
 public static void main(String[] args) {
	 print(1);
	
}
}
