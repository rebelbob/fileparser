import java.util.List;

public class Main {

    public static void main(String[] args) {

        OptionsSet.setOptions();
        OptionsSet.parseOptions(args);

        List<String> lines = Reader.read(OptionsSet.getInput());
        lines = Parser.parse(lines);
        Writer.write(lines, OptionsSet.getOutput());
    }
}