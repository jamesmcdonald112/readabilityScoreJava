package readability.text;

import readability.Regex.SentenceRegex;
import readability.Regex.WordRegex;
import readability.calculate.Syllables;
import readability.text.TextManager;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProperties {

    public static double averageWordCount(String text) {
        // Create regex for sentence end and for defining words.
        String sentenceRegex = SentenceRegex.getSentenceRegex();

        // Split test into sentences
        String[] sentences = text.split(sentenceRegex);

        // Define word pattern
        Pattern wordPattern = Pattern.compile(WordRegex.getWordRegex());

        // Total sentences and total words
        int totalSentences = sentences.length;
        int totalWords = 0;

        // Count each word in each sentence
        for (String sentence : sentences) {
            // create matcher object for each sentence to find words that match the pattern.
            Matcher matcher = wordPattern.matcher(sentence);

            // when a match is found, total words increase.
            while (matcher.find()) {
                totalWords++;
            }
        }

        return (double) totalWords / totalSentences;
    }

    public static int wordCount(String text) {
        // Clean the text
        String cleanedText = text.replaceAll("[',]", "");

        // Prepare the mather with the regex on the cleaned text
        String wordRegex = WordRegex.getWordRegex();
        Pattern pattern = Pattern.compile(wordRegex);
        Matcher matcher = pattern.matcher(cleanedText);

        int totalWords = 0;
        while (matcher.find()) {
            totalWords++;
        }
        return totalWords;
    }

    public static int characterCount(String text) {
        int count = 0;
        for (Character character : text.toCharArray()) {
            if (!Character.isWhitespace(character)) {
                count++;
            }
        }
        return count;
    }

    public static int sentenceCount(String text) {
        String sentenceRegex = SentenceRegex.getSentenceRegex();
        String[] sentences = text.trim().split(sentenceRegex);

        return sentences.length;
    }

    public static int syllableCount(String text) {
        // Clean the text
        String cleanedText = text.replaceAll("[',]", "");

        // Prepare the mather with the regex on the cleaned text
        String wordRegex = WordRegex.getWordRegex();
        Pattern pattern = Pattern.compile(wordRegex);
        Matcher matcher = pattern.matcher(cleanedText);

        int totalSyllables = 0;

        while (matcher.find()) {
            String word = matcher.group();
            totalSyllables += Syllables.countSyllables(word);
        }

        return totalSyllables;
    }

    public static String ageGroupCalculation(double score) {
        int roundedScore = (int) (Math.ceil(score));
        return switch (roundedScore) {
            case 1 -> "6";
            case 2 -> "7";
            case 3 -> "8";
            case 4 -> "9";
            case 5 -> "10";
            case 6 -> "11";
            case 7 -> "12";
            case 8 -> "13";
            case 9 -> "14";
            case 10 -> "15";
            case 11 -> "16";
            case 12 -> "17";
            case 13 -> "18";
            case 14 -> "22";
            default -> "18+";
        };
    }
}
