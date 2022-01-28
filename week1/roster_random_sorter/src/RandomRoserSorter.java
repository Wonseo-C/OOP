import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class RandomRoserSorter {
    public static void main(String[] argv) throws IOException{
        File file = new File("roster.txt");
        FileReader fr = new FileReader(file);
        try (BufferedReader br = new BufferedReader(fr)) {
            ArrayList<String> list = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null ) {
                list.add(line);
            }

            Collections.shuffle(list);
            for (String student : list) {
                System.out.println(student);
            }
        }
    }
}
