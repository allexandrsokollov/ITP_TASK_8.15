package cs.vsu.sokolov.Logic.fileHandler;

import java.io.*;

public class MyFileWriter {

    String fileName;


    public MyFileWriter(String fileName) {
        this.fileName = fileName;
    }

    public void writeTwoDimensIntArr (int[][] ints) throws IOException {

        if (ints == null) {
            System.out.println("there is nothing to write");
            return;
        }

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

