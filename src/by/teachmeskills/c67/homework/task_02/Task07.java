package by.teachmeskills.c67.homework.task_02;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int numb = scanner.nextInt();
        if (numb < 1) {
            System.out.println("Wrong number!");
        } else {
            int sum = 0;
            for (int i = 1; i <= numb; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
