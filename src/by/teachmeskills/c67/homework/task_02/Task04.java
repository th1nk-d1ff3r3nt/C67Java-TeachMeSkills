package by.teachmeskills.c67.homework.task_02;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature value:");
        int t = scanner.nextInt();
        if (t > (-5) && (t < 55)) {
            System.out.println("Warm!");
        } else if ((t <= (-5)) && (t > (-20))) {
            System.out.println("Normal!");
        } else if (t < (-20) && (t > (-70))) {
            System.out.println("Cold!");
        } else {
            System.out.println("R.I.P.");
        }
    }
}
