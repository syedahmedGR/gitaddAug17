package arraymafi;

import java.util.Scanner;

public class UserArray {

    public static void main(String[] args) {

        int [] studentId = new int[10];

        Scanner stdin = new Scanner(System.in);
        // take input
        System.out.println("Enter student id : ");
        for( int i=0; i< studentId.length; i++){
            studentId[i] = stdin.nextInt();
        }

        // output
        for( int i=0; i< studentId.length; i++){
            System.out.println( "Your student id" + "["+ i + "]:" + studentId[i] );
        }
    }


}
