package readability.text;

import readability.Regex.SentenceRegex;
import readability.Regex.WordRegex;
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

    public static String ageGroupCalculation(double score) {
        int roundedScore = (int)(Math.ceil(score));

        System.out.println(roundedScore);
        switch (roundedScore) {
            case 1 -> {
                return "5-6";
            }
            case 2 -> {
                return "6-7";
            }
            case 3-> {
                return "7-8";
            }
            case 4 -> {
                return "8-9";
            }
            case 5 -> {
                return "9-10";
            }
            case 6 -> {
                return "10-11";
            }
            case 7 -> {
                return "11-12";
            }
            case 8 -> {
                return "12-13";
            }
            case 9 -> {
                return "13-14";
            }
            case 10 -> {
                return "14-15";
            }
            case 11 -> {
                return "15-16";
            }
            case 12 -> {
                return "16-17";
            }
            case 13 -> {
                return "17-18";
            } case 14 -> {
                return "18-22";
            }
            default -> {
                return "18+";
            }
        }

    }
}
