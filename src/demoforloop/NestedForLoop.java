package demoforloop;

import java.util.Scanner;

public class NestedForLoop {

    public static void main(String[] args) {

        // have the user enter how many rows they want
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5

        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int numbOfRows = stdin.nextInt();
/*
        for (int i = 1; i <= numbOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        } */

        /*
        for (int i = 0; i <= numbOfRows; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print( "* " );
            }
            System.out.println();
        } */

        // outer loop to handle number of rows
        //  n in this case
        for (int i=0; i<numbOfRows; i++)
        {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=numbOfRows-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }

}

