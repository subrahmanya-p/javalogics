package removeadjacent;
public class FromNumber {
    public static void main(String[] args) {

        int n = 11123456;
        int result = 0;
        int place = 1;

        while (n > 0) {
            int last = n % 10;
            int secondLast = (n / 10) % 10;

            if (last != secondLast || n < 10) {
                result = last * place + result;
                place *= 10;
            }

            n /= 10;
        }

        System.out.println(result);
    }
}