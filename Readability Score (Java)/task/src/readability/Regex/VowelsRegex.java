package readability.Regex;

public class VowelsRegex {

    private static String vowels = "[aeiouyAEIOUY]+";

    public static String getVowels() {
        return vowels;
    }

    public static void setVowels(String vowels) {
        VowelsRegex.vowels = vowels;
    }
}
