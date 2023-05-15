package by.teachmeskills.c67.homework.task_02;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month:...");
        int m = scanner.nextInt();
        if (m == 1 || m == 2 || m == 12) {
            System.out.println("Winter");
        } else if (m == 3 || m == 4 || m == 5) {
            System.out.println("Spring");
        } else if (m == 6 || m == 7 || m == 8) {
            System.out.println("Summer");
        } else if (m == 9 || m == 10 || m == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Incorrect month!");
        }
    }
}