package com.quest.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PractiseStreams {
    public static void main(String[] args) {
        try {
            File newFile = new File("newFile.txt");
            if (newFile.createNewFile() || newFile.exists()) {
                System.out.println("File Created");
            } else {
                System.out.println("File Not Created");
            }
            FileOutputStream fileOutputStream = new FileOutputStream(newFile, true);
            fileOutputStream.write("\nHappy\nHuman\nGoodLuck".getBytes());
            fileOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream(newFile);
            int c;
            while ((c=fileInputStream.read())!=-1){
                System.out.print((char)c);
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
