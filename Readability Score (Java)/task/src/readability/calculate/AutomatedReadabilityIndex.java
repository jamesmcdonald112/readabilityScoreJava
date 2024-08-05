package readability.calculate;

import readability.main.Main;

public class AutomatedReadabilityIndex {

    public static double calculateAutomatedReadabilityIndex(int characters, int words,
                                                            int sentences) {

        double charactersPerWord = (double) characters / words;
        double wordsPerSentence = (double) words / sentences;

        double calculation =  4.71 * charactersPerWord + 0.5 * wordsPerSentence - 21.43;

        // Round to two decimal places.
        return Math.ceil(calculation * 100.00) / 100.00;
    }
}
