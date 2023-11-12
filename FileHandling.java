package com.company;

import java.io.File;

public class FileHandling {
    public static void main(String{} args) {

        /*
        File myFile = new File(pathname:"FileHandling.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
        */
    try {
        FileWriter fileWriter = new FileWriter(filename:"FileHandling.txt");
        fileWriter.write(str:"the first file from the java course");
        fileWriter.close();
    } catch (IOException e) {
        e.printStackTrace;
    }
        
    }
    }
}