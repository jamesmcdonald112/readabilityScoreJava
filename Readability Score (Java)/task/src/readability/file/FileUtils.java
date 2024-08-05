package readability.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileUtils {

    /**
     * Reads the content of a file and returns it as a String.
     *
     * @param filePath The path to the file.
     * @return The content of the file as a String.
     * @throws IOException If an I/O error occurs.
     */
    public static String readFileAsString(File filePath) throws IOException {
        StringBuilder fileContent = new StringBuilder();

        try (FileReader fileReader = new FileReader(filePath);
             Scanner scanner = new Scanner(fileReader)) {

            // Reading the file content
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                fileContent.append(line).append(System.lineSeparator());
            }
        }
        return fileContent.toString();
    }
}
