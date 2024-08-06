package readability.calculate;

import readability.main.Main;
import readability.text.TextManager;

public class AutomatedReadabilityIndex {

    public static double calculateAutomatedReadabilityIndex(TextManager textManager) {

        double charactersPerWord = (double) textManager.getTotalCharacters() / textManager.getTotalWords();
        double wordsPerSentence = (double) textManager.getTotalWords() / textManager.getTotalSentences();

        double calculation =  4.71 * charactersPerWord + 0.5 * wordsPerSentence - 21.43;

        // Round to two decimal places.
        return Math.ceil(calculation * 100.00) / 100.00;
    }
}
