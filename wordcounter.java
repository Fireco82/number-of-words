import java.io.FileWriter; import java.io.IOException; import java.util.HashMap; import java.util.Map;
import java.io.BufferedReader;
import java.io.BufferedWriter; import java.io.FileReader;
public class wordcounter {
    public static void main(String[] args) {
        try {
           
            Map<String, Integer> wordCounts = new HashMap<>();

            
                BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
{}
           
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words based on spaces
                     String[] words = line.toLowerCase().split(" ");

                
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }

            
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

           
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                writer.write(entry.getKey() + " " + entry.getValue());
                writer.newLine();
            }

           
            writer.close();

            
            
                System.out.println("number of word to the  output.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
