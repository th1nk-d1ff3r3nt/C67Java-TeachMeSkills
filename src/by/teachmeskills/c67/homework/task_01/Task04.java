public class Task04 {
    public static void main(String[] args) {
        /*double n = 568.47;
        System.out.println("The number is: " + n);
        double ni = ((((n * 100) % 100) < 50) ? (((n * 100) - (n * 100) % 100)/100) : ((((n * 100) + 100) - ((n * 100) + 100) % 100)/100));
        System.out.println("The nearest integer is: " + ni);*/
        double n = 123.51;
        int m = (int) n;
        double res = (m - n) * (-1);
        //System.out.println(res);
        double ni = (res < 0.50) ? m : (m + 1);
        System.out.println((int) ni);
    }
}
