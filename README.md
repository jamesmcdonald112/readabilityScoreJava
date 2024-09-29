## Readability Score
A Java program that calculates various readability scores for a given text file.

## Features
Calculates the following readability indices:
- Automated Readability Index (ARI)
- Flesch-Kincaid Readability Score (FK)
- Simple Measure of Gobbledygook (SMOG) Index
- Coleman-Liau Index (CL)

## Analyses text to provide:
- Total words
- Total sentences
- Total characters
- Total syllables
- Total polysyllables (words with more than two syllables)
- Estimates the average age required to understand the text.

## How to Run
Compile the Code:

Navigate to the project directory and compile all Java files:

```bash
cd readabilityScoreJava/Readability\ Score\ \(Java\)/task/src 
javac readability/main/Main.java 
```

## Run the Program:
Provide the path to the text file as a command-line argument:

```bash
java readability.main.Main path/to/textfile.txt
```

## Select a Readability Score:

When prompted, enter one of the following options:

- ARI to calculate the Automated Readability Index
- FK for the Flesch-Kincaid Readability Score
- SMOG for the Simple Measure of Gobbledygook Index
- CL for the Coleman-Liau Index
- all to calculate all scores and get the average age

## Example
```bash
java readability.main.Main sample.txt
```

### Sample Output:

```bash
The text is:
Your text content...

Words: 100
Sentences: 5
Characters: 500
Syllables: 150
Polysyllables: 10

Enter the score you want to calculate (ARI, FK, SMOG, CL, all):
all
Automated Readability Index: 7.5 (about 12-year-olds)
Flesch-Kincaid Score: 6.8 (about 11-year-olds)
Simple Measure of Gobbledygook: 8.2 (about 13-year-olds)
Coleman-Liau Index: 7.0 (about 12-year-olds)
This text should be understood in average by 12.0-year-olds.
```

## Project Structure
- readability.main.Main: Entry point of the application.
- readability.text.TextManager: Manages text analysis and properties.
- readability.calculate.*: Contains classes for calculating readability scores and text metrics.
- readability.menu.ScoreChoiceMenu: Handles user interaction for score selection.
- readability.io.input.UserInputManager: Manages user input.
- readability.file.FileUtils: Utility class for file operations.
- readability.Regex.*: Contains regex patterns used for parsing text.



Working on the Readability Analyser was a valuable experience that reinforced the importance of planning and modular design. 
By breaking the project into smaller components—like text parsing and calculating different readability scores—I was able to make the code more organised and manageable. 
This approach not only improved my Java skills but also deepened my understanding of how readability formulas work. 
Overall, it was a rewarding project that will help me in future endeavors.






