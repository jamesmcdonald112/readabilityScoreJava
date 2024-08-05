package readability.text;

import readability.calculate.AutomatedReadabilityIndex;

public class TextManager {

    // INSTANCE VARIABLES
    private String text;
    private int totalCharacters;
    private int totalWords;
    private int totalSentences;
    private double score;
    private String ageGroup;

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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }


    private void initialiseValues() {
        this.totalCharacters = TextProperties.characterCount(this.text);
        this.totalWords = TextProperties.wordCount(this.text);
        this.totalSentences =  TextProperties.sentenceCount(this.text);
        this.score = AutomatedReadabilityIndex.calculateAutomatedReadabilityIndex(totalCharacters
                , totalWords, totalSentences);
        this.ageGroup = TextProperties.ageGroupCalculation(score);
    }


}
