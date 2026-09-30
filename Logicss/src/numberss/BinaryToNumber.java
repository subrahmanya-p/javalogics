package numberss;

public class BinaryToNumber {

    public static void main(String[] args) {

        String binaryNum = "1101";
        int sum = 0;

        for (int i = 0; i < binaryNum.length(); i++) {
            sum = sum * 2 + (binaryNum.charAt(i) - '0');
        }

        System.out.println(sum);
    }
}