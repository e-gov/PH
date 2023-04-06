package ee.paasuke;

import org.apache.commons.io.FileUtils;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtil {
    public static String getFileContent(String directory, String filename) {


        try {
            File file = ResourceUtils.getFile(directory + "/" + filename);
            return FileUtils.readFileToString(file, "UTF-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
