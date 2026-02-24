package org.example;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionary = new HashMap<>();

    public Dictionary() {
        dictionary.put("java", "a high-level programming language");
        dictionary.put("python", "a high-level programming language that emphasizes readability");
        dictionary.put("javascript", "a programming language used for web development");
    }

    public void addWord(String word, String definition) {
        this.dictionary.put(word, definition);
    }
    public String searchDefinition(String word) {
        return this.dictionary.get(word);
    }


}
