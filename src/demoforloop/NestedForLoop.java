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

        for (int i = 1; i <= numbOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

