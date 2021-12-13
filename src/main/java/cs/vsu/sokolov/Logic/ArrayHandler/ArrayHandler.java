package cs.vsu.sokolov.Logic.ArrayHandler;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandler {

    public static int[][] getArrWithoutColsRowsThatContainsSameElements (int[][] array) {

        List<ArrayList<Integer>> rows = new ArrayList<>();
        List<ArrayList<Integer>> columns = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                temp.add(array[i][j]);
            }
            rows.add(new ArrayList<>(temp));
            temp.clear();
        }



        return null;
    }
}
