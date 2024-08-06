package readability.calculate;

import readability.text.TextManager;

public class FleschKincaid {

    public static double calculateFleschKincaidScore(TextManager textManager) {
        double wordsPerSentence = (double) textManager.getTotalWords() / textManager.getTotalSentences();

        double syllablesPerWord = (double) textManager.getTotalSyllables() / textManager.getTotalWords();

        double calculation = 0.39 * wordsPerSentence + 11.8 * syllablesPerWord - 15.59;


        return Math.ceil(calculation * 100.00) / 100.00;
    }
}
