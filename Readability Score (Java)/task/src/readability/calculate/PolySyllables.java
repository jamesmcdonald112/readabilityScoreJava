package readability.calculate;

import readability.Regex.WordRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PolySyllables {

    public static int countPolySyllables(String text) {
        String wordRegex = WordRegex.getWordRegex();
        Pattern pattern = Pattern.compile(wordRegex);
        Matcher matcher = pattern.matcher(text);

        int polySyllableCount = 0;

        while (matcher.find()) {
            String word = matcher.group();
            if (Syllables.countSyllables(word) > 2) {
                polySyllableCount++;
            }
        }
        return polySyllableCount;
    }
}
