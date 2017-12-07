package ie.tcd.cs3102;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        final int NUMWORDS = 235886;
        //final int NUMWORDS = 100000;
        final String FILENAME = "shuffled.txt";

        Timer t;

        t = new Timer();
        String[] words = readWords(FILENAME, NUMWORDS);
        System.err.println("Loaded in: " + t.duration() + "ms");

        /*
        t = new Timer();
        SelectionSort.sort(words);
        System.err.println("Sorted in: " + t.duration() + "ms");
        */


        t = new Timer();
        String[] letters = new String[]{"a", "d", "c", "e", "i", "k", "f", "j"};
        MergeSort.sort(letters);
        System.err.println("Sorted in: " + t.duration() + "ms");

    }

    // Helper: Read the words list from a file into a string array
    private static String[] readWords(String filename, int count) {
        String[] words = new String[count];

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int i = 0;
            for (String line; (line = br.readLine()) != null && i < count;) {
                words[i++] = line;
            }
        } catch (java.io.IOException e) {
            System.err.println("File: " + filename + " could not be found.");
        }

        return words;
    }
}
