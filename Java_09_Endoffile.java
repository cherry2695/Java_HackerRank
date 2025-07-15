import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_09_Endoffile {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int lineNumber=1;
        while(scr.hasNextLine()){
            String line=scr.nextLine();
            System.out.println(lineNumber+ " "+line);
            lineNumber++;
        }
        scr.close();
    }
}