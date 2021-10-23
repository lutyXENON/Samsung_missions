package hw_2021_10_17;

import java.util.Objects;
import java.util.Scanner;

public class Task_9 {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        System.out.println(Objects.equals(n, reverseString(n)) ? "Yes" : "No");
    }
}
