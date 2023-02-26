package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingEx {
    
    public static void main(String[] args) throws IOException {
        File file = new File("StudyEasy.text");
        file.createNewFile();

        System.out.println("File Created");
    }

}
