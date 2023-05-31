package by.teachmeskills.c67.homework.task_03;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // array creating - start
        System.out.println("Enter array size:");
        int sz = scanner.nextInt();
        if (sz <= 0) {
            System.out.println("Wrong size! Goodbye!");
        }
        int[] arrInt = new int[sz];
        // array filling - start
        System.out.println("\n> ------------------------------- <");
        System.out.println("> - Select array filling option - <");
        System.out.println("> - 1 --- Random -----------------<");
        System.out.println("> - 2 --- Manual -----------------<");
        System.out.println("> ------------------------------- <");
        int optFilling = scanner.nextInt();
        System.out.println();
        if (optFilling == 1) {
            for (int i = 0; i < sz; i++) {
                arrInt[i] = (int) (Math.random() * 10);
                System.out.print(arrInt[i] + " ");
            }
        } else if (optFilling == 2) {
            for (int i = 0; i < sz; i++) {
                arrInt[i] = scanner.nextInt();
            }
            for (int i = 0; i < sz; i++) {
                System.out.print(arrInt[i] + " ");
            }
        } else {
            System.out.println("Wrong option! Goodbye!");
            return;
        }
        // array filling - end / array creating - end
        System.out.println("\n\n> ---------------------------------------- <");
        System.out.println("> - 1 ------ Direct and reverse orders --- <");
        System.out.println("> - 2(3) --- Min/Max elements -------------<");
        System.out.println("> - 3(2) --- Index of Min/Max elements --- <");
        System.out.println("> - 4 ------ Elements equal to '0' ------- <");
        System.out.println("> - 5 ------ First/Last exchange --------- <");
        System.out.println("> - 6 ------ Ascending  sequence --------- <");
        System.out.println("> ---------------------------------------- <");
        int optInteraction = scanner.nextInt();
        if (optInteraction == 1) {
            System.out.println("Direct order:");
            for (int i = 0; i < sz; i++) {
                System.out.print(arrInt[i] + " ");
            }
            System.out.println("\nReverse order:");
            for (int i = (sz - 1); i >= 0; i--) {
                System.out.print(arrInt[i] + " ");
            }
        } else if ((optInteraction == 2) || (optInteraction == 3)) {
            int min = arrInt[0];
            int max = arrInt[0];
            for (int i = 1; i < sz; i++) {
                if (arrInt[i] < min) {
                    min = arrInt[i];
                } else if (arrInt[i] > max) {
                    max = arrInt[i];
                }
            }
            System.out.println("\nMinimum element is " + min);
            System.out.println("Maximum element is " + max);
            System.out.println("\nIndex(-es) of element(-s) equal MIN:");
            for (int i = 0; i < sz; i++) {
                if (arrInt[i] == min) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("\nIndex(-es) of element(-s) equal MAX:");
            for (int i = 0; i < sz; i++) {
                if (arrInt[i] == max) {
                    System.out.print(i + " ");
                }
            }
        } else if (optInteraction == 4) {
            int zeroAmount = 0;
            for (int i = 0; i < sz; i++) {
                if (arrInt[i] == 0) {
                    zeroAmount += 1;
                }
            }
            System.out.println((zeroAmount == 0) ? "Zero elements missing!" : ("Number of zero elements: " + zeroAmount));
        } else if (optInteraction == 5) {
            for (int i = 0; i < (sz / 2); i++) {
                int tmp = arrInt[i];
                arrInt[i] = arrInt[(sz - 1) - i];
                arrInt[(sz - 1) - i] = tmp;
            }
            for (int i = 0; i < sz; i++) {
                System.out.print(arrInt[i] + " ");
            }
        } else if (optInteraction == 6) {
            boolean z = true;
            for (int i = 1; i < sz; i++) {
                if (arrInt[i] < arrInt[i - 1]) {
                    z = false;
                    break;
                }
            }
            System.out.println((z) ? "Array - increasing sequence!" : "Array - non-increasing sequence!");
        } else {
            System.out.println("Wrong option! Goodbye!");
        }
    }
}