import java.util.ArrayList;
import java.util.List;

class Parser {

    static List<String> parse(List<String> lines){
        List<String> result = new ArrayList<>();
        String[] list = lines.get(0).split(",");
        result.add(list[0] + "," + list[3] + ","
                + list[8] + "," + list[4]);
        for (int i = 1; i < lines.size(); i++) {
            if (!lines.get(i).contains("Remove")) {
                list = lines.get(i).split(",");
                result.add(list[0] + "," + (Float.parseFloat(list[3]) / 1000) + ","
                        + (Float.parseFloat(list[8]) / 1000) + "," + (Float.parseFloat(list[4]) / 1000));
            }
        }
        return result;
    }
}
