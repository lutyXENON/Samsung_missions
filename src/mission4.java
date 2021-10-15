import java.util.Scanner;

public class mission4 {
    public static int digits_in_number(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return ((int) Math.pow(10, count));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        String ans = "";
        while (input != 0) {
            Integer str = input / digits_in_number(input);
            ans += str.toString();
            input = in.nextInt();
        }
        System.out.println(ans);
    }
}
