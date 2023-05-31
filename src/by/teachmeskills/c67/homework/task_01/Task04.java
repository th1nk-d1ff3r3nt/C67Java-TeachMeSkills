package by.teachmeskills.c67.homework.task_01;

public class Task04 {
    public static void main(String[] args) {
        double n = 1.43;
        System.out.println("Your number is: " + n);
        double res = (n - ((int) n));
        double ni = (res < 0.50) ? ((int) n) : (((int) n) + 1);
        System.out.println("Nearest integer is: " + (int) ni);
    }
}
