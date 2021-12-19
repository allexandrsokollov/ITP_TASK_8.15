package cs.vsu.sokolov.Logic.ArrayHandler;

import java.util.ArrayList;
import java.util.List;

public class TwoDimensIntArr {


    public static int[][] getIntArrWithoutSameRowsAndColumns(int[][] arr) {

        if (arr == null) {
            return null;
        }
        int[][] tempArr = arr;

        boolean[] rowsToDelete = getIndexesToDelete(tempArr);
        tempArr = transposeMatrix(tempArr);
        boolean[] columnsToDelete = getIndexesToDelete(tempArr);
        tempArr = transposeMatrix(tempArr);

        return removeElementsFromListViaBoolArr(rowsToDelete, columnsToDelete, tempArr);
    }


    private static int[][]  removeElementsFromListViaBoolArr(boolean[] rowsToDelete, boolean[] columnsToDelete, int[][] arr) {
        List<ArrayList<Integer>> tempInts = intArr2ToListOfLists(arr);
        int rowsAmount = tempInts.size();

        for (int i = 0, j = 0; i < rowsAmount; i++, j++) {

            if (rowsToDelete[j]) {
                tempInts.remove(i);
                i--;
                rowsAmount--;
            }
        }

        for (int k = 0; k < rowsAmount; k++) {
            int colsAmount = tempInts.get(k).size();
            for (int i = 0, j = 0; i < colsAmount; i++, j++) {

                if (columnsToDelete[j]) {
                    tempInts.get(k).remove(i);
                    i--;
                    colsAmount--;
                }
            }
        }

        int[][] result = null;

        if (tempInts.size() > 0) {

            result = new int[tempInts.size()][tempInts.get(0).size()];

            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    result[i][j] = tempInts.get(i).get(j);
                }
            }
        }

        return result;
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

    private static boolean[] getIndexesToDelete (int[][] arr) {
        boolean[] IndexesToDelete = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            IndexesToDelete[i] = true;
            for (int j = 1; j < arr[i].length; j++) {

                if (arr[i][j] != arr[i][j - 1]) {
                    IndexesToDelete[i] = false;
                }
            }
        }

        return IndexesToDelete;
    }

    private static ArrayList<ArrayList<Integer>> intArr2ToListOfLists(int[][] arr) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(new ArrayList<>());

            for (int j = 0; j < arr[i].length; j++) {
                list.get(i).add(arr[i][j]);
            }
        }

        return list;
    }

}
