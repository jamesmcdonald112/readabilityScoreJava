package readability;

import readability.Regex.SentenceRegex;
import readability.Regex.WordRegex;
import readability.calculate.AverageWords;
import readability.io.input.UserInputManager;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Get user input
        String input = UserInputManager.getUserInputString();

        double average = AverageWords.averageWordCount(input);

        if (average <= 10) {
            System.out.println("EASY");
        } else {
            System.out.println("HARD");
        }

        UserInputManager.closeScanner();

    }
}
