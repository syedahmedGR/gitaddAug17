package keywords;

import java.io.*;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) throws FileNotFoundException {


        PrintWriter printWriter = new PrintWriter("");
        printWriter.print("ge fdsff");


        Scanner stdin = new Scanner(new File("/Users/syedahmed/IdeaProjects/HelloWorld/src/keywords/fileforscanner.txt"));
        String line1 = "";

        line1 = stdin.nextLine();

        System.out.println(line1);

    }
}
