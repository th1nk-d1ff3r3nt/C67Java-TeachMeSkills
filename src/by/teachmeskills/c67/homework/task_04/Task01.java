package by.teachmeskills.c67.homework.task_04;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("----- 1 -----");
        Random random = new Random();
        int[][] arrInt = new int[5][5];
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                arrInt[i][j] = (random.nextInt() / 100000);
                if (arrInt[i][j] < 0) {
                    arrInt[i][j] = Math.abs(arrInt[i][j]);
                }
                System.out.print(arrInt[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n----- 2 -----");
        int max = arrInt[0][0];
        for (int[] arrIntRow : arrInt) {
            for (int rowElement : arrIntRow) {
                if (rowElement > max) {
                    max = rowElement;
                }
            }
        }
        System.out.println("MAX = " + max);
        System.out.println("\n----- 3 -----");
        int arrMainDiag = 0;
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                if (i == j) {
                    arrMainDiag += arrInt[i][j];
                }
            }
        }
        System.out.println("SUM (main diagonal) = " + arrMainDiag);
        int arrSideDiag = 0;
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = (arrInt[i].length - 1); j >= 0; j--) {
                if ((i + j) == (arrInt.length - 1)) {
                    arrSideDiag += arrInt[i][j];
                }
            }
        }
        System.out.println("SUM (side diagonal) = " + arrSideDiag);
        System.out.println("\n----- 4 -----");
        int[][] arrRag = new int[5][];
        arrRag[0] = new int[]{4, 15, 8, 1, 20};
        arrRag[1] = new int[]{3, 8, 11};
        arrRag[2] = new int[]{0, 5};
        arrRag[3] = new int[]{7, 8, 21, 93, 4, 61};
        arrRag[4] = new int[]{9, 3, 4};
        for (int[] arrRagRow : arrRag) {
            for (int rowElement : arrRagRow) {
                System.out.print(rowElement + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int[] arrRagRow : arrRag) {
            sum += arrRagRow.length;
        }
        System.out.println("\nAmount of elements = " + sum);
        System.out.println("-------------------------");
    }
}
