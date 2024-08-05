package readability.file;

import java.io.File;

public class FileValidator {

    /**
     * Checks if the file exists and is a file.
     *
     * @param filePath The path to check
     * @return True if the path is a file and exists; false otherwise
     */
    public static boolean isValidFilePath(String filePath) {
        File path = new File(filePath);
        return (path.exists()) && (path.isFile());
    }
}
