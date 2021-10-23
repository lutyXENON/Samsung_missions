package hw_2021_10_17;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int sum = 0;
        while (input != 0) {
            sum += input;
            input = in.nextInt();
        }
        System.out.println((int) Math.sqrt(sum));
    }
}
