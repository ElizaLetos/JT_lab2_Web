package com.secondlab.lab2tj.utils;

import com.secondlab.lab2tj.model.Word;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class FileOperations {
    
    private FileHandler fileHandler = new FileHandler();

    public void addWordToFile(Word word) throws IOException {
        fileHandler.writeToFile(word);
    }

    public ArrayList<Word> getWordsFromFile() throws FileNotFoundException {
        return fileHandler.readFile();
    }
}
