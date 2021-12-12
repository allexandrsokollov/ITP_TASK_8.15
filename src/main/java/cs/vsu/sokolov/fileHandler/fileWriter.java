package cs.vsu.sokolov.fileHandler;

import java.io.*;

public class fileWriter {

    String fileName;


    public fileWriter(String fileName) {
        this.fileName = fileName;
    }

    public void writeTwoDimensIntArr (int[][] ints) throws IOException {

        try (FileWriter out = new FileWriter(fileName)) {
            PrintWriter printWriter = new PrintWriter(out);

            StringBuilder str = new StringBuilder();
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    str.append(i);
                    str.append(" ");
                }
                str.append("\n");
            }

            printWriter.print(str);
        }

        System.out.printf("Array has been written to file %s", fileName);
    }


}

