package cs.vsu.sokolov.fileHandler;

import util.ArrayUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class fileReader {

    public static int[][] getTwoDimensIntArr(String filePath) throws IOException {

        return ArrayUtils.readIntArray2FromFile(filePath);

    }
}
/*   List<String> str = new ArrayList<>();

        StringBuilder temp = new StringBuilder();

        while (temp = reader.) {
        char ch = (char) reader.read();
        temp.append((String.valueOf(ch)));

        if (ch == '\n') {
        str.add(new String(temp));
        temp.replace(0, temp.length(), "");
        }
        }

        String[] toReturn = new String[str.size()];

        for (int i = 0; i < str.size(); i++) {
        toReturn[i] = str.get(i);
        }
        return ArrayUtils.toIntArray2(toReturn);*/