package com.secondlab.lab2tj.utils;

import com.secondlab.lab2tj.model.Word;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    private final String FILE_NAME = "C:/Users/Eliza/OneDrive/Documents/NetBeansProjects/Lab2TJ/src/main/java/com/secondlab/lab2tj/resources/words.txt";

    public ArrayList<Word> readFile() throws FileNotFoundException {
        ArrayList<Word> words = new ArrayList<Word>();
        File file = new File(FILE_NAME);
        try ( Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                words.add(stringToObject(reader.nextLine()));
            }
        }

        return words;
    }

    public void writeToFile(Word word) throws IOException {
        Files.write(Paths.get(FILE_NAME), (word.getLetters() + "," + word.getSize() + "\n").getBytes(), StandardOpenOption.APPEND);
    }

    private Word stringToObject(String s) {
        Word word = new Word();
        String[] arrOfS = s.split(",");

        word.setLetters(arrOfS[0]);
        word.setSize(Integer.parseInt(arrOfS[1]));

        return word;
    }
}
