package hw_2021_10_17;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
