package cs.vsu.sokolov;

import cs.vsu.sokolov.Logic.ArrayHandler.TwoDimensIntArr;
import cs.vsu.sokolov.Logic.fileHandler.MyFileReader;
import cs.vsu.sokolov.Logic.fileHandler.MyFileWriter;
import cs.vsu.sokolov.argsHeandler.CmdParams;
import cs.vsu.sokolov.argsHeandler.ParamsReader;

import java.io.IOException;

public class ConsoleProgram {

    public static void main(String[] args) {
        task(args);
    }

    public static void task(String[] args) {
        CmdParams params = ParamsReader.parseArgs(args);

        if (params.isWindow()) {
            new MainForm();

        } else {

            int[][] arrayToHandle;
            int[][] resultArr;

            try {
                arrayToHandle = MyFileReader.getTwoDimensIntArr(params.getInputFile());
                System.out.println("File has read successfully");

                resultArr = TwoDimensIntArr.getIntArrWithoutSameRowsAndColumns(arrayToHandle);
                System.out.println("array has been reformat successfully ");

                MyFileWriter writer = new MyFileWriter(params.getOutputFile());
                writer.writeTwoDimensIntArr(resultArr);
                System.out.println("File has been written successfully");

            } catch (IOException e) {
                System.out.println("Some problems occurred:");
                System.out.println(e.getMessage());
            }
        }
    }
}
