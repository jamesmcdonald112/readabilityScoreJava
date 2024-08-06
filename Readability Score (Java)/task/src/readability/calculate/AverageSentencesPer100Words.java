package readability.calculate;

import readability.text.TextManager;

public class AverageSentencesPer100Words {

    public static double calculateAverageSentencesPer100Words(TextManager textManager) {
        double totalWords = textManager.getTotalWords();
        double totalSentences = textManager.getTotalSentences();

        if (totalWords == 0) {
            return 0; // avoid division by zero
        }

        double averageSentencesPerWord = totalSentences / totalWords;

        // Scale to 100
        double averageSentencesPer100Words = averageSentencesPerWord * 100;

        return averageSentencesPer100Words;
    }
}
