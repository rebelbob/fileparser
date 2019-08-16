import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;

class Writer {

    static void write(List<String> result, String output){
        boolean exists = new File(output).exists();

        if (result.size() > 0) {
            if (exists) {
                System.out.println("Header in output file is not compatible with result.");
                output = "_" + new Random().nextInt() + "_" + output;
                System.out.println("Result will be saved in " + output);
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {
                for (String line : result) {
                    bw.write(line);
                    bw.newLine();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
