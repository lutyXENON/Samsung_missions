import java.util.Scanner;

public class Task_5 {
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
        int n = in.nextInt();
        String ans = "";
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            Integer str = input / (digits_in_number(input) - 1);
            ans += str.toString();
        }
        System.out.println(ans);
    }
}
