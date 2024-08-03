package readability.Regex;

public class WordRegex {
    // INSTANCE VARIABLES
    private static String wordRegex = "[a-zA-Z0-9]+";

    // GETTERS AND SETTERS


    public static String getWordRegex() {
        return wordRegex;
    }

    public static void setWordRegex(String wordRegex) {
        WordRegex.wordRegex = wordRegex;
    }
}
