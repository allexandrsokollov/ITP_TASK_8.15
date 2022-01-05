//package cs.vsu.sokolov;
//
//import cs.vsu.sokolov.Logic.fileHandler.MyFileReader;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.io.FileReader;
//import java.io.IOException;
//
//import static org.junit.Assert.*;
//
//public class ConsoleProgramTest {
//
//    @Test
//    public void task() throws IOException {
//
////        String[] args = new String[4];
////                args[0] = "--inputFile";
////                args[1] = "src/main/resources/filesToTestTask/1.txt";
////                args[2] = "--outputFile";
////                args[3] = "src/main/resources/filesToTestTask/out1.txt";
////
////        ConsoleProgram.task(args);
////        assertNull(MyFileReader.getTwoDimensIntArr("src/main/resources/filesToTestTask/out1.txt"));
////
////
////
////        int[][] expected2 = new int[][] {{2}};
////        String[] args2 = new String[4];
////        args2[0] = "--inputFile";
////        args2[1] = "src/main/resources/filesToTestTask/2.txt";
////        args2[2] = "--outputFile";
////        args2[3] = "src/main/resources/filesToTestTask/out2.txt";
////
////        ConsoleProgram.task(args2);
////        Assert.assertArrayEquals(expected2,
////                MyFileReader.getTwoDimensIntArr("src/main/resources/filesToTestTask/out2.txt"));
////
////
////
////        String[] args3 = new String[4];
////        args3[0] = "--inputFile";
////        args3[1] = "src/main/resources/filesToTestTask/3.txt";
////        args3[2] = "--outputFile";
////        args3[3] = "src/main/resources/filesToTestTask/out3.txt";
////
////        ConsoleProgram.task(args3);
////        assertNull(
////                MyFileReader.getTwoDimensIntArr("src/main/resources/filesToTestTask/out3.txt"));
////
////
////        String[] args4 = new String[4];
////        args4[0] = "--inputFile";
////        args4[1] = "src/main/resources/filesToTestTask/4.txt";
////        args4[2] = "--outputFile";
////        args4[3] = "src/main/resources/filesToTestTask/out4.txt";
////
////        ConsoleProgram.task(args4);
////        assertNull(
////                MyFileReader.getTwoDimensIntArr("src/main/resources/filesToTestTask/out4.txt"));
//
//        int[][] expected5 = new int[][] {{1, 2},{1, 2},{1, 2},{2, 2}};
//        String[] args5 = new String[4];
//        args5[0] = "--inputFile";
//        args5[1] = "src/main/resources/filesToTestTask/5.txt";
//        args5[2] = "--outputFile";
//        args5[3] = "src/main/resources/filesToTestTask/out5.txt";
//
//        ConsoleProgram.task(args5);
//        Assert.assertArrayEquals(expected5,
//                MyFileReader.getTwoDimensIntArr("src/main/resources/filesToTestTask/out5.txt"));
//       }
//}