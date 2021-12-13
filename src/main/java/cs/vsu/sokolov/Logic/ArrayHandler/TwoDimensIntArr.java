package cs.vsu.sokolov.Logic.ArrayHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TwoDimensIntArr {


    public static int[][] getIntArrWithoutSameRowsAndColumns(int[][] arr) {
        return getIntArrWithOutSameColumns(getIntArrWithoutSameRows(arr));
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


    private static int[][] getIntArrWithOutSameColumns(int[][] arr) {
        boolean[] whatToDelete = new boolean[arr[0].length];
        List<ArrayList<Integer>> tempInts = new ArrayList<>();

        for (int i = 0; i < arr[i].length; i++) {
            tempInts.add(new ArrayList<>());
            whatToDelete[i] = true;

            for (int j = 1; j < arr.length; j++) {
                tempInts.get(i).add(arr[j - 1][i]);

                if (arr[j][i] != arr[j - 1][i]) {
                    whatToDelete[i] = false;
                }

                if (j == arr.length - 1) {
                    tempInts.get(i).add(arr[i][j]);
                }
            }
        }

        removeElementsFromListViaBoolArr(whatToDelete, tempInts);

        int[][] toRet = new int[tempInts.size()][tempInts.get(0).size()];

        for (int i = 0; i < toRet[i].length; i++) {
            for (int j = 0; j < toRet.length; j++) {
                toRet[j][i] = tempInts.get(j).get(i);
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

}
