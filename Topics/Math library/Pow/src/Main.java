import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);

        double a = s.nextDouble();
        double b = s.nextDouble();

        System.out.println(Math.pow(a, b));
    }
}