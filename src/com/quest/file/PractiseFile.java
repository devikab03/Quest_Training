package com.quest.file;

import java.io.File;
import java.io.IOException;

public class PractiseFile {
    public static void main(String[] args) {

        File file = new File("sample.txt");
        try {
            System.out.println("Try Started");
            if (file.createNewFile() || file.exists()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
            System.out.println("Try Ended");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            file.delete();
            System.out.println("File deleted");
        }
    }
}
