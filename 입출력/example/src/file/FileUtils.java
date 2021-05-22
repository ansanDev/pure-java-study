package file;

import java.io.*;

public class FileUtils {
    private static final StringBuilder sb = new StringBuilder();

    public static final String EMPTY_STRING = "";
    public static final int INIT_DEPTH = 1;
    public static final int ZERO = 0;
    public static final String CRLF = "\r\n";

    public static String structureFromPath(String path) {
        final File file = new File(path);
        clearString();
        appendFileNameWithRecursive(INIT_DEPTH, file);

        return sb.toString();
    }

    private static void clearString() {
        sb.replace(ZERO, sb.length(), EMPTY_STRING);
    }

    private static void appendFileNameWithRecursive(int depth, File file) {
        if (file.isDirectory()) {
            sb.append(createDepthMark(depth))
                    .append("[").append(file.getName()).append("]")
                    .append(System.lineSeparator());

            final File[] files = file.listFiles();
            assert files != null;
            depth++;
            for (File item : files) {
                appendFileNameWithRecursive(depth, item);
            }
        }
        if (file.isFile()) {
            sb.append(createDepthMark(depth))
                    .append(file.getName())
                    .append(System.lineSeparator());
        }
    }

    private static String createDepthMark(int depth) {
        return "├" + "──".repeat(depth);
    }

    public static void copy(String sourcePath, String targetPath) {
        final File sourceFile = new File(sourcePath);
        validateFile(sourceFile);
        clearString();

        try (final FileReader fr = new FileReader(sourceFile);
             final BufferedReader reader = new BufferedReader(fr);
             final FileWriter writer = new FileWriter(targetPath)) {
            String data;
            String replaced;
            while ((data = reader.readLine()) != null) {
                replaced = data.replaceAll(pickTargetName(sourcePath), pickTargetName(targetPath));
                writer.write(replaced+ CRLF);
            }

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    private static String pickTargetName(String path) {
        return path.substring(path.lastIndexOf("/") + 1, path.lastIndexOf("."));
    }

    private static void validateFile(File sourceFile) {
        if (!sourceFile.exists() || !sourceFile.isFile()) {
            throw new RuntimeException("유효하지 않은 파일입니다.");
        }
    }
}
