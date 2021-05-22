package file;

import java.io.File;

public class App {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        System.out.println(FileUtils.structureFromPath("./"));


        FileUtils.copy("./example/src/file/Apple.java", "./example/src/file/Orange.java");
        final File orangeFile = new File("./example/src/file/Orange.java");

        System.out.println("오렌지클래스 생성여부: "+ orangeFile.exists());
    }

}
