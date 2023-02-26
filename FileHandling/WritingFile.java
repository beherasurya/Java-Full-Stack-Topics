package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {
    public static void main(String[] args) {
        

        File file =new File("studyeasy");
        file.mkdir();

        file= new File("team.txt");
        try {
            file.createNewFile();
            System.out.println("File created");
        } catch (IOException e) {
            // TODO Auto-generated catch block

            System.out.println("error occured while creating the file");
        }
        try(BufferedWriter br =new BufferedWriter(new FileWriter(file))) {
            br.write("Chaand");
            br.write("Saam");
            br.write("Arjun");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error occured while writing file");
        }
    }
}
