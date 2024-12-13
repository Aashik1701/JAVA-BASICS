import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {

        /*
        File myFile = new File("FileHandling.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
        */
        try {
            FileWriter fileWriter = new FileWriter("FileHandling.txt");
            fileWriter.write("the first file from the java course");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}