package cs.vsu.sokolov.Logic.ArrayHandler;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoDimensIntArrTest {

    @Test
    public void getIntArrWithoutSameRowsAndColumns() {
        int[][] toTest = new int[][] {
                {1,1,1,1,1},
                {1,2,3,4,5},
                {1,5,4,3,2}
        };

        int[][] expected = new int[][] {
                {2,3,4,5},
                {5,4,3,2}
        };

        int[][] actual = TwoDimensIntArr.getIntArrWithoutSameRowsAndColumns(toTest);

        Assert.assertArrayEquals(expected, actual);

    }

}