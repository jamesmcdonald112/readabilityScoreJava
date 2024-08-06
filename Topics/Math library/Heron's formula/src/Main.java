import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        double p = (double)(a + b + c) /2;

        double calculation = Math.sqrt(p * (p - a) * (p - b) * (p -c));
        System.out.println(calculation);
    }
}