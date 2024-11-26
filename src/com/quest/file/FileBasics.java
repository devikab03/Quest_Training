package com.quest.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileBasics {
    public static void main(String[] args) {
        File file = new File("file1.txt");
        try {
            System.out.println("Try Started");
            if (file.exists()) {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    System.out.println(line);
                }
                sc.close();
                System.out.println("File is created successfully");
            } else {
                System.out.println("File does not exist");
            }
            System.out.println("Try ended");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            file.delete();
            System.out.println("File deleted successfully");
        }

//        file.delete();


//       sc.close();
//            if(file.exists())
      /* if(file.exists()){
             System.out.println("File exists:"+file.getPath());
         }else{
             System.out.println("File not exists");
         }
    }
    }*/
    }
}

