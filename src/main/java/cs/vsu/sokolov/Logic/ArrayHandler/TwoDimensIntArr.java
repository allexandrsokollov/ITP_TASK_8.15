package cs.vsu.sokolov.Logic.ArrayHandler;

import java.util.ArrayList;
import java.util.List;

public class TwoDimensIntArr {


    public static int[][] getIntArrWithoutSameRowsAndColumns(int[][] arr) {

        if (arr == null) {
            return null;
        }

        if (arr.length == 1 || arr[0].length == 1) {return arr;}

        int[][] temp = getIntArrWithoutSameRows(arr);

        if (temp == null) {
            return null;
        }

        if (temp.length == 1) {return temp;}
        int[][] transposed = transposeMatrix(temp);
        int[][] tempTransposed = getIntArrWithoutSameRows(transposed);

        if (tempTransposed == null) {
            return null;
        }

        int[][] result = transposeMatrix(tempTransposed);

        boolean isThereSmthng = false;
        boolean[] check = whichElemToDelete(result);
        boolean[] check2 = whichElemToDelete(transposeMatrix(result));

        for (boolean i : check) {
            if (i) {
                isThereSmthng = true;
                break;
            }
        }

        for (boolean i : check2) {
            if (i) {
                isThereSmthng = true;
                break;
            }
        }

        if (isThereSmthng) {
            result = getIntArrWithoutSameRowsAndColumns(result);
        }
        return result;
    }



    private static int[][] getIntArrWithoutSameRows(int[][] arr) {

        boolean[] whatToDelete = whichElemToDelete(arr);
        ArrayList<ArrayList<Integer>> tempInts = intArr2ToListOfLists(arr);

        removeElementsFromListViaBoolArr(whatToDelete, tempInts);

        if (tempInts.size() < 1) {
            return null;
        }

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

    private static boolean[] whichElemToDelete (int[][] arr) {
        boolean[] whatToDelete = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            whatToDelete[i] = true;
            for (int j = 1; j < arr[i].length; j++) {

                if (arr[i][j] != arr[i][j - 1]) {
                    whatToDelete[i] = false;
                }
            }
        }

        return whatToDelete;
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
