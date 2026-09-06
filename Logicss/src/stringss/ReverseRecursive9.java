package stringss;

public class ReverseRecursive9 {  
 
    // Recursive method to reverse a string  
    public static String reverseString(String str) {  
        // Base case: empty string or single character  
        if (str == null || str.isEmpty() || str.length() == 1) {  
            return str;  
        }  
 
        // Recursive case: last character + reverse(substring)  
        char lastChar = str.charAt(str.length() - 1);  
        String substring = str.substring(0, str.length() - 1);  
        return lastChar + reverseString(substring);  
    }  
 
    public static void main(String[] args) {  
        // Test cases  
       
 
   
    }  
}  