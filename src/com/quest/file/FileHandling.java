package com.quest.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args)  {
        try{
        FileWriter fileWriter=new FileWriter("filewriter.txt");
            fileWriter.write("Hello World");
            fileWriter.append('#');
//            CharSequence charsq=new CharSequence()
            fileWriter.append("hhhhhh",1,6);

            fileWriter.close();
            System.out.println("File written successfully");
    }
        catch(IOException e){
        e.printStackTrace();
        }
    }
}
