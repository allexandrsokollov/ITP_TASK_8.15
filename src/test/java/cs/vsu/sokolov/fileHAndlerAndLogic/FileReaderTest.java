package cs.vsu.sokolov.fileHAndlerAndLogic;

import cs.vsu.sokolov.Logic.fileHandler.MyFileReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class FileReaderTest {

    @Test
    public void readTwoDimensIntArr() {

        int[][] one = new int[][] {
                {1,2,3},
                {1,2,3},
                {1,2,3}
        };

        int[][] two = new int[][] {
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}
        };

        int[][] three = new int[][] {
                {22, 22, 22},
                {123,123,123},
                {1234,1234,1234}
        };

        try {
            Assert.assertArrayEquals(one, MyFileReader.getTwoDimensIntArr("src/main/resources/filesForTest/1.txt"));
            Assert.assertArrayEquals(two, MyFileReader.getTwoDimensIntArr("src/main/resources/filesForTest/2.txt"));
            Assert.assertArrayEquals(three, MyFileReader.getTwoDimensIntArr("src/main/resources/filesForTest/3.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}