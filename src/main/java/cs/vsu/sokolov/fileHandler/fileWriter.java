package cs.vsu.sokolov.fileHandler;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileWriter {

    private final String filePath;

    public fileWriter(String filePath) {
        this.filePath = filePath;
    }

    public void writeTwoDimensIntArr (int[][] ints) throws IOException {

        try (FileOutputStream out = new FileOutputStream(filePath)) {

            for (int[] anInt : ints) {
                for (int i : anInt) {
                    out.write((byte) i);
                    out.write((byte) ' ');
                }
                out.write((byte) '\n');
            }
        }

        System.out.printf("Array has been written to file %s", filePath);
    }


}

