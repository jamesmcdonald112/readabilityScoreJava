package readability.calculate;

import readability.text.TextManager;

public class SMOGIndex {

    public static double calculateSMOGIndex(TextManager textManager) {
        double polysyllables = textManager.getPolySyllables();
        double sentencesValue = (double) 30 / textManager.getTotalSentences();

        double calculation = 1.043 * (Math.sqrt(polysyllables * sentencesValue)) + 3.1291;

        return (Math.ceil(calculation * 100.00)) / 100.00;
    }
}
