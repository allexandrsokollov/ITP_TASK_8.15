package cs.vsu.sokolov.Logic.ArrayHandler;

import java.util.ArrayList;
import java.util.List;

public class TwoDimensIntArr {


    public static int[][] getIntArrWithoutSameRowsAndColumns(int[][] arr) {

        int[][] temp = getIntArrWithoutSameRows(arr);
        int[][] transposed = transposeMatrix(temp);
        int[][] tempTransposed = getIntArrWithoutSameRows(transposed);

        return transposeMatrix(tempTransposed);
    }

    private static int[][] getIntArrWithoutSameRows(int[][] arr) {

        boolean[] whatToDelete = new boolean[arr.length];
        List<ArrayList<Integer>> tempInts = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            whatToDelete[i] = true;
            tempInts.add(new ArrayList<>());

            for (int j = 1; j < arr[i].length; j++) {
                tempInts.get(i).add(arr[i][j - 1]);

                if (arr[i][j] != arr[i][j - 1]) {
                    whatToDelete[i] = false;
                }

                if (j == arr[i].length - 1) {
                    tempInts.get(i).add(arr[i][j]);
                }
            }
        }

        removeElementsFromListViaBoolArr(whatToDelete, tempInts);


        int[][] toRet = new int[tempInts.size()][tempInts.get(0).size()];

        for (int i = 0; i < tempInts.size(); i++) {
            for (int j = 0; j < tempInts.get(i).size(); j++) {
                toRet[i][j] = tempInts.get(i).get(j);
            }
        }


        return toRet;
    }

    private static void  removeElementsFromListViaBoolArr(boolean[] whatToDelete, List<ArrayList<Integer>> tempInts) {
        int listLength = tempInts.size();

        for (int i = 0, j = 0; i < listLength; i++, j++) {

            if (whatToDelete[j]) {
                tempInts.remove(i);
                i--;
                listLength--;
            }
        }
    }

    private static int[][] transposeMatrix(int[][] arr) {

        int[][] toRet = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                 toRet[j][i] = arr[i][j];
            }
        }

        return toRet;
    }

}
