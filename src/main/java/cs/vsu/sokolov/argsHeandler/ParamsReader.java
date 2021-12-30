package cs.vsu.sokolov.argsHeandler;


public class ParamsReader {

    public static CmdParams parseArgs(String[] args) {
        CmdParams prams = new CmdParams();

        if (args.length < 1) {
            prams.setHelp(true);
            return prams;
        }

        if (args.length < 4) {
            prams.setError(true);
            prams.setHelp(true);
            return prams;
        }
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("--help")) {
                prams.setHelp(true);

                System.out.println("Example input");
                System.out.println("--inputFile src/main/resources/toShow --outputFile src/main/resources/out");
                return prams;
            }

            if (args[i].equals("--inputFile") && (i + 1 != args.length)) {
                i++;
                prams.setInputFile(args[i]);
                continue;
            }

            if (args[i].equals("--outputFile") && (i + 1 != args.length)) {
                i++;
                prams.setOutputFile(args[i]);
                continue;
            }

            if (args[i].equals("--window") && (i + 1 != args.length)) {
                prams.setWindow(true);
            }
        }

        if (prams.getOutputFile() == null || prams.getInputFile() == null) {
            prams.setError(true);
        }
        return prams;
    }


}


