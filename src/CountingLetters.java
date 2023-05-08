import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;

public class CountingLetters {
    public static void main(String[] args) throws IOException {

        Map m1 = new HashMap();
        //Opens file in read mode
        //Reads each line
        try (BufferedReader br = new BufferedReader(new FileReader("src/text.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                String[] words = line.split("");//those are your words
                for (int i = 0; i < words.length; i++) {
                    if (m1.get(words[i]) == null) {
                        m1.put(words[i], 1);
                    } else {
                        int newValue = Integer.valueOf(String.valueOf(m1.get(words[i])));
                        newValue++;
                        m1.put(words[i], newValue);
                    }
                }
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(sb);
            }
        }

        // Select most frequent used letter and count
        Object freq = Collections.max(m1.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.print("Most frequent word:" + " '"+ freq + "' x "+ m1.get(freq) + ". \n");

        // Create string with all the different words in the file
        Map<String, String> sorted = new TreeMap<String, String>(m1);
        // Print complete overview of different words and their counts
        for (Object key : sorted.keySet()) {
            System.out.println("Word: " + key + "\tCounts: " + m1.get(key));
        }
    }
}

//import java.io.BufferedReader;
//        import java.io.File;
//        import java.io.FileInputStream;
//        import java.io.FileNotFoundException;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//
//public class CountingLetters {
//
//    private static final String FILE_PATH = "src/text.txt";
//    public static void main(String args[]) throws IOException {
//        FileUtil fileUtil = new FileUtil(FILE_PATH);
//        System.out.println("No. of characters in file: " + fileUtil.getCharCount());
//
//    }
//}
//
//class FileUtil {
//    static BufferedReader reader = null;
//    public FileUtil(String filePath) throws FileNotFoundException {
//        File file = new File(filePath);
//        FileInputStream fileStream = new FileInputStream(file);
//        InputStreamReader input = new InputStreamReader(fileStream);
//        reader = new BufferedReader(input);
//    }
//
//    public static int getCharCount() throws IOException {
//        int charCount = 0;
//        String data;
//        while((data = reader.readLine()) != null) {
//            charCount += data.length() -1;
//            System.out.println(data);
//        }
//        return charCount;
//    }
//}