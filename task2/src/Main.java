import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        String jsFile = "data/Detail.controller.js";
        List<String> function = new ArrayList<>();
        System.out.println("Функции с входными параметрами:"+"\n");

        try {
            List<String> lines = Files.readAllLines(Paths.get(jsFile));
            for (String line : lines)
            if(line.contains(": function (")&&line.contains(","))

            {
                function.add(line);

            } for(String functions : function)

            {
                String tmp = (functions.replaceAll(",", ""));
                System.out.println(functions.replace("{", ""));
                System.out.println("Входных параметров: " + (functions.length()-tmp.length() + 1)+"\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}