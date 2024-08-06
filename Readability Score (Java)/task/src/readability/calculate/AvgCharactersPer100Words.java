package readability.calculate;

import readability.text.TextManager;

public class AvgCharactersPer100Words {

    public static double calculateAvgCharactersPer100Words(TextManager textManager) {
        int totalCharacters = textManager.getTotalCharacters();
        int totalWords = textManager.getTotalWords();

        if (totalWords == 0) {
            return 0; // avoid division by zero if there are no words
        }

        double averageCharactersPerWord = (double) totalCharacters / totalWords;

        // Scale to 100 words
        double avgCharactersPer100Words = averageCharactersPerWord * 100;

        return avgCharactersPer100Words;
    }
}
