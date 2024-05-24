import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class temp {
    public static void main(String[] args) {
        String[] lines = new String[5]; // Array to store the lines

        readLinesFromFile("data.txt", lines); // Read lines from file
        ArrayList<String[]> list = new ArrayList<>();

        // Print each line
        int i = 0;
        for (String line : lines) {
            String[] temp = line.split(", ");
            list.add(temp);
        }

        for (int j = 0; j < list.size(); j++) {
            for (String s : list.get(j)) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    public static void readLinesFromFile(String filename, String[] lines) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int index = 0;
            while ((line = br.readLine()) != null && index < 5) {
                lines[index] = line;
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
