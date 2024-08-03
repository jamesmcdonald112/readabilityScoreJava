package readability.Regex;

public class SentenceRegex {
    // INSTANCE VARIABLES
    private static String sentenceRegex ="[.?!]";

    // GETTERS AND SETTERS
    public static String getSentenceRegex() {
        return sentenceRegex;
    }

    public static void setSentenceRegex(String sentenceRegex) {
        SentenceRegex.sentenceRegex = sentenceRegex;
    }
}
