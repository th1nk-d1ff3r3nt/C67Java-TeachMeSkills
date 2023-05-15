package by.teachmeskills.c67.homework.task_02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        System.out.println((n % 2 == 0) ? "Number is even!" : "Number is odd!");
    }
}
