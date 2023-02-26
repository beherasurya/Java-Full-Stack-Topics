package FileHandling;

import java.io.File;

public class FileDirectory {
    public static void main(String[] args) {
        File directory =new File("Created using Java");
        directory.mkdirs();
        System.out.println("Directory Created");
    }
}
