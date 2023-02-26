package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
    
    public static void main(String[] args) {
try{
    BufferedReader br =new BufferedReader(new FileReader("team.txt"));
    String line;
    while((line =br.readLine()) != null)
    {
        System.out.println(line);
    }
    
} catch (Exception e) {
    // TODO: handle exception
}
    }
}
