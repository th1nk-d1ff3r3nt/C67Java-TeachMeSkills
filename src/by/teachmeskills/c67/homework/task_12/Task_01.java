package by.teachmeskills.c67.homework.task_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_01 {
    private static String findABBR(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("^[A-Z]{2,6}$");
        for (String value : strArr) {
            Matcher matcher = pattern.matcher(value);
            if (matcher.matches()) {
                sb.append(value);
                sb.append(" ");
            } else {
                sb.append("No abbreviations found!");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = scanner.nextLine();
        String[] strArr = str.split(" ");
        System.out.println("Found abbreviations: " + findABBR(strArr));
    }
}
