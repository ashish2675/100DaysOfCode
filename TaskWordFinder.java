import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

class WordFinder {

    public List words;


    public WordFinder (String dictionaryFileName) {
        // 1. Read File and store all words in a list in lowercase



        // 2.
    }
    public String longestWord (String word) {
        if(!words.isEmpty()){

        }

        return null;
    }
}

public class TaskWordFinder {
    public static void main (String[] args) {
        String fileName = args[0];
        String key = args[1];

        if(fileName != null && !fileName.isBlank() && key != null && !key.isBlank()) {
            WordFinder wf = new WordFinder(fileName);
            String longest = wf.longestWord(key);
        }
    }
}
