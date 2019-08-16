import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class Reader {

    static List<String> read(String input){
        Path filePath = Paths.get(input);

        List<String> lines = null;
        try {
            lines = Files.readAllLines(filePath, Charset.defaultCharset());
        } catch (IOException e){
            e.printStackTrace();
        }
        return lines;
    }
}
