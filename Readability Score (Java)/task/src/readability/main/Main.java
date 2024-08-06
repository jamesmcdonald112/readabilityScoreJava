package readability.main;

import readability.commandLine.CommandLineValidator;
import readability.file.FileUtils;
import readability.file.FileValidator;
import readability.io.input.UserInputManager;
import readability.menu.ScoreChoiceMenu;
import readability.text.TextManager;

import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        // Validate that there is an argument passed through the command-line
        if (!CommandLineValidator.isValidArgument(args.length)) {
            System.out.println("Please provide a file path as a command-line argument.");
            return;
        }

        // The Potential file path as a string
        String potentialFilePath = args[0];

        // Validate the potential file path
        if (!FileValidator.isValidFilePath(potentialFilePath)) {
            System.out.println("Invalid file path! Please provide a valid file path");
            return;
        }

        // Actual file
        File filePath = new File(potentialFilePath);
        String fileContent;

        try {
            // Read the file content
            fileContent = FileUtils.readFileAsString(filePath);
        } catch (IOException e) {
            System.err.println("An IOException occurred: " + e.getMessage());
            return;
        }

        // Create a TextManager object with the file content (Stores all info for the text file)
        TextManager textManager
                = new TextManager(fileContent);

        System.out.println("The text is:");
        System.out.println(textManager.getText());
        System.out.println("");

        // Print the text info
        System.out.println("\nWords: " + textManager.getTotalWords());
        System.out.println("Sentences: " + textManager.getTotalSentences());
        System.out.println("Characters: " + textManager.getTotalCharacters());
        System.out.println("Syllables: " + textManager.getTotalSyllables());
        System.out.println("Polysyllables: " + textManager.getPolySyllables());

        ScoreChoiceMenu scoreChoiceMenu = new ScoreChoiceMenu(textManager);
        scoreChoiceMenu.displayMenu();

        UserInputManager.closeScanner();

    }
}
