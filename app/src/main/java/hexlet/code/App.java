package hexlet.code;

import jdk.jfr.Description;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.File;
import java.math.BigInteger;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.util.concurrent.Callable;


@Command(name = "gendiff", mixinStandardHelpOptions = true, version = "0.1",
        description = //"Usage: gendiff [-hV]\n" +
                "Compares two configuration files and shows a difference.")
public class App implements Callable<Integer> {
    //    public static void main(String[] args) {
    //        System.out.println("Hello World!");
    //    }

    @Option(names = {"-h", "--help"}, usageHelp = true, description = "Show this help message and exit.")
    private boolean helpRequested = false;

    @Option(names = {"-f", "--format"}, description = "output format [default: stylish]")
    private String format = "stylish";

    @Parameters(index = "0", description = "path to first file") String filepath1;
    @Parameters(index = "1", description = "path to second file") String filepath2;

    @Option(names = {"-V", "--version"}, description = "Print version information and exit.")
    private boolean versionRequested = false;

    @Override
    public Integer call() throws Exception {
        //Debug
        System.out.println("h = " + helpRequested + "| V = " + versionRequested);

        return 0;
    }

    public static void main(String... args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }
}

