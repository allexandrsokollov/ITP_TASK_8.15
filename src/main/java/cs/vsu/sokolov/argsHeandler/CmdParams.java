package cs.vsu.sokolov.argsHeandler;

import java.util.Objects;

public class CmdParams {
    private boolean help;
    private boolean error;
    private boolean window;
    private String inputFile;
    private String outputFile;

    public CmdParams() {
    }

    public CmdParams(boolean help, boolean error) {
        this.help = help;
        this.error = error;
    }

    public CmdParams(boolean help, boolean error, boolean window, String inputFile, String outputFile) {
        this.help = help;
        this.error = error;
        this.window = window;
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    public boolean isHelp() {
        return help;
    }

    public void setHelp(boolean help) {
        this.help = help;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public boolean isWindow() {
        return window;
    }

    public void setWindow(boolean window) {
        this.window = window;
    }

    public String getInputFile() {
        return inputFile;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(String outputFile) {
        this.outputFile = outputFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CmdParams cmdParams)) return false;
        return help == cmdParams.help && error == cmdParams.error && Objects.equals(inputFile, cmdParams.inputFile) && Objects.equals(outputFile, cmdParams.outputFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(help, error, inputFile, outputFile);
    }

    @Override
    public String toString() {
        return "CmdParams{" +
                "help=" + help +
                ", error=" + error +
                ", inputFile='" + inputFile + '\'' +
                ", outputFile='" + outputFile + '\'' +
                '}';
    }
}
