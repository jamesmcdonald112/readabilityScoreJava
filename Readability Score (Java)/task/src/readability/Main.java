package readability;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        String input = SCANNER.nextLine();

        char[] symbols = input.toCharArray();

        int symbolCount = symbols.length;

        if (symbolCount <= 100) {
            System.out.println("EASY");
        } else {
            System.out.println("HARD");
        }

    }
}
