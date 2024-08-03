package readability.calculate;

import readability.Regex.SentenceRegex;
import readability.Regex.WordRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AverageWords {

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
        for(String sentence : sentences) {
            // create matcher object for each sentence to find words that match the pattern.
            Matcher matcher = wordPattern.matcher(sentence);

            // when a match is found, total words increase.
            while (matcher.find()) {
                totalWords++;
            }
        }

        return (double) totalWords / totalSentences;
    }
}
