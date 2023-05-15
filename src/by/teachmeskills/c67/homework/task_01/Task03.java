public class Task03 {
    public static void main(String[] args) {
        int b = 831;
        System.out.println("The number is: " + b);
        System.out.println("The sum of the digits of the number is: " + ((b/100) + ((b%100)/10) + (b%10)));
    }
}
