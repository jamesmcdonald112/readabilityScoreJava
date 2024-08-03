package readability.io.input;

import java.util.Scanner;

public class UserInputManager {
    // INSTANCE VARIABLES
    private static Scanner SCANNER = new Scanner(System.in);

    /**
     * Returns the user input as a string.
     *
     * @return The user input as a string.
     */
    public static String getUserInputString() {
        return SCANNER.nextLine();
    }

    /**
     * Closes the scanner.
     */
    public static void closeScanner() {
        SCANNER.close();
    }
}
