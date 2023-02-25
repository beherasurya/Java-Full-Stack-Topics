package Array;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int intVariable[] ={10,20,30,40,50};
        System.out.println(intVariable);

        intVariable =new int[10];
        intVariable[5] =10;

        intVariable[9]=99;
        System.out.println(Arrays.toString(intVariable));

        float [] floatVariableArray ={1.0f,2.0f,3.0f};
        System.out.println(floatVariableArray[1]);

        String [] stringArray = {"chaand","john","pooja","mia","salim"};

        for(String arrayNames:stringArray)
        {
            System.out.println(arrayNames);
        }
    }
}
