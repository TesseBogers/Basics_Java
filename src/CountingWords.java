package org.becode.examples.TextOps;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.HashMap;
import java.util.Scanner; // Import the Scanner class to read text files

public class CountingWords {
    public static void main(String[] args) {
        String filePath = "src/text.txt";
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            Integer wordcount = 0;
            while (scanner.hasNext()) {
                String cleanText = scanner.next();
                String[] splitText = cleanText.split("\\s+");
                for (String word : splitText) {
                    if (!word.isEmpty()) {
                        wordcount++;
                        if (map.containsKey(word)) {
                            int freqOfWord = map.get(word);
                            map.put(word, freqOfWord++);
                        } else {
                            map.put(word, 1);
                        }
                    }
                }
            }
            scanner.close();
            String mostFreqWord = "";
            int highestFreq=0;
            for(String word : map.keySet()) {
                int freqInArr = map.get(word);
                System.out.println(word+": "+freqInArr);
                if(freqInArr>highestFreq) {
                    highestFreq=freqInArr;
                    mostFreqWord=word;
                }
            }
            System.out.println(wordcount);
            System.out.println(mostFreqWord+", "+highestFreq);

        } catch (FileNotFoundException ex) {
            System.out.println("SHUT UP");
        }
    }
}

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.TreeMap;
//import java.util.*;
//
//public class CountingWords {
//
//    public static void main(String[] args) throws IOException {
//
//        HashMap m1 = new HashMap();
//        //Opens file in read mode
//        //Reads each line
//        try (BufferedReader br = new BufferedReader(new FileReader("src/text.txt"))) {
//            StringBuilder sb = new StringBuilder();
//            String line = br.readLine();
//
//            while (line != null) {
//                String[] words = line.split(" ");//those are your words
//                for (int i = 0; i < words.length; i++) {
//                    System.out.println(words.length);
//
//                    if (m1.get(words[i]) == null) {
//                        m1.put(words[i], 1);
//                    } else {
//                        int newValue = Integer.valueOf(String.valueOf(m1.get(words[i])));
//                        newValue++;
//                        m1.put(words[i], newValue);
//                    }
//
//                }
//                sb.append(System.lineSeparator());
//                line = br.readLine();
//                System.out.println(sb);
//            }
//        }
//        // Select most frequent used word and count
//        Object freq = Collections.max(m1.entrySet(), Map.Entry.comparingByValue()).getKey();
//        System.out.print("Most frequent word: " + " '"+ freq + "' "+ m1.get(freq) + "x .");
//
//        // Create string with all the different words in the file
//        Map<String, String> sorted = new TreeMap<String, String>(m1);
//        // Print complete overview of different words and their counts
//        for (Object key : sorted.keySet()) {
//            System.out.println("Word: " + key + "\tCounts: " + m1.get(key));
//        }
//    }
//}
