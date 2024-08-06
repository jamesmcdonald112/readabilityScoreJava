package readability.calculate;

import readability.Regex.VowelsRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Syllables {

    public static int countSyllables(String word) {
        word = word.toLowerCase(); // Convert word to lower case for consistency
        String vowelsRegex = VowelsRegex.getVowels();
        Pattern pattern = Pattern.compile(vowelsRegex);

        int syllableCount = 0;
        boolean lastWasVowel = false; // flag to keep track of double vowels

        // Iterate over the word
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            Matcher matcher = pattern.matcher(String.valueOf(currentChar));
            boolean isVowel = matcher.matches();

            // If the current character is a vowel
            if (isVowel) {
                // Check the previous character was not a vowel
                if (!lastWasVowel) {
                    if (i == word.length() - 1 && currentChar == 'e' && syllableCount > 0) {
                        // Skip counting the last 'e'
                        continue;
                    }
                    syllableCount++;
                    lastWasVowel = true;
                }
            } else {
                lastWasVowel = false;
            }
        }



        // if no vowels were found, consider it one syllable
        if (syllableCount == 0) {
            syllableCount = 1;
        }
        return syllableCount;
    }
}