package cs.vsu.sokolov.Logic.fileHandler;

import cs.vsu.sokolov.util.ArrayUtils;

import java.io.*;

public class MyFileReader {

    public static int[][] getTwoDimensIntArr(String filePath) throws IOException {

        int[][] toRet = ArrayUtils.readIntArray2FromFile(filePath);

        if (toRet == null) {
            return null;
        }
        if (toRet.length < 1 ) {
            return null;
        }
        return toRet;
    }
}