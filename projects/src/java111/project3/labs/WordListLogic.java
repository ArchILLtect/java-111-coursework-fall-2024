import java.util.*;
/**
 *  This class contains the logic for the word list app for Lab 9
 *
 *  @author Nick Hanson
 *  - Created on: October 20, 2024
*/

public class WordListLogic {
    
    // Instaniate a word list and a unique word list to hold words
    ArrayList<String> wordList = new ArrayList<String>();
    ArrayList<String> uniqueWords = new ArrayList<String>();

    /**
     *  This method adds a word to word list and also to the unique word list if unique
     *  @param word - string to be added to the list
    */
    public void addWord(String word) {
        wordList.add(word);
        if (!uniqueWords.contains(word)) {
            uniqueWords.add(word);
        };
    };
}
