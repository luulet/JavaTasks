package org.example;

public class DictionaryController {
    private Dictionary dictionary = new Dictionary();


     public String searchDefinition(String word) {
         String result = dictionary.searchDefinition(word);
            if (result == null) {
                return "Word not found in the dictionary.";
            }
            else {
                return result;
            }
     }

     public void addWord(String word, String definition) {
         dictionary.addWord(word, definition);
     }
}
