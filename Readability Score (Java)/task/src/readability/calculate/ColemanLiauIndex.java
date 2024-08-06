package readability.calculate;

import readability.text.TextManager;

public class ColemanLiauIndex {

    public static double calculateColemanLiauIndex(TextManager textManager) {
        double avgCharactersPer100Words = AvgCharactersPer100Words.calculateAvgCharactersPer100Words(textManager);
        double avgSentencesPer100Words =
                AverageSentencesPer100Words.calculateAverageSentencesPer100Words(textManager);

        double score = 0.0588 * avgCharactersPer100Words - 0.296 * avgSentencesPer100Words - 15.8;


        return Math.ceil(score * 100.00) / 100.00;
    }
}
