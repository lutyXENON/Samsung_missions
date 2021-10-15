import java.util.Scanner;

public class misson2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0, min = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            if (i == 0) {
                max = input;
                min = input;
            }
            if (input > max)
                max = input;
            if (input < min)
                min = input;
            sum += input;
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("SrAr: " + sum / n);
    }
}
