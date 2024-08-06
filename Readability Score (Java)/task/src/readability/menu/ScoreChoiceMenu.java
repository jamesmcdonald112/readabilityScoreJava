package readability.menu;

import readability.calculate.AutomatedReadabilityIndex;
import readability.calculate.ColemanLiauIndex;
import readability.calculate.FleschKincaid;
import readability.calculate.SMOGIndex;
import readability.io.input.UserInputManager;
import readability.text.TextManager;
import readability.text.TextProperties;

public class ScoreChoiceMenu {

    private TextManager textManager;

    public ScoreChoiceMenu(TextManager textManager) {
        this.textManager = textManager;
    }

    public void displayMenu() {
        System.out.println("Enter the score you want to calculate (ARI, FK, SMOG, CL, all):");
        String input = UserInputManager.getUserInputString();
        switch (input.toLowerCase()) {
            case "ari" -> calculateAndPrintARI();
            case "fk" -> calculateAndPrintFK();
            case "smog" -> calculateAndPrintSmog();
            case "cl" -> calculateAndPrintCL();
            case "all" -> calculateAndPrintAll();
            default -> System.out.println("Please select an option from the menu");
        }
    }

    private void calculateAndPrintARI() {
        double ari = AutomatedReadabilityIndex.calculateAutomatedReadabilityIndex(this.textManager);
        String ageGroup = TextProperties.ageGroupCalculation(ari);
        System.out.println("Automated Readability Index: " + ari + " (about " + ageGroup +
                "-year-olds)");
    }

    private void calculateAndPrintFK() {
        double fk = FleschKincaid.calculateFleschKincaidScore(this.textManager);
        String ageGroup = TextProperties.ageGroupCalculation(fk);
        System.out.println("Flesch-Kincaid Score: " + fk + " (about " + ageGroup + "-year-olds)");
    }

    private void calculateAndPrintSmog() {
        double smog = SMOGIndex.calculateSMOGIndex(this.textManager);
        String ageGroup = TextProperties.ageGroupCalculation(smog);
        System.out.println("Simple Measure of Gobbledygook: " + smog + " (about " + ageGroup + "-year-olds)");
    }

    private void calculateAndPrintCL() {
        double cl = ColemanLiauIndex.calculateColemanLiauIndex(this.textManager);
        String ageGroup = TextProperties.ageGroupCalculation(cl);
        System.out.println("Coleman-Liau Index: " + cl + " (about " + ageGroup + "-year-olds)");
    }

    private void calculateAndPrintAll() {
        calculateAndPrintARI();
        calculateAndPrintFK();
        calculateAndPrintSmog();
        calculateAndPrintCL();
        double avg = averageReadingAge();
        System.out.println("This text should be understood in average by " + avg + "-year-olds.");
    }

    private double averageReadingAge() {
        double ari = AutomatedReadabilityIndex.calculateAutomatedReadabilityIndex(this.textManager);
        double fk = FleschKincaid.calculateFleschKincaidScore(this.textManager);
        double smog = SMOGIndex.calculateSMOGIndex(this.textManager);
        double cl = ColemanLiauIndex.calculateColemanLiauIndex(this.textManager);

        return (mapScoreToAge(ari) + mapScoreToAge(fk) + mapScoreToAge(smog) + mapScoreToAge(cl)) / 4.0;
    }

    private double mapScoreToAge(double score) {
        int roundedScore = (int) Math.ceil(score);
        return switch (roundedScore) {
            case 1 -> 6;
            case 2 -> 7;
            case 3 -> 8;
            case 4 -> 9;
            case 5 -> 10;
            case 6 -> 11;
            case 7 -> 12;
            case 8 -> 13;
            case 9 -> 14;
            case 10 -> 15;
            case 11 -> 16;
            case 12 -> 17;
            case 13 -> 18;
            case 14 -> 22;
            default -> 18;
        };
    }

}
