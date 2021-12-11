package cs.vsu.sokolov;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class ParamsReaderTest {

    @org.junit.Test
    public void parseArgs() {

        String[][] params = new String[][] {
                {"--help", "--input"},
                {"--inputFile", "./inputFilePath", "--outputFile", "./outputFilePath"},
                {"--outputFile", "./outputFilePath", "--inputFile", "./inputFilePath"},
                {},
                {"--outputFile", "/outputFilePath"},
                {"--inputFile", "./inputFilePath"},
                {"", "", "", ""}
        };

        List<CmdParams> cmdParamsList = new ArrayList<>();
        cmdParamsList.add(new CmdParams(true, true));
        cmdParamsList.add(new CmdParams(false, false, "./inputFilePath", "./outputFilePath"));
        cmdParamsList.add(new CmdParams(false, false, "./inputFilePath", "./outputFilePath"));
        cmdParamsList.add(new CmdParams(true, false));
        cmdParamsList.add(new CmdParams(true, true, null, null));
        cmdParamsList.add(new CmdParams(true, true, null, null));
        cmdParamsList.add(new CmdParams(false, true, null, null));

        for (int i = 0; i < cmdParamsList.size(); i++) {
            System.out.println("expected:");
            System.out.println(cmdParamsList.get(i).toString());
            System.out.println("actual");
            System.out.println(ParamsReader.parseArgs(params[i]));

            Assert.assertEquals(cmdParamsList.get(i), ParamsReader.parseArgs(params[i]));
        }

    }
}