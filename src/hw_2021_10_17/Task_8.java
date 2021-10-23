package hw_2021_10_17;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = n;
        for (int i = 2; i < sqrt(b); i++) {
            if (n % i == 0) {
                System.out.print(i + "*");
                n /= i;
            }
        }
    }
}
