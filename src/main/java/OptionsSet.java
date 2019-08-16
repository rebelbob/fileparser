import org.apache.commons.cli.*;

class OptionsSet {

    private static Options options;

    private static String input = null;
    private static String output = null;

    static void setOptions(){
        Option inputFile = Option.builder("i")
                .argName("inpfile")
                .hasArg(true)
                .desc("input filename [reportservice.log]")
                .required(true)
                .build();

        Option outputFile = Option.builder("o")
                .argName("outfile")
                .hasArg(true)
                .desc("output filename [parsedServer.csv]")
                .required(true)
                .build();

        options = new Options();
        options.addOption(inputFile);
        options.addOption(outputFile);
    }

    static void parseOptions(String[] args){
        HelpFormatter formatter = new HelpFormatter();
        CommandLineParser cliParser = new DefaultParser();

        try {
            CommandLine line = cliParser.parse(options, args);

            input = line.getOptionValue("i");
            output = line.getOptionValue("o");
        }
        catch (ParseException exp) {
            formatter.printHelp("rslogparser", options);
        }
    }

    static String getInput(){
        return input;
    }
    static String getOutput(){
        return output;
    }
}
