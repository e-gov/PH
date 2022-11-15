package ee.paasuke;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtil {
    public static String getFileContent(String directory, String filename) {

        try {
            return String.join("\n",Files.readAllLines(Paths.get(directory, filename), StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
