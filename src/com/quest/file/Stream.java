package com.quest.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("filewriter.txt");
            System.out.println("file is created successfully");
            int c;
            String str="Input as streams";
            FileOutputStream fos = new FileOutputStream("filewriter.txt");
//            fos.write(fis.read()); //byte array a special character
            fos.write(str.getBytes());//Used
//            System.out.println(fis.read());

            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
            fis.close();
            fos.close();
            System.out.println("\nfileStream is closed successfully");
    }catch(FileNotFoundException e){
        e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
