package io.swagger.integration;

import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class TestUtil {
    @SneakyThrows
    public static String readFileAndReplaceParams(String fileName, Object... params) {
        File file = getFile(fileName);
        String fileContent = FileUtils.readFileToString(file, StandardCharsets.UTF_8);

        return String.format(fileContent, params);
    }

    @SneakyThrows
    public static String readFile(String fileName) {
        File fileContent = getFile(fileName);
        return FileUtils.readFileToString(fileContent, StandardCharsets.UTF_8);
    }

    public static File getFile(String fileName) {
        ClassLoader classLoader = TestUtil.class.getClassLoader();
        URL resource = classLoader.getResource(fileName);

        return new File(Objects.requireNonNull(resource).getFile());
    }
}
