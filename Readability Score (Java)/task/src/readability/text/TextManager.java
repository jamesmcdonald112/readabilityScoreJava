package readability.text;

import readability.calculate.AutomatedReadabilityIndex;
import readability.calculate.FleschKincaid;
import readability.calculate.PolySyllables;

public class TextManager {

    // INSTANCE VARIABLES
    private String text;
    private int totalCharacters;
    private int totalSyllables;
    private int polySyllables;
    private int totalWords;
    private int totalSentences;

    // CONSTRUCTOR
    public TextManager(String text) {
        this.text = text;

        // Initialise the rest through calculations
        initialiseValues();
    }


    // GETTERS & SETTERS
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getTotalCharacters() {
        return totalCharacters;
    }

    public void setTotalCharacters(int totalCharacters) {
        this.totalCharacters = totalCharacters;
    }

    public int getTotalSyllables() {
        return totalSyllables;
    }

    public void setTotalSyllables(int totalSyllables) {
        this.totalSyllables = totalSyllables;
    }

    public int getPolySyllables() {
        return polySyllables;
    }

    public void setPolySyllables(int polySyllables) {
        this.polySyllables = polySyllables;
    }

    public int getTotalWords() {
        return totalWords;
    }

    public void setTotalWords(int totalWords) {
        this.totalWords = totalWords;
    }

    public int getTotalSentences() {
        return totalSentences;
    }

    public void setTotalSentences(int totalSentences) {
        this.totalSentences = totalSentences;
    }

    private void initialiseValues() {
        this.totalCharacters = TextProperties.characterCount(this.text);
        this.totalSyllables = TextProperties.syllableCount(this.text);
        this.totalWords = TextProperties.wordCount(this.text);
        this.totalSentences =  TextProperties.sentenceCount(this.text);
        this.polySyllables = PolySyllables.countPolySyllables(this.text);
    }


}
