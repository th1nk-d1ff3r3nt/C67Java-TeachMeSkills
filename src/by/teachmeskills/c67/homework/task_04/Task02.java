package by.teachmeskills.c67.homework.task_04;

import java.util.Random;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter number of rows:");
        int rowNum = scanner.nextInt();
        System.out.println("Enter number of columns:");
        int colNum = scanner.nextInt();
        int[][] arrInt = new int[rowNum][colNum];
        System.out.println("\nArray");
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                arrInt[i][j] = (random.nextInt() / 1000000);
                if (arrInt[i][j] < 0) {
                    arrInt[i][j] *= (-1);
                }
            }
        }
        for (int[] arrIntRow : arrInt) {
            for (int rowElement : arrIntRow) {
                System.out.print(rowElement + " ");
            }
            System.out.println();
        }
        System.out.println("\nEnter a number to add to each array element:...");
        int extraNum = scanner.nextInt();
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                arrInt[i][j] += extraNum;
            }
        }
        System.out.println("\nArray + Extra Number");
        for (int[] arrIntRow : arrInt) {
            for (int rowElement : arrIntRow) {
                System.out.print(rowElement + " ");
            }
            System.out.println();
        }
        System.out.println("\nChess Board");
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("W ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }
    }
}
