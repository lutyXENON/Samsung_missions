import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max11 = 0;
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            if (input % 100 == 11 && input > max11)
                max11 = input;
        }
        System.out.println(max11);
    }
}
